package kr.ac.kopo.day13;

import java.util.Scanner;

public class AreaWork {
	
	
	
	// 유형 별 면적 구하는 공식
		public void area() {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("1.삼각형 2.정사각형 3. 직사각형 4.원\n" +"면적을 구할 도형을 선택하세요 : ");
			int choice = sc.nextInt();
//객체형변환으로 변수 바꿀수있는건가??
			switch (choice) {
			case 1:
				System.out.println("밑변을 입력하세요 : ");
				int no1 = sc.nextInt();
				System.out.println("높이을 입력하세요 : ");
				int no2 = sc.nextInt();
				Area ar = new Shape(no1, no2);
				System.out.println("밑변 " + ar.no1 + "높이 " + ar.no2 + "삼각형의 넓이는 " + ar.area(no1,no2)/2);
				break;
			case 2:
				System.out.println("한변의 길이를 입력하세요 : ");
				int no3 = sc.nextInt();				
				Area ar2 = new Shape(no3, no3);
				System.out.println("한변의 길이가 " + ar2.no1 +  "인 정사각형의 넓이는 " + ar2.area(no3,no3));
				break;
			case 3:
				System.out.println("가로을 입력하세요 : ");
				int no4 = sc.nextInt();
				System.out.println("세로을 입력하세요 : ");
				int no5 = sc.nextInt();
				Area ar3 = new Shape(no4, no5);
				System.out.println("가로 " + ar3.no1 + "세로 " + ar3.no2 + "직사각형의 넓이는 " + ar3.area(no4,no5));
				break;
			case 4:
				System.out.println("반지름의 길이를 입력하세요 : ");
				int no6 = sc.nextInt();				
				Area ar4 = new Shape(no6, no6);
				System.out.println("반지름의 길이가 " + ar4.no1 +  "인 원의 넓이는 " + ar4.area(no6,no6)*Area.PI);
		

			}
		}
}
