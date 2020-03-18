package mwe.test;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import mwe.UserRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {

  @Autowired
  UserRepository userRepository;

  @Test
  public void initialTest() throws Exception {

    userRepository.findById(1).block();

  }

}
