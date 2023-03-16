package kr.ac.kopo.day02;

public class VariableMain02 {

	
	public static void main(String[] agrs) {
		
		
		double num = 12.34;
		
		num = /*(double) 묵시적 형변환 더 작은범주의 데이터를 생략할 수 있는것*/34; 
		// double형은 실수를 표현하는 용어인데 숫자 34는 정수이므로 잠깐동안 형변환을 시키기 위한 장치가 필요
		
		System.out.println("num : " + num );
		
		int num2 = (int)45.67;
		// 강제적(명시적) 형변환 형변환 키워드가 생략되지 않고 남아있어야만 하는 경우
	
		
		System.out.println(num + num2);
		
		float num3;
		num3 = (float)10.4; 
		num3 = 10.4f; // f = float형이라는 의미 
		/* 10.4라는 실수의 디폴트값은 더블형이기 때문에 float형으로 표현하기 위해 명시적
		형변환 키워드를 입력해줘야한다*/
		
		System.out.println(num3);
		
		
		System.out.println(12 + (int)12.34);
		System.out.println((double)12 + 12.34);
		System.out.println(12 + 12.34);
		// 더하기나 빼기를 할때 자료형이 다른경우 자연스럽게 큰 유형의 형태로 묵시적 형변환이 일어난다. 생략가능.
		
		
		String Str = "Hello";
		
		System.out.println(Str);
	
		
		int a = 1;
		System.out.println(10/3);
		System.out.println((double)10/3.);
		System.out.println(10 % 3);
		System.out.println(a++);
		
	
		
	}
}
