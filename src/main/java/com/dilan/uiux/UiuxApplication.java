package com.dilan.uiux;

import com.dilan.uiux.Services.UserService;
import com.dilan.uiux.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class UiuxApplication {

    public static void main(String[] args) {

        UserService userService = new UserService();
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1L);
        user1.setEmail("dilansalinda@mail.com");
        user1.setFull_name("Dilan Salinda");
        user1.setUsername("dilansalinda");

        User user2 = new User();
        user2.setId(2L);
        user2.setEmail("samankumara@mail.com");
        user2.setFull_name("Saman Kumara");
        user2.setUsername("samankumara");

        users.add(user1);
        users.add(user2);
        for (User u : users) {
            userService.saveUser(u);
        }
        SpringApplication.run(UiuxApplication.class, args);
    }

}
