package kr.ac.kopo.day11.stat;

import java.util.Scanner;

public class StringHomework11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자열을 입력하시오 : ");
		String strData = sc.nextLine();
		System.out.println("문자를 입력하시오 : ");
		char ch = sc.next().charAt(0);
		
		int no = StringUtil.checkChar(strData, ch);
		
		System.out.println(no + "리턴");
		
		
		
		
		
		
		
	}

}
