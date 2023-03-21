package kr.ac.kopo.day11;
//프로그램을 짤때 각각의 기능을 가지는 클래스를 따로 구성해야한다. 
//그래서 스캐너 유틸같이 키보드 입력 분야랑 문자열 분야의 유틸을 분리하는게 좋다.

public class StringUtilAnswer {

	//대문자인지 확인
	boolean isUpperChar(char c) {
		
		if(c >= 'A' && c <= 'Z') {
			return true;
		}else {
		
		return false;
		}
	}
	
	int max(int num1, int num2) {
	
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
		// return num1 > num2 ? num1 : num2; 이렇게 적어도된다.

	}
	
	String reverseString(String str) {
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
		
		
	}
	
}
