package kr.ac.kopo.day11.stat;

import java.util.Scanner;

public class IceScanner {
	Scanner sc;
	
	IceScanner() {
		sc = new Scanner(System.in);
	}
	
	char nextChar(String msg) {
		System.out.print(msg);
		char ch = sc.nextLine().charAt(0);
		return ch;
	}
	
	int nextInt(String msg) {
		
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}
	
	String nextString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}


}
