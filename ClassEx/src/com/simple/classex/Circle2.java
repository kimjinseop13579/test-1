package com.simple.classex;

public class Circle2 {
	final double PI = 3.141592;
	String name;

	int radius=5; // 반지름
	int x=10,y=20; // 중심점
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCircle(int r,int x, int y) {
		radius = r;
		this.x = x;
		this.y = y;
		
	}

	//원 그리기
	public void drawCircle() {
		System.out.println("원의 크기"+radius);
		System.out.println("원의 위치"+x+","+y);
		
	}

	// 원의 면적
	public double getArea() {
		return PI * radius * radius;
	}
}