package kr.ac.kopo.day07;

import java.util.Scanner;

public class SeungjaeArrayHomework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println((i+1) + "번째 정수를 입력하시오 : ");
			num[i] = sc.nextInt();

			if (num[i] < 0 || 100 < num[i]) { 
				
			i--; 
				
			}
		}
		System.out.println(" < PRINT > ");
		for(int i = 0; i < num.length; i++) {
		System.out.printf("%d\t", num[i]);
		}
		System.out.println();
		System.out.println(" < REVERSE > ");
		
		for(int i = num.length-1; i >= 0; i--) {
			
		System.out.printf("%d\t", ((num[i]/10)+(num[i]%10)*10));
		}
	}	
	
}

