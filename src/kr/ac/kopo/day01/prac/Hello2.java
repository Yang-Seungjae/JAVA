package kr.ac.kopo.day01.prac;

public class Hello2 {/**day01에 배운내용 복습을 위해 만듬 */
	
	public static void main(String[] args) {
		
		final int KKK= 10;// 상수변수 KKK 
		int ooo= 200;//변수 ooo int = 정수로 구성된 변수를 만들때 사용하는 명령어
		
		ooo= 500;
	
		
		System.out.println(10+10);
		System.out.printf("[%-9d] %.1f %s\n", 100, 12.33+0.05/*올림을 위해 0.05를 더함*/, "나머지공부");
		System.out.printf("4>2 : %b\n", 4<2 );
		System.out.println(KKK+ooo);
		
		System.out.print("A"+" "+'B'+"\t"+"\\"+"\'"+"C");
		/*문자열A와 문자B를 더하고 tab과 \ '를 친뒤 C를 표시하기 */
		System.out.print("A"+" "+'B'+"\t"+"\\"+"\'"+"C"); // control+alt+아래방향키로 그 열 복사
		
		
		//자바의 정석, 혼자하는 자바, 등 자바책 읽기, 디자인패턴 책읽기
		
		
	}

}
