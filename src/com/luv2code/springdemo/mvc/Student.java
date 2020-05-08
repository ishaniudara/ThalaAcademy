package com.luv2code.springdemo.mvc;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;


public class Student {
	@NotNull(message="is required")
	@Size(min=1,message="is required")
private String name;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Email
private String email;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
private String date;
	
private String school;

@NotNull(message="is required")
@Size(min=1,message="is required")
@Pattern(regexp="(^$|[0-9]{10})",message="10 numbers need")
private String contactNumber;

@NotNull(message="is required")
@Size(min=1,message="is required")
private String pname;

@NotNull(message="is required")
@Email
private String pemail;

@NotNull(message="is required")
@Size(min=1,message="is required")
private String address;

private String info;

@NotNull(message="is required")
@Size(min=1,message="is required")
@Pattern(regexp="(^$|[0-9]{10})",message="10 numbers need")
private String pcontactNumber;

private String other;

@NotNull(message="is required")
@Size(min=1,message="is required")
private String confirm;


public Student() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPemail() {
	return pemail;
}
public void setPemail(String pemail) {
	this.pemail = pemail;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public String getPcontactNumber() {
	return pcontactNumber;
}
public void setPcontactNumber(String pcontactNumber) {
	this.pcontactNumber = pcontactNumber;
}
public String getOther() {
	return other;
}
public void setOther(String other) {
	this.other = other;
}
public String getConfirm() {
	return confirm;
}
public void setConfirm(String confirm) {
	this.confirm = confirm;
}


}
