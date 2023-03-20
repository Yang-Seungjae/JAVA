package kr.ac.kopo.day10;

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		
	/*	Member m = new Member();
	
		m.name = "홍길동";
		m.age = 25;
		m.bloodType = "A";
		원래 이렇게 정의 할 수 있지만 객체지향적이지 않다. Member 클래스에 멤버변수값을 수정하면 메인메소드의 내용도 수정해야함  --유지보수에 별로
	*/
		
		Member m = new Member("홍길동", 25, "A");
		Member m2 = new Member();
		Member m3 = new Member("홍길순");
		Member m4 = new Member("강길동", 30);
		
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
		
		
	}
	
	
}
