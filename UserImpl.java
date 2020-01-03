package com.deloitte.project.services;

import java.util.ArrayList;

import com.deloitte.project.DAO.UserDAO;
import com.deloitte.project.model.Users;

public class UserImpl implements UserInterface{

	@Override
	public void addUser(String fname, String lname, long phone, String mail, String addr, String cty, String passwrd,
			String role1) {
		// TODO Auto-generated method stub
			Users user = new Users();
			user.setUserFName(fname);
			user.setUserLName(lname);
			user.setContact(phone);
			user.setEmail(mail);
			user.setAddress(addr);
			user.setCity(cty);
			user.setPassword(passwrd);
			user.setRole(role1);
			UserDAO.addUser(user);
			
		}

	@Override
	public ArrayList<Users> displayUsers() {
		// TODO Auto-generated method stub
		
		return UserDAO.displayUsers();
	}

	@Override
	public  void userLogin(String mailid, String pwd) {
		// TODO Auto-generated method stub
		 UserDAO.userLogin(mailid, pwd);
		 
	}
		
	}
	


