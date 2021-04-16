package com.training.bean;

import java.io.Serializable;
import java.util.Arrays;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Producer implements Serializable {

	
	private String trainercode;
	private String name;
	private String email;
	private long mobileNo;
	private String password;
	private String skillset;
	
	
	
	public Producer(String trainercode, String name, String email, long mobileNo, String password, String skillset) {
		super();
		this.trainercode = trainercode;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
		this.skillset = skillset.join(",");
	}

	
	public Producer() {
		super();
	}


	public String getTrainercode() {
		return trainercode;
	}


	public void setTrainercode(String trainercode) {
		this.trainercode = trainercode;
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


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSkillset() {
		return skillset;
	}


	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}


	@Override
	public String toString() {
		return "Producer [trainercode=" + trainercode + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", password=" + password + ", skillset=" + skillset + "]";
	}

}
