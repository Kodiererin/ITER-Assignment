package com.Assignment.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public ArrayList<Long> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(ArrayList<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public HashMap<String, Double> getFees() {
		return fees;
	}
	public void setFees(HashMap<String, Double> fees) {
		this.fees = fees;
	}
	int Id;
	String Name;
	String Branch;
	ArrayList<Long> phoneNumber;
	HashMap<String, Double> fees;
}
