package com.deloitte.project.model;

public class Users {
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFName=" + userFName + ", userLName=" + userLName + ", contact="
				+ contact + ", email=" + email + ", address=" + address + ", city=" + city + ", password=" + password
				+ ", role=" + role + "]";
	}
	private int userId;
	private String userFName;
	private String userLName;
	private long contact;
	private String email;
	private String address;
	private String city;
	private String password;
	private String role;
	private static int count=102;
	static
	{
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Users.count = count;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFName() {
		return userFName;
	}
	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}
	public String getUserLName() {
		return userLName;
	}
	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
