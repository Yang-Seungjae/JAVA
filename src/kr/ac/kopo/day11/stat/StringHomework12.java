package kr.ac.kopo.day11.stat;

import java.util.Scanner;

public class StringHomework12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자열을 입력하시오 : ");
		String oriStr = sc.nextLine();
		System.out.println("문자를 입력하시오 : ");
		char delChar = sc.next().charAt(0);
		
		String no = StringUtil.removeChar(oriStr, delChar);
		
		System.out.println(no);
		
		
		
		
		
		
		
	}

}
