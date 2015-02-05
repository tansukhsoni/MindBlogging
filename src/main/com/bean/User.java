package main.com.bean;

import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private long userId;
	private String userFirstName;
	private String userLastname;
	private Date DOB; 
	private String Profession;
	private String email;
	private String password;
	private ArrayList<Blog> blogLists;
	
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}
	
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastname() {
		return userLastname;
	}
	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Blog> getBlogLists() {
		return blogLists;
	}
	public void setBlogLists(ArrayList<Blog> blogLists) {
		this.blogLists = blogLists;
	}
	
	
	
	
	
	

}
