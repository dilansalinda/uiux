package com.dilan.uiux;

import com.dilan.uiux.Repositories.UserRepository;
import com.dilan.uiux.entities.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UiuxApplication {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UiuxApplication.class, args);
    }


    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            userRepository.save(new User("d", "d", "d", "d"));
            userRepository.save(new User("a", "a", "a", "a"));
            userRepository.save(new User("f", "f", "f", "f"));
            userRepository.save(new User("w", "w", "w", "w"));
        };
    }
}


