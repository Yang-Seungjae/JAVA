package kr.ac.kopo.day08;

import java.util.Scanner;

public class StarHomework13 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		if(n%2 == 0) {
			n--;
		}
		
		for(int i = 1; i <= n; i++) {
			if(i <= (n/2)+1) {

				for (int j = 1; j <= (n / 2) + 1; j++) {
					if (j <= (n / 2) + 1 - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					
				}
				
			} else {
				for (int j = 1; j <= (n / 2) + 1; j++) {
					if( j <= i - (n/2)-1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	
	}
}
