package kr.ac.kopo.day08;

import java.util.Scanner;

public class StarHomework17 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n%2 ==0) {
			n--;
		}
		
		int star = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j <= star || (n+1) - j <= star) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i<(n/2)+1) {
				star++;
			}else {
				star--;
			}}
		
	 
	
	
	
	}
	
	
}
