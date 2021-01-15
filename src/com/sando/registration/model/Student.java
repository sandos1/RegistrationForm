package com.sando.registration.model;

public class Student {
	
	private String lastname;
	private String firstname;
	private String dateOfbirth;
	private String gender;
	private String email;
	private String phone;
	private String subject;
	
	
	public Student() {
		
	}
	public Student( String lastname, String firstname, String dateOfbirth, String gender, String email,
			String phone, String subject) {
		super();
		
		this.lastname = lastname;
		this.firstname = firstname;
		this.dateOfbirth = dateOfbirth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.subject = subject;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
