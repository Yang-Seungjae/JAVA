package kr.ac.kopo.day08;

import java.util.Scanner;

public class StarHomework15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			n--;
		}
		
		int star = (2*n-3);
		for(int i = 1; i <=n; i++) {
			
			for(int j = 1; j<= i - 1; j++) {
				
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			star-=2;
			
		}
	}
}
