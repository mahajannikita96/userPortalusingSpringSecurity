package com.example.UserMaster.Service;



import java.util.ArrayList;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.example.UserMaster.Entity.UserDetail;
import com.example.UserMaster.Entity.UserMaster;
import com.example.UserMaster.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserMaster user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmailId(), user.getPassword(), new ArrayList<>());		
	}
	
	/*
	 * private Collection<? extends GrantedAuthority>
	 * mapRolesToAuthorities(Collection<Role> roles){ return roles.stream().map(role
	 * -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	 * }
	 */		
	
	

	@Override
	public UserMaster save(UserMaster userdto) {
		
		UserMaster usermaster = new UserMaster(userdto.getFirstName(),userdto.getLastName(),userdto.getEmailId(),userdto.getPhoneNo(),userdto.getPassword(),userdto.getUserDetails());
		return userRepository.save(usermaster);
	}

	

	
	
	

}
