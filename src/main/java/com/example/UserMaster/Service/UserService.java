package com.example.UserMaster.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.UserMaster.Entity.UserMaster;


public interface UserService extends UserDetailsService{

	UserMaster save(UserMaster userdto);
	
	//UserDetail saveUserDetails(UserDetails userdetaildto);
	
}
