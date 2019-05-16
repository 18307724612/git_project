package com.student.model;

public class StudentModel {
	public StudentModel(int id, String name, int sex, int age) {
		super();
		this.id = id;//ID
		this.name = name;//姓名
		this.sex = sex;//性别
		this.age = age;//年龄
	}
	private int id;
	private String name;
	private int sex;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
