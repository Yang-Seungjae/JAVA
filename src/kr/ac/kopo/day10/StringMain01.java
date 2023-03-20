package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello");
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(chars);
		byte[] bytes = {72, 101, 108, 108, 111};
		String str4 = new String(bytes);
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		System.out.println(str + "의 길이 : " + str4.length());// 배열의 길이를 보는 api
		for( int i = 0; i < str4.length(); i ++) {
			System.out.println(i + "번째 문자 : " + str4.charAt(i)); // 특정 배열위치의 값을 보는 api
		}
		
		chars = new char[10];
		
		str4.getChars(0, str4.length(), chars, 0); // 문자열의 일부를 문자 배열로 전환하는 api 위치 지정 가능
		System.out.println("chars : " + Arrays.toString(chars));
		str4.getChars(2, 4, chars, 6);
		System.out.println("chars : " + Arrays.toString(chars));
		
	}
}
