package com.codewithchandan.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithchandan.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
