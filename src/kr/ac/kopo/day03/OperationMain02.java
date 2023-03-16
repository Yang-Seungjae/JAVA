package kr.ac.kopo.day03;

public class OperationMain02 {

	
	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
		boolean result = ++a > 1 && ++b >= 0;
		// 컴퓨터에서 논리and 연산은 처음 연산한 a가 거짓이기에 뒤에있는 b연산 자체를 처리하지않는다
		// a가 거짓임을 본 순간 result 값을 알 수 있기 때문에 b의 ++연산이 처리되지않아 b값이 0으로 출력됌.
		// 위의 순서가 반대로 바뀌면 result값은 같지만 아래의 출력에서 a 와 b는 1로 나온다.
		
		System.out.printf("a = %d b = %d\n"  , a, b);
		System.out.print(result);
		
		
		
	}
}
