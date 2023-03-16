package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
		/*String str = sc.next(); 한 단어 단위로 인식*/
		String str = sc.nextLine();
		System.out.println("str : " + str);
		
		System.out.print("정수를 입력 : ");
	     
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
	    
	    String str1 = sc.next();
	    		
	   	System.out.print("단어 하나를 입력 :");
	   	System.out.println("str1 : " + str1);
	   	sc.close();
	   
	
	}
	
}
