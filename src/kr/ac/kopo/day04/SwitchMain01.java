package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 1-3 사이의 정수 입력: 
 
 1입력 = One
 2입력 = Two
 3입력 = Three
 그외입력 = error
 
 
 
 */

public class SwitchMain01 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3 사이의 정수 : ");
		
		int num = sc.nextInt();
		
		switch(num) { // switch 는 책갈피 개념이라고 생각하면된다. break; 명령어가 없으면 시작된 케이스부터 break;를 찾을때까지 문장을 실행한다.
		case 1 : 
			System.out.println("One");
			break;
		case 2 :
			System.out.println("Two");
			break;
		case 3 :
			System.out.println("Three");
			break;
		default : // if문의 else와 같은 의미
			System.out.println("error");
			sc.close();
		}
			
			
		
		/*
		if(num == 1) {System.out.println("One");}
		else if(num == 2) {System.out.println("Two");}
		else if(num == 3) {System.out.println("Three");}
		else {System.out.println("error");}
		동등비교로 물어보는 if 문은 switch문으로 바꿀 수 있다.*/
		
		
		
		
		
		
		
	}
}
