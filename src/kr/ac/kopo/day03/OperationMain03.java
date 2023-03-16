package kr.ac.kopo.day03;

public class OperationMain03 {
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
		
		
		
	
	
	
	
	
	
	}
}
