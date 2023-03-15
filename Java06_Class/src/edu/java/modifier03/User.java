package edu.java.modifier03;

public class User {
	// field
	private int userNo;
	private String userId;
	private String passWord;
	
	// argument 3개를 갖는 생성자
	public User(int userNo, String userId, String password) {
		this.userNo = userNo;
		this.userId = userId;
		this.passWord = passWord;
	}
	
	// getter, setter 메서드
	public int getUserNo() {
		return userNo;
	}
	
	public String getUserId() {
		return userId;
	}

	public String getPassWord() {
		return passWord;
	}
	
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void printUser() {
		System.out.println("UserNumber: " + getUserNo());
		System.out.println("아이디: " + getUserId());
		System.out.println("비밀번호: " + getPassWord());
	}

}
