package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class SeungjaeHomework05 {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("2 - 9 사이의 단을 입력하시오 : " );
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * "+i + " = " + num*i, num );
			System.out.println();
		}
		sc.close();
	}
}
