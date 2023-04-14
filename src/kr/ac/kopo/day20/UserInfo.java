package kr.ac.kopo.day20;

import java.io.Serializable;

/*
 	alt+shift+s 누른 후 	c선택
 						o선택
 						r선택
 						s선택
 */

public class UserInfo implements Serializable{// 객체직렬화를 위해 반드시 추가해야하는 부분 인터페이스지만 추상메소드를 다시 정의할 필요없음

	private String name;
	private int age;
	private String phone;

	public UserInfo() {
	}

	public UserInfo(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

	
}
