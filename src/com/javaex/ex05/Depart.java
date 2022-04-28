package com.javaex.ex05;

public class Depart extends Employee {

	// 필드
	private String department;

	// 생성자
	public Depart() {

	}

	public Depart(String getName, int getSalary, String department) {
		super(getName,getSalary);
		this.department = department;
	}

	// 메소드 - gs
	// ===================get==================
	public String getDepartment() {
		return department;
	}

	// ===================set==================
	public void setDepartment(String department) {
		this.department = department;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Depart [department=" + department + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	public void showInformation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary()+ " 부서:"+department);
	}

}
