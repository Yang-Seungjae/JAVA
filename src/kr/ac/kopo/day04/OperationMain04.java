package kr.ac.kopo.day04;

public class OperationMain04 {
/* 두개 정수 입력 : 12 5
   12는 5의 배수판단 : false
   
   두개 정수 입력 : 12 6
   12는 6의 배수판단 : true
   */
	
	public static void main(String[] args) {
	
		int num01 = 12, num02 = 3;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		// 분모는 0이 될 수 없는걸 해결하기위한 논리연산 사용 0인경우 앞의 결과가 false이므로 뒤에 연산을 처리하지 않음.
		
		
		System.out.printf("%d는 %d의 배수판단 : %b\n", num01, num02, bool);
		
		System.out.println(bool ? "배수이다" : "배수가아니다");
		// 3항연산자 (조건연산자)를 이용하여 true, false를 배수이다, 배수가 아니다라고 출력할수있다. 
		
		// String Ms = true ? "배수이다" : "배수가아니다";
		// System.out.println(Ms);
	
		
		// 출력할때만 쓰는게아니고 변수에도 사용가능
	
		String result = bool ? "배수이다" : "배수가아니다";
			
			System.out.printf("%d는 %d의 배수판단 : %s\n", num01, num02, result);
	    
			if(bool){System.out.printf( "%d는 %d의 배수판단 : %s\n", num01, num02, result);}
			
	
	
	
	
	}
}
