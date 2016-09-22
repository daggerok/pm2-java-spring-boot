package daggerok.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.stream.Stream;

@RepositoryRestResource
public interface UserRestResource extends MongoRepository<User, String> {
    Stream<User> findAllByUsername(@Param("username") final String username);
}
