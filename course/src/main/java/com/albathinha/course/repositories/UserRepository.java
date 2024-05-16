package com.albathinha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albathinha.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
