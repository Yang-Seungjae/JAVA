package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수를 입력 : ");
		int num = sc.nextInt();
		try {
			
			if(num % 2 != 1) {
				throw new OddMismatchException("입력하신 정수 [" + num + "]는 홀수가 아닙니다");
			//	throw new Exception("입력한 정수가 홀수가 아닙니다");
			}
			
			System.out.println("num = " + num);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		if(num % 2 != 1) {
		
			System.out.println("num = " + num);
		} else {
			System.out.println("잘못입력했습니다");
		}
		*/
	}
}









