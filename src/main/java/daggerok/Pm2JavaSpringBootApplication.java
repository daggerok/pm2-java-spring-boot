package daggerok;

import daggerok.domain.User;
import daggerok.domain.UserRestResource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Pm2JavaSpringBootApplication {

    @Bean public CommandLineRunner runner(final UserRestResource userRestResource) {

        return args -> Stream.of("max", "xxx")
                .map(name -> new User().setUsername(name))
                .forEach(userRestResource::save);
    }

    public static void main(String[] args) {
        SpringApplication.run(Pm2JavaSpringBootApplication.class, args);
    }
}
