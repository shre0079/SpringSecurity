package com.Shre.SpringSecurity.dao;

import com.Shre.SpringSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
