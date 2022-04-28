package com.javaex.ex02;

public class Triangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		System.out.println("Triangle()");
	}
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("Triangle(2)");
	}
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(4)");
	}
	//메소드 - gs
		
	//메소드 - 일반
	
}


