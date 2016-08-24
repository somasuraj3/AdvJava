package com.sh.mvc2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")
public class LoginModel {
	@Id
	@Column
	private String username;
	@Column
	private String password;
	public LoginModel() {
		this("empty", "empty");
	}
	public LoginModel(String username, String password) {
		this.username = username;
		this.password = password;
	}
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
	@Override
	public String toString() {
		return String.format("LoginModel [username=%s, password=%s]", username, password);
	}
}
