package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		System.out.println("==== start ====");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		try {
			System.out.println("random : " + random);
			System.out.println(10 / random);
			
			String str = "hello";
			System.out.println(str.charAt(5));
			
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("==== end ====");
		
	}
}


