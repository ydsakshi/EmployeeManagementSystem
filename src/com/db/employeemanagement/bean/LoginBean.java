package com.db.employeemanagement.bean;

public class LoginBean {
private String userName;
private String password;
public String getUserName() {
	return userName;
}
public String getPassword() {
	return password;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public void setPassword(String password) {
	this.password = password;
}
public String toString() {
	return "LoginBean [userName=" + userName + ", password=" + password + "]";
}
public LoginBean(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}

}
