package kr.ac.kopo.day13;

import java.util.Scanner;

public class Shape extends Area{
//삼각 직각 원 면적 구하는 공식
	
//	
//	public int triangle() {
//	
//		int area = (height*width)/2;
//		
//		return area;
//		
//	}
//	public int Rectangle() {
//		
//		int area = (height*width);
//		
//		return area;
//		
//	}
//	
//	public double Circle() {
//		
//		double area = (radius*radius)*PI;
//		
//		return area;
//	}

	Shape() {

		sc = new Scanner(System.in);
	}

	Shape(int no1, int no2) {
		super.no1 = no1;
		super.no2 = no2;

	}

	public int area(int no1, int no2) {

		int area = no1 * no2;

		return area;
	}
	public double getNo1() {
		
		return super.no1;
	}
	public double getNo2() {
		
		return super.no2;
	}
							
}
