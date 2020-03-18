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

    System.out.println("test");

    System.out.println(userRepository.findById(99).block());

    userRepository.findById(99);

    assertThat(userRepository.findById(99).block().toString(), is("asdf"));

    assertThat(false, is(true));

  }

}
