package com.ggikko.diExample;

import java.util.ArrayList;

public class Person2 {

	private String name;
	private int age;
	private double height;
	private ArrayList<String> hobby;


	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public Person2(String name, int age, double height, ArrayList<String> hobby) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.hobby = hobby;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

}
