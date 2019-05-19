package com.paf.sellandbuy.repositories;

import com.paf.sellandbuy.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {

}
