package com.paf.sellandbuy.controllers;

import com.paf.sellandbuy.domain.UserDTO;
import com.paf.sellandbuy.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO Userdata){
        return userServices.saveuser(Userdata);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserData){
        return userServices.updateUser(newUserData);
    }

    @GetMapping("/find/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Integer id){
        return userServices.findUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userServices.deleteUser(id);
    }
}
