package com.tjoeun.dto;

import java.util.Arrays;
import java.util.Date;

public class Member {
	
	private int id;
	private String passwd;
	private String city;
	private String gender;
	private String[] hobby;
	private Date birthDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", passwd=" + passwd + ", city=" + city + ", gender=" + gender + ", hobby="
				+ Arrays.toString(hobby) + ", birthDate=" + birthDate + "]";
	}

	
	
}
