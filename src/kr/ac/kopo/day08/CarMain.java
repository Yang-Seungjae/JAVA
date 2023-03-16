package kr.ac.kopo.day08;

//실행 클래스
public class CarMain {

	void aaa() {
		
	}
	
	public static void main(String[] args) {
		
	//	int num = 10; // aaa메소드에서 num의 변수는 의미가없다 가장 가까운 {} 안에서만 변수가 의미를 가짐.
		
		Car c = new /*kr.ac.kopo.day08. 같은 패키지에 있으면 우선적으로 인식하여 생략가능*/Car(); 
		//Car라는 클래스를 보고 heap 영역에 만들어라 // new 클래스명() // heap 영역에 만들어짐
		
		new kr.ac.kopo.day07.TV(); // 같은 패키지에 없기 때문에 에러발생
		
		//heap 영역에 있는 Car의 위치를 알기위해 이를 알려줄 Car 의 참조변수를 만들어야함
		
		 //c.model //참조변수.멤버변수 라는 뜻 // c참조변수가 가르키는 Car의 model명 이라는 뜻. 
		
		
		Car c2 = new Car();
		
		c.model = "소나타";
		c.price = 3000;
		c2.model = "모닝";
		c2.price = 1900;
	
		System.out.println("모델명 : " +c.model + ", 가격 : " + c.price);
		System.out.println("모델명 : " +c2.model + ", 가격 : " + c2.price);
		
		
		
		
		
	}
}
