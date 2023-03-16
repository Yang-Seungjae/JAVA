package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class SeungjaeHomework07 {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("시작단을 입력하시오 : ");
		int num01 = sc.nextInt();
		System.out.print("종료단을 입력하시오 : ");
		int num02 = sc.nextInt();
		
		if(num01 < num02) {
		for(int i = num01; i <= num02; i++) {
			
			System.out.printf("*** %d단 ***\n", i);
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.println(i + " * " + j + " = " + j*i);
			}

			}
		
		} else {
			for(int i = num02; i <= num01; i++) {
				
				System.out.printf("*** %d단 ***\n", i);
				
				for(int j = 1; j <= 9; j++) {
					
					System.out.println(i + " * " + j + " = " + j*i);
				}
		
				}
		
		}
		sc.close();
	}
}
