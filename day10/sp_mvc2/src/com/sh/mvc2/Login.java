package com.sh.mvc2;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Login {
	@NotEmpty
	@Length(min=4, max=8)
	private String username;
	@NotEmpty
	@Length(min=4, max=8)
	private String password;
	@Email
	@NotEmpty
	private String email;
	@DateTimeFormat(pattern="dd/MM/YYYY")
	private Date birth;
	@Range(min=1, max=99)
	private int age;
	public Login() {
		this("", "", "", new Date(), 0);
	}
	public Login(String username, String password, String email, Date birth, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.birth = birth;
		this.age = age;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", email=" + email + ", birth=" + birth
				+ ", age=" + age + "]";
	}
}
