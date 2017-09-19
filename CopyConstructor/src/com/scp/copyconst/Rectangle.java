package com.scp.copyconst;

public class Rectangle {
	int length;
	int breadth;
	//parameterized constructor
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	//copy constructor
	Rectangle(Rectangle obj){
		length=obj.length;
		breadth=obj.breadth;
	}
	int area(){
		return(length*breadth);
	}
}
	