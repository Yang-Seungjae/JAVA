package kr.ac.kopo.day10;
// 과제 내가 한것
import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		StringUtil su = new StringUtil();
		
		//1번, 2번
		System.out.print("문자 하나를 입력하시오 : ");
		su.ch = sc.next().charAt(0);
		
		su.isUpperChar(su.ch);
		
		
		//3번 4번
	
		su.maxminMethod(su.i , su.j);
		
		//5번 
		System.out.print("반대로 출력할 문자열을 입력하시오 : ");
		String str = sc.next();
		su.reverseString(str);
		
		//6번 문자열을 입력하면 대문자로 변경하는 문제
		System.out.println("문자열을 입력하시오 : ");
		String str1 = sc.next();
		su.toUpperString(str1);
		
		//7번 문자열을 입력하면 소문자로 변경하는 문제 
		System.out.println("문자열을 입력하시오 : ");
		String str2 = sc.next();
		su.toLowerString(str2);
		
		//8번 두개의 문자열을 입력받아 문자열 크기를 비교하는 문제 
	
		System.out.println("문자열을 입력하시오 : ");
		String str3 = sc.next();
		
		System.out.println("문자열을 입력하시오 : ");
		String str4 = sc.next();
		int result = su.compareTo(str3, str4);
		
		
		System.out.println(result);
		
		//9번 문자열 입력받고 문자열 검색하는 메소드 
		
		String str5 = "hello world";
		
		System.out.println("검색할 문자열을 입력하시오 : ");
		String sub = sc.next();
		boolean bool = su.endsWith(str5, sub);
		System.out.println(bool);
		
		//10번 문자열 입력받고, 검색할 문자열을 입력받아 검색할 문자열이 어느위치에있는지 검색
		
		String str6 = "hello world";
		System.out.println("검색할 문자열을 입력하시오 : ");
		String sub2 = sc.next();
		int location = su.indexOf(str6, sub2);
		System.out.println(location);
		
		
		
	}
}
