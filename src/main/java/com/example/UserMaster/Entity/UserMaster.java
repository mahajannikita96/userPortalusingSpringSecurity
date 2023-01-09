package com.example.UserMaster.Entity;

import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;



@Entity
@Table(name = "UserMaster" ,uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class UserMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_Id")
	private String emailId;
	
	@Column(name = "phoneNo")
	private long phoneNo;
	
	@Column(name = "password")
	private String password;
	
	
	@OneToOne
	private UserDetails userDetails; //foreign
	
	
	public UserMaster()
	{
		super();
	}

	

	public UserMaster( String firstName, String lastName, String emailId, long phoneNo, String password,
			UserDetails userDetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.password = password;
		this.userDetails = userDetails;
	}



	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	


	public UserDetails getUserDetails() {
		return userDetails;
	}



	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}



	@Override
	public String toString() {
		return "UserMaster [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", phoneNo=" + phoneNo + ", password=" + password + "]";
	}
	
	
	

}
