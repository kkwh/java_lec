package edu.java.inheritance06;

import java.util.Objects;

public class User {
	// field
	private String userId;
	private String password;
	
	// 생성자: (1) 기본 생성자, (2) argument 2개를 갖는 생성자.
	public User() {}
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	// getters & setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString() override: "User(userId=..., password=...)"
	@Override
	public String toString() {
		return "User(userId=" + userId + ", password=" + password + ")";
	}

	// equals() override: 두 객체의 userId가 같으면 true, 그렇지 않으면 false. 
	// hashCode() override
	@Override
	public int hashCode() {
		return Objects.hash(userId);
	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User other = (User)obj;
			return this.userId.equals(other.userId) ? true : false; 
		} 
		return false;
	}


} 
