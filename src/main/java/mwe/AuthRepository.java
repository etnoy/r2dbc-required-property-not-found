package mwe;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends ReactiveCrudRepository<Auth, Integer> {

}
