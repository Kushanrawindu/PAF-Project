package com.paf.sellandbuy.services;

import com.paf.sellandbuy.domain.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserServices {

    List<UserDTO> findAllUsers();

    String saveuser(UserDTO userdata);

    String updateUser(UserDTO newUserData);

    Optional<UserDTO> findUserById(Integer id);

    void deleteUser(Integer id);
}
