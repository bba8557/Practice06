package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] u = new User[3];
		
		User c01 = new Customer("jws", "j1234", "정우성", 1000);
		User c02 = new Customer("yjs", "y2345", "이효리", 2000);
		
		User e01 = new Employee("master", "m7788", "운영자", 5000000);
		
		u[0] = c01;
		u[1] = c02;
		u[2] = e01;
		
		for(int i=0; i<u.length; i++) {
			u[i].showInfo();
		}
	}

}
