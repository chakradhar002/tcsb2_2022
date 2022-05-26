package com.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
