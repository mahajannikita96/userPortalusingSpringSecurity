package com.example.UserMaster.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "UserDetails")
public class UserDetail {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bioId;
	
	@Column(name = "hobby")
	private String hobby;
	
	@Column(name = "bio")
	private String bio;
	
	@OneToOne
	private UserMaster usermaster;
	
	public UserDetail()
	{
		super();
	}





	@Override
	public String toString() {
		return "UserDetails [hobby=" + hobby + ", bio=" + bio + "]";
	}
	
	

}
