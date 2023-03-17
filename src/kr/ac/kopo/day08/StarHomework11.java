package kr.ac.kopo.day08;

import java.util.Scanner;

public class StarHomework11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2 == 0 ) {
			n--;
		}
		
		for(int i = 1; i <= n; i++) {
			if(i <= (n/2)+1) {
				for(int j = 1; j <= (n/2)+1; j++) {
					if(j <=(n/2)+2-i) {
					System.out.print("*");}
					/*else {
					System.out.print(" ");
					}*/
				}
			}else {
				for(int j = 1; j <= (n/2)+1; j++) {
					if(j <= i-(n/2)) {
						System.out.print("*");
					}/*else {
						System.out.print(" ");
					}*/
				}
			}
			System.out.println();
		}
	}
}
