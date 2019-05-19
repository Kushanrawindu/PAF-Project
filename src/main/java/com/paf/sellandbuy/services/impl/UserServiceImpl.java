package com.paf.sellandbuy.services.impl;

import com.paf.sellandbuy.domain.UserDTO;
import com.paf.sellandbuy.repositories.UserRepository;
import com.paf.sellandbuy.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        List<UserDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveuser(UserDTO userdata) {
        userRepository.save(userdata);
        return "Data Saved";
    }

    @Override
    public String updateUser(UserDTO newUserData){
        String msg = null;

        if(newUserData.getId() != null){
            userRepository.save(newUserData);
            msg = "Data Updated";
        }
        else{
            msg = "Error";
        }
        return msg;
    }

    @Override
    public Optional<UserDTO> findUserById(Integer id){
        return userRepository.findById(id);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
