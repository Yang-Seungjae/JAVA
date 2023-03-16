package kr.ac.kopo.day05;

import java.util.Scanner;

public class WhileMain01 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		
		while( cnt <= 3) {
			System.out.println("Hello");
			cnt++;
		}
		cnt = 1; // while은 변수가 살아있으므로 변수 초기화 과정을 거쳐야 같은 변수를 다시 쓸수있다.
		while(cnt <=3) {
			System.out.println("Goodbye");
			cnt++;
		}
		
		System.out.println(cnt);
		
		for(int cnt2 = 1; cnt2 <= 3; cnt2++) {
			System.out.println("Hello");
		}
		//System.out.println(cnt2); cnt2 는 for문에서 사용된 변수이므로 for문의 블록스코프와 수명이 같다. while과 차이가 여기서 발생
		// 일반적으로 while 은 시작과 끝점을 모를때 많이 사용하고 , for문은 시작과 끝점을 알때 많이 쓴다.
		
		//int cnt2 = 3;
		
		sc.close();
		
		
	}
	
}
