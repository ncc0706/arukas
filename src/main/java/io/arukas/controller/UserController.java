package io.arukas.controller;

import io.arukas.entity.User;
import io.arukas.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 20/06/2017.
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUser(){
       return new ResponseEntity<>( (List<User>)userService.findAll(), HttpStatus.OK);
    }

//    @PostMapping(value = "/users")
//    public ResponseEntity<User> addUser(User user){
//        return new ResponseEntity<User>(userRepository.save(user), HttpStatus.CREATED);
//    }

    /**
     * 注意: @RequestBody 需要接收json字符串
     * @param user
     * @return
     */
    @PostMapping(value = "/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.save(user), HttpStatus.CREATED);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> findUserById(@PathVariable("id") Long id){
        return new ResponseEntity<User>(userService.findOne(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.deleteUserById(id);
        return new ResponseEntity<Object>("delete successful", HttpStatus.OK);
    }

    @PutMapping(value = "/users")
    public ResponseEntity<User> updateUserById(@RequestBody User user){
        return new ResponseEntity<User>(userService.update(user), HttpStatus.OK);
    }

    @GetMapping(value = "/users/username")
    public ResponseEntity<User> findUserByUsername(@RequestParam("username") String username){
        return new ResponseEntity<User>(userService.findUserByUsername(username), HttpStatus.OK);
    }

}
