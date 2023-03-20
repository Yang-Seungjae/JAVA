package kr.ac.kopo.day10;

import java.util.Scanner;

public class MethodExam {
	
	
	Scanner sc = new Scanner(System.in);
	/**
	  호출자 메소드에서 받아온 두개의 정수 사이의 총합을 반환하는 메소드를 만들어보자
		@param num1 첫번째 정수 (총합의 시작값)
		@param num2 두번째 정수 (총합의 종료값)  @ 컴퓨터가 해석할 수 있는 주석이라 생각하면된다.
		@return num1 ~ num2 사이의 총합
		@author User
	 */
	public int getTotal(int num1, int num2) {
		
		int total = 0; 
		for(int i = num1; i <= num2; i ++) {
			total += i;
		}
	 
		return total;
		
 }
	/**
	 * 단을 이용하여 구구단을 출력
	 * @param dan 출력할 단
	 */
	public void printGugudan(int dan) {
		
		System.out.println("*** " + dan+"단" + " ***");
		for(int i = 1; i < 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
	}
	/**
	 * 구구단 전체를 출력 
	 * 
	 */
	/*void printGugudan() {
		
		for(int i = 2; i <= 9; i++) {
		System.out.println("*** " + i+"단" + " ***");
		for(int j = 1; j <= 9; j++) {
		System.out.println(i + " * " + j + " = " + (j * i));
		
		}
		}
		
		
	}*/
	
	public void printGugudan() {
		
//		for(int dan = 2; dan <= 9; dan++) {
//			/*this. 이 생략되어 있음*/printGugudan(dan);
			
//		}
		printGugudan(2, 9);
	}
	
	
	
	

	public int getInt() {
		
	
		int dan = sc.nextInt();
		
		return dan;
		
	}
	/**
	 * 시작단과 종료단을 입력하면 그 사이의 구구단을 출력하는 메소드
	 * @param startDan 시작단
	 * @param endDan 종료단
	 */
	public void printGugudan(int startDan, int endDan) {
		
		for(int dan = startDan; dan <= endDan; dan++) {
			printGugudan(dan);
		}
		
	}


}
