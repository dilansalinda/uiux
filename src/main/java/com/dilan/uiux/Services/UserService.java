package com.dilan.uiux.Services;

import com.dilan.uiux.Repositories.UserRepository;
import com.dilan.uiux.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Dilan Salinda
 * Date: 2020-04-29
 * Time: 10:27 PM
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
