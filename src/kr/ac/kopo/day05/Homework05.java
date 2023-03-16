package kr.ac.kopo.day05;

import java.util.Scanner;

public class Homework05 {

	
	public static void main(String[] args) {
		
		
         Scanner sc = new Scanner(System.in);
		
		System.out.print("보유 하고 있는 책 권수 입력 : ");
		
		int book = sc.nextInt();
		
		if(book < 0) {
			 System.out.println("잘못 입력했습니다");
		}else if(book ==0) {
		     System.out.println("보유하고 있는 책 없습니다");}
		     else if(book ==1) {
		    	 System.out.println(book + "book");}
		    	 else {
		    		 System.out.println(book + "books");}
		
		sc.close();
		
		
		
		/* switch 에서 default 안에 switch 또 쓸수있다.
		 
		 * switch(book & 0x80000000){ // 비트앤드가 뭔지 알기
		  case 0 // 양수라는 의미
		  
		
		*/
		
		
		     }
		
	}

