package com.example.UserMaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserMaster.Entity.UserMaster;

public interface UserRepository extends JpaRepository<UserMaster, Long>{

	UserMaster findByEmail(String email);
}
