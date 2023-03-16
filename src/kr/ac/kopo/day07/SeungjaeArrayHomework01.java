package kr.ac.kopo.day07;

import java.util.Scanner;

public class SeungjaeArrayHomework01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("10개의 정수를 입력하시오 : ");

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			
				num[i] = sc.nextInt();}
		
		System.out.println(" < 짝수 > ");
		for(int i = 0; i < num.length; i++) {
			 if(num[i]%2 == 0) {
				 System.out.print(num[i] + "\t");
			 }
			
		}
		System.out.println();
		System.out.println(" < 홀수 > ");
		for(int i = 0; i < num.length; i++) {
			if((num[i]%2 - 1) == 0) {
				System.out.print(num[i] + "\t");
			}
		}
		
		
		
		sc.close();
		
	}	
	
}

