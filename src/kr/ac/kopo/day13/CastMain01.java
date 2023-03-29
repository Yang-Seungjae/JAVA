package kr.ac.kopo.day13;

public class CastMain01 {

	/*
	public static void print(Child01 c) {
		c.info();		
	}
	
	public static void print(Child02 c) {
		c.info();
	}
	*/
	
		
	public static void print(Parent p) { // 묵시적 형변환을 사용하면 부모영역의 멤버변수와 메소드만 사용이가능함
		p.info();						// 이 상황에서 자식 영역의 멤버변수와 메소드를 사용하고싶을때 다시 명시적 형변환으로 자식영역 접근
	}
	
	public static void main(String[] args) {

		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
		Child01 c01 = new Child01();
		c01.info();
		
		Child02 c02 = new Child02();
		c02.info();
		
		Parent p = new Parent();
		p.info();
		
		System.out.println(c01);
		System.out.println(c02);
		System.out.println(p);
		/*
		Child01 c01 = new Child01();
		c01.info();
		c01.sleep();
		c01.study();
		
		Parent p = new Child01();
		p.info();
//		p.sleep();	// 접근불가
//		p.study();	// 접근불가
		*/
	}
}





