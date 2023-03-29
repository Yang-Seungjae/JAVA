package kr.ac.kopo.day13;

public class CastMain02 {

	
	public static void main(String[] args) {
		
		//컴파일 오류 발생
		// Child01 c = new Parent();
		
		//실행시 오류 발생 명시적 형변환의 전제 조건인 
		//Child01 c = (Child01)new Parent();
		//		자식클래스타입 = (자식클래스)부모클래스타입 -- 반드시 부모클래스타입이 이미 묵시적 형변환 상태여야한다.
		
		Parent p = new Child01();
		
		Child01 c = (Child01)p;
	}

}
