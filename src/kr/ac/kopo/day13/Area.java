package kr.ac.kopo.day13;

import java.util.Scanner;

public abstract class Area {
	//변수 및 초기화
	Scanner sc;
	int no1;
	int no2;
	static final double PI = Math.PI;
	
//	Area(){
//		
//		sc = new Scanner(System.in);
//	}
//	
//	Area(int no1, int no2){
//		this.no1 = no1;
//		this.no2 = no2;
//		
//		
//	}
//	
	
	public abstract int area(int no1, int no2);

}
