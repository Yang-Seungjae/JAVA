package kr.ac.kopo.day13;

import java.util.Scanner;

public class AreaWork {
	
	
	
	// 유형 별 면적 구하는 공식
		public void area() {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("1.삼각형 2.정사각형 3. 직사각형 4.원\n" +"면적을 구할 도형을 선택하세요 : ");
			int choice = sc.nextInt();
//객체형변환으로 변수 바꿀수있는건가??
//			switch (choice) {
//			case 1:
//				System.out.println("밑변을 입력하세요 : ");
//				int no1 = sc.nextInt();
//				System.out.println("높이을 입력하세요 : ");
//				int no2 = sc.nextInt();
//				Area ar = new Shape(no1, no2);
//				System.out.println("밑변 " + ar.no1 + "높이 " + ar.no2 + "삼각형의 넓이는 " + ar.area(no1,no2)/2);
//				break;
//			case 2:
//				System.out.println("한변의 길이를 입력하세요 : ");
//				int no1 = sc.nextInt();				
//				Area ar = new Shape(no1, no1);
//				System.out.println("한변의 길이가 " + ar.no1 +  "인 정사각형의 넓이는 " + ar.area(no1,no1));
//				break;
//			case 3:
//				System.out.println("가로을 입력하세요 : ");
//				int no1 = sc.nextInt();
//				System.out.println("세로을 입력하세요 : ");
//				int no2 = sc.nextInt();
//				Area ar = new Shape(no1, no1);
//				System.out.println("가로 " + ar.no1 + "세로 " + ar.no2 + "직사각형의 넓이는 " + ar.area(no1,no2));
//				break;
//			case 4:
//				System.out.println("반지름의 길이를 입력하세요 : ");
//				int no1 = sc.nextInt();				
//				Area ar = new Shape(no1, no1);
//				System.out.println("반지름의 길이가 " + ar.no1 +  "인 원의 넓이는 " + ar.area(no1,no1)*Area.PI);
//				
//
//			}
		}
}
