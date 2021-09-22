package com.jwt.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	
	@NotBlank
	String username;
	@NotBlank
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginRequest() {
		super();
	}
	
}
