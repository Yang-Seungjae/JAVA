package kr.ac.kopo.day09;

public class MethodMain01 {
	// 같은 클래스 안에 다른 메소드 끼리 상호작용

	

	static int /*void*/prnStar(int num , String data) {
		/*void 위치에 적는거 = 피호출자 메소드가 호출자 메소드에게 값을 전달하는 부분이다. void = 전달할게 없다는 의미*/ 
		// 호출자메소드가 피호출자메소드에 자신이 가진 변수 값을 전달하고 싶을때 피호출자의 ()로 전달한다.
		// 12번라인과 26번 라인의 a라는 변수는 서로 남남이다. 독립적인 개체. 메소드와 메소드끼리는 변수를 공유할수없다.
		int a = 10;
		System.out.println("**********");
		System.out.println("호출자가 넘겨준 정수 : " + num);// 호출자메소드에서 넘어온 변수값을 저장하기위한 변수 이름이 num 
		//변수명은 상관없음
		int sum = num%10 + num/10;
		
		
			return sum;
		//System.out.println("호출자가 넘겨준 문자열 :" + data);
		
		
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;// 호출자메소드가 피호출자메소드에 자신이 가진 변수 값을 전달하고 싶을때 피호출자의 ()로 전달한다.
		prnStar(b , "abc");
		System.out.println("Hello");
		prnStar(71, "");
		System.out.println("HI");
		int s = prnStar(62, "HI");
		System.out.println("Good-bye");
		s = prnStar(5, "Good-bye");
	}
}


// int prnStar (){}  피호출자 메소드에서 호출자 메소드에 값을 보낼때 보내는 값의 타입을 void자리에 넣어준다.
// return a ; 