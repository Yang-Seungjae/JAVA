
package kr.ac.kopo.day04;

import java.util.Scanner;

public class Seungjaehomework {
	
	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		
		//1번 문제 
		
		System.out.print("반지름을 입력하시오 : ");
		
		int num01 = sc.nextInt();
		
		System.out.printf("%.4f 원넓이 %.4f 원둘레\n", (num01*num01*3.14), (2*num01*3.14));
		
		
		
		//2번 문제
		
		System.out.print("물건값을 입력하시오 : ");
		
		int num02 = sc.nextInt();
		
		System.out.print("지불한 돈을 입력하시오 : ");
		
		int num03 = sc.nextInt();
		
		int num04 = num03 - num02;
		if(num03 > num02)
		{System.out.printf("거스름돈 : %d\n", num04);}
		
		int num05 = num04 % 1000;
		int num06 = num05 % 500;
		int num07 = num06 % 100;
		int num08 = num07 % 50;
		if(num03 > num02) {
		System.out.printf("1000원 %d개\n 500원 %d개\n 100원 %d개\n 50원 %d개\n 10원 %d개\n", num04/1000, num05/500, num06/100, num07/50, num08/10);}
		else { System.out.printf("%d원이 부족합니다", (num02-num03));}
		 
		
		//3번 문제
		
		System.out.print("정수 3개를 입력하시오 : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		if(a < b && b < c)
		
		    {System.out.println(a);
		     System.out.println(b);
		     System.out.println(c);}
		
		else if(a < b && c < b && a < c) 
			
		   {System.out.println(a);
		    System.out.println(c);
		    System.out.println(b);}
		
		else if(a < b && c < b && a > c)
		
		   {System.out.println(c);
		    System.out.println(a);
		    System.out.println(b);}
		
		else if(b < a && c < a && b > c)
			
		   {System.out.println(c);
		    System.out.println(b);
		    System.out.println(a);}
		
		else if(b < a && c < a && b < c)
			
		   {System.out.println(b);
		    System.out.println(c);
		    System.out.println(a);}
		
		else
			
		   {System.out.println(b);
		    System.out.println(a);
		    System.out.println(c);}
		
		
		
		//4번 문제
		
		
		System.out.print("정수 4개를 입력하시오 : ");
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		
		
		if(d > e && d > f && d > g)
			
		{System.out.println(d);}
		
		else if( e > d && e >f && e > g)
			
		{System.out.println(e);}
		
		else if(f > e && f > d && f > g)
			
		{System.out.println(f);}
		
		else 
			
		{System.out.println(g);}
		
		 
		
		//5번 문제
		
		System.out.print("보유하고 있는 책 권수 : ");
		
		int book = sc.nextInt();
	
		if(book == 0) {System.out.println("보유하고 있는 책 없음");} 
		else if(book == 1) 
		{System.out.println(book + " book");}
		else if(book < 0)
		{System.out.println("잘못입력했습니다");} 
		else 
		{System.out.println(book + " books");}
		
		
		System.out.print("보유하고 있는 책 권수 : ");
		int book2 = sc.nextInt();
		switch(book2) {
		 case 0 :
		 		System.out.println("보유하고 있는 책 없음");
		 		break;
		 case 1 :
			 	System.out.println(book2 + " book");
			 	break;
		 default :
			 System.out.println(book2 < 0 ? "잘못입력했습니다" : book2 + " books");
			 
		sc.close();
		
		
		}
		
		
		
		
		
		
		
		
	}

}
