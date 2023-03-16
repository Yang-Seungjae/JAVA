package kr.ac.kopo.day01;

/*
  System.out.출력메소드
  print():계행문자가 없음
  println():계행문자를 가진것
  printf(): +로 하면 가독성이 떨어져서 만들어진 명령어
  변환문자를 이용하여 상수 출력을 위한 목적
  ""안에 %c: 문자
        %d: 10진수 정수
        %f: 실수
        %s: 문자열
        %b: 논리값
 */

public class PrintMain {
	
	public static void main(String[] args) {
		
		
		
		System.out.println('A'+'B');// 문자와 문자를 더할때 숫자가 나오는 것을 주의해야함 AB가 안나옴
		
		System.out.println(10+" "+12.34+" "+"홍길동");
		
	    System.out.print(10);
	    System.out.print(' ');
	    System.out.print(12.34);
	    System.out.print(' ');
	    System.out.println("홍길동");
	    
		System.out.print("홍\n");
		
		System.out.print("A\n");
		//방법1
	
		System.out.println('A');
		//방법2
		System.out.print('A');
		System.out.print('\n');
		//방법3
		 
		// 혼자 테스트한것들
		System.out.println("d"+" "+"d"+12+"dd");
		System.out.printf("오늘 점심은 %d시에 %s", 12,"강남식당");// 변수를 나중에 설정하여도 값이 나오게 설정
		System.out.printf("\n"+"오늘은 날씨가 %s", "덥다");
		System.out.print("오늘 점심은 12시에 강남식당\n");
		System.out.print("오늘 점심은 12시에 강남식당\n");
		
		System.out.println("정수 실수 문자열");
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");// 실수의 소숫점이 6자리까지 표시된다
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동");// 실수의 소숫점을 2째자리까지만 표시한다
		System.out.printf("%d %.1f %s\n", 10, 12.36, "홍길동");// 소숫점이 더긴데 짧게 표시하면 반올림이 일어남
		System.out.printf("%d %.1f %s\n", 10, 12.36-0.05, "홍길동");//소숫점 무조건 내림 방법
		System.out.printf("[%5d] %.1f %s\n", 10, 12.36-0.05, "홍길동");//오른쪽 정렬 5자리 기준
		System.out.printf("[%-5d] %.1f %s\n", 10, 12.36-0.05, "홍길동");//왼쪽 정렬 5자리 기준
		System.out.printf("%d %.1f [%-10s]\n", 10, 12.36-0.05, "홍길동");
		System.out.printf("[%05d] %.2f %s\n", 123, 12.34, "홍길동");
		System.out.printf("[%5d]\n", 123456789);
		System.out.printf("[%05d] %.2f %s\n", 123, 12.34, "홍길동");
		//%-05d 로적으면 원래 숫자가 망가지는 명령은 오류가뜸
		// 출력명령어가 (%d앞에 숫자) 원래의 입력값인 숫자를 망치면 명령어가 무시된다.
		System.out.printf("[%5d]\n", 123456789);
		
		
		
	    System.out.println(5>3);// true, false 로 출력
	    
	    System.out.printf("4>2 : %b\n", 4>2);
	    
	    System.out.print(false);
	   
		
		
		
		
		
		
		
		
		
	    
	}
	 

}
