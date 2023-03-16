package kr.ac.kopo.day04;

import java.util.Scanner;

public class IFMain01 {
/* 보유하고 있는 책권수 입력 : 3  3 books
   
   보유하고 있는 책권수 입력 : 1  1 book
   
   보유하고 있는 책권수 입력 : 0  보유하고 있는 책 없음

*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책 권수 : ");
		
		int book = sc.nextInt();
		
		boolean bool = (book == 1); 
		
		
		
		if(bool) {System.out.println (book +" book");}else {System.out.println(book + " books");}
		// bool 자리에 바로 book == 1 적어도 된다. ==가 논리형연산자이기 때문
		
		
		
		
		
		System.out.print(book + " book"); if(book !=1) {System.out.print("s");}// 위에랑 아래랑 같은 의미
		System.out.println();
		
		
		
		
		System.out.println(book + (book == 1 ? " book" : " books"));
		
		
		
		
	
		if(book == 0) {System.out.println("보유하고 있는 책 없음");}
		 else 
		  {if(book == 1) {System.out.println(book + " book");}
		    else{System.out.println(book + " books");}}
		  
	
		if(book == 0) {System.out.println("보유하고 있는 책 없음");} else if(book == 1) {System.out.println(book + " book");}
		else {System.out.println(book + " books");}
		sc.close();
		
		
	}
	
	
}
