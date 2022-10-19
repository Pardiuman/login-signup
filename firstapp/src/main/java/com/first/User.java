package com.first;

import javax.annotation.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	

}
