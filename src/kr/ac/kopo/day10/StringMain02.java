package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {

		String str01 = new String("Hello World");
		String str02 = new String("hello world");

		System.out.println("str01 : [" + str01 + "]");
		System.out.println("str02 : [" + str02 + "]");

		// 주소비교
		if (str01 == str02) {
			System.out.println("[주소비교]str01 == str02");
		} else {
			System.out.println("[주소비교]str01 != str02");
		}

		// 값비교(대소문자 구분o)
		boolean bool = str01.equals(str02);
		if (bool) {
			System.out.println("[값비교]str01 == str02");
		} else {
			System.out.println("[값비교]str01 != str02");
		}

		// 값비교(대소문자 구분X)
		bool = str01.equalsIgnoreCase(str02);
		if (bool) {
			System.out.println("[값비교]str01 == str02");
		} else {
			System.out.println("[값비교]str01 != str02");
		}

		String[] names = { "홍길동", "강길동", "홍길순", "홍길동", "김길순", "김길남", "길동홍" };

		System.out.println("names : " + Arrays.toString(names));
		System.out.println("< 홍길동인 사람을 검색 >");
		for (String name : names) {
			if (name.equals("홍길동")) {
				System.out.println(name);
			}
		}

		System.out.println("< 홍씨성을 가진 사람을 검색 >");
		for (String name : names) {
			if (name.startsWith("홍")) {
				System.out.println(name);
			}
		}

		System.out.println("< 이름 길동인 사람을 검색 >");
		for (String name : names) {
			if (name.endsWith("길동")) {
				System.out.println(name);
			}
		}

		System.out.println("< \"길동\"이 포함된 사람을 검색 >");
		for (String name : names) {
			if (name.contains("길동")) {
				System.out.println(name);
			}
		}

		str01 = "boat";
		str02 = "banana";

		int cmp = str01.compareTo(str02);
		if (cmp == 0) {
			System.out.println(str01 + " == " + str02);
		} else if (cmp > 0) {
			System.out.println(str02 + " < " + str01);
		} else {
			System.out.println(str01 + " < " + str02);
		}
		
		//
		
		
		
		String str = "Hello World";
		char ch = 'r';
		
		System.out.println("str : [" + str + "]");
		int idx = str.indexOf(ch);
		System.out.println(ch + "위치 : " + idx);
		
		ch = 'p';
		System.out.println(ch + "위치 : " + str.indexOf(ch));
		
		String searchStr = "lo";
		System.out.println(searchStr + "위치 : " + str.indexOf(searchStr));
		
		ch = 'l';
		System.out.println("indexOf()     " + ch + "위치 : " + str.indexOf(ch));
		System.out.println("indexOf()     " + ch + "위치 : " + str.indexOf(ch, 3));
		System.out.println("lastIndexOf() " + ch + "위치 : " + str.lastIndexOf(ch));

	}

}
