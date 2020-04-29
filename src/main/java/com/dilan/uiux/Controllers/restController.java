package com.dilan.uiux.Controllers;

import com.dilan.uiux.Services.UserService;
import com.dilan.uiux.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: Dilan Salinda
 * Date: 2020-04-29
 * Time: 10:22 PM
 */
@RestController
public class restController {

    @Autowired
    UserService userService;

    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }

    @PostMapping("addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);
    }
}
