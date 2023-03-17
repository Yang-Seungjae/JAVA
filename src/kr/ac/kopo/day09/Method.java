package kr.ac.kopo.day09;

public class Method { 
	
	int data = 10;// 멤버변수
	
	void call(/*매개변수*/) {
		System.out.println("call() 메소드 호출 ...");
	}
	
	/*void call()*/ // 에러남 . 자바에서는 메소드명(파라미터) 단위로 메소드를 구분 파이썬은 메소드명만으로 구분
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출 ...");
	}
	// Method overloading 상태 = 같은 이름의 메소드이지만 매개변수가 다른것이 정의 되어있는것.

}
