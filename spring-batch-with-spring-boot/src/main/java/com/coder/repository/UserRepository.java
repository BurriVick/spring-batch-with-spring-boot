package com.coder.springbatchwithspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.springbatchwithspringboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	

}
