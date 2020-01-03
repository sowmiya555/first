package com.deloitte.project.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.deloitte.project.model.Users;
import com.deloitte.project.services.UserImpl;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("1.Sign up"+"2.Display"+"3.login"+"4.Exit");
		String option = sc.next();
		ArrayList<Users> list = new ArrayList<Users>();
		UserImpl userObj = new UserImpl();
		switch(option)
		{
		case "1":
			System.out.println("First Name:");
			String fname = sc.next();
			System.out.println("Last Name:");
			String lname = sc.next();
			System.out.println("Contact number:");
			long phone = sc.nextLong();
			System.out.println("Email");
			String mail = sc.next();
			System.out.println("Address:");
			String addr = sc.next();
			System.out.println("City");
			String cty = sc.next();
			System.out.println("Password");
			String passwrd = sc.next();
			System.out.println("Role:");
			String role1 = sc.next();
			userObj.addUser(fname, lname, phone, mail, addr, cty, passwrd, role1);
			break;
			
		case "2":
			list=userObj.displayUsers();
			for(Users user : list)
			{
		       System.out.println(user);
			}
			break;
		case "3":
			System.out.println("Enter mail id");
			String mailid=sc.next();
			System.out.println("Enter password");
			String pwd=sc.next();
			userObj.userLogin(mailid, pwd);
			break;
		case "4":
			System.exit(0);
		}	
		}
	}
}
