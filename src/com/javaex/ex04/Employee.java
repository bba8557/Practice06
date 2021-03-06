package com.javaex.ex04;

public class Employee extends User{

	//필드
	private int salary;
	
	//생성자
	public Employee() {
	
	}
	public Employee(String id, String password, String name, int salary) {
		super.id = id;
		super.password = password;
		super.name = name;
		this.salary = salary;
	}
	//메소드 - gs
	//===============get===============
	public int getSalary() {
		return salary;
	}
	
	//===============set===============
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	public void showInfo() {
		System.out.println("#아이디:"+super.id+", #패스워드:"+super.password+", #이름:"+super.name+", #월급:"+this.salary);
		System.out.println("운영자의 월급은:"+this.salary+"원 입니다.");
	}
	
	
}
