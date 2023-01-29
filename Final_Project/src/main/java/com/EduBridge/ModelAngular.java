package com.EduBridge;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;



@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class ModelAngular {
@Id
 int id;
 String username;
 String password;
 String email;
 
public ModelAngular() {
}
public ModelAngular(int id, String username, String password, String email) {
	super();
	this.id=id;
	this.username =  username;
	this.password = password;
	this.email = email;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}




}
