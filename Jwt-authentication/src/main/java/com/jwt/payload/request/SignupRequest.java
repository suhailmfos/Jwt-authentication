package com.jwt.payload.request;

import java.util.Set;

import javax.validation.constraints.NotBlank;


public class SignupRequest {
	
	@NotBlank
	String username;
	@NotBlank
	String email;
	@NotBlank
	String password;
	Set<String> role;
	public Set<String> getRole() {
		return role;
	}
	public void setRole(Set<String> role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public SignupRequest() {
		super();
	}
	public SignupRequest(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
}
