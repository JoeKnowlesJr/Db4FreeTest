package com.joeknowles.Db4FreeTest;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

public class User implements Serializable{
	public User() {}
	public long getUserId() { return userId; }
	public void setUserId(long userId) { this.userId = userId; }
	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getGender() { return gender; }
	public void setGender(String gender) { this.gender = gender; }
	public String getOrganization() { return organization; }
	public void setOrganization(String organization) { this.organization = organization; }
	public String getLanguage() { return language; }
	public void setLanguage(String language) { this.language = language; }
	public String getComments() { return comments; }
	public void setComments(String comments) { this.comments = comments; }
	private long userId;
	private String username;
	private String password;
	private String email;
	private String gender;
	private String organization;
	private String language;
	private String comments;
	private Date created;
	private Date updated;
	public User(String un, String pw, String em, String ge, String or, String la, String co) {
		username = un;
		password = pw;
		email = em;
		gender = ge;
		organization = or;
		language = la;
		comments = co;
		created = updated = new Date(System.currentTimeMillis());
	}
	@Override
	public String toString() {
		return "\r\nName: " + username + 
				"\r\nPassword: " + password +
				"\r\nEmail: " + email +
				"\r\nGender: " + gender +
				"Organization: " + organization +
				"Language: " + language +
				"Comments: " + comments + 
				"Created: " + created.toString();
	}
}
