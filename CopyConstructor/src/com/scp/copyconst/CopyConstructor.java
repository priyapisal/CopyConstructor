package com.scp.copyconst;

public class CopyConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5,6);
		Rectangle r2=new Rectangle(r1);
		System.out.println("Area of 1st Rectangle"+r1.area());
		System.out.println("Area of 1stN2nd Rectangle"+r2.area());
	}

}
