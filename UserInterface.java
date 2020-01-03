package com.deloitte.project.services;

import java.util.ArrayList;

import com.deloitte.project.model.Users;

public interface UserInterface {
 
	public void addUser(String fname, String lname, long phone, String mail, String addr, String cty, String passwrd, String role1);
	public ArrayList<Users> displayUsers();
	public void userLogin(String mailid, String pwd);
}
