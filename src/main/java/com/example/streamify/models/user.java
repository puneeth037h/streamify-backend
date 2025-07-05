package com.example.streamify.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class user {
@Id 
@GeneratedValue
private String Id;
private String Name;
private String Email;
private String password;
private long phno;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public user(String id, String name, String email, String password, long phno) {
	super();
	Id = id;
	Name = name;
	Email = email;
	this.password = password;
	this.phno = phno;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "user [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", password=" + password + ", phno=" + phno + "]";
}


}
