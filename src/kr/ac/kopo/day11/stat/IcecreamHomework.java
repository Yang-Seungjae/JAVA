package kr.ac.kopo.day11.stat;

import java.util.Scanner;

public class IcecreamHomework {
	
	
	String name;
	int price;
	Scanner sc;
	IcecreamHomework() {
		
		sc = new Scanner(System.in);

	}

	IcecreamHomework(String name, int price) {
		this.name = name;
		this.price= price;

	}

	String iceName(int no) {
		IcecreamHomework[] iceArr = new IcecreamHomework[no];
		int i = 0;
		for(i = 0; i < no; i++) {
			iceArr[i].name = sc.next();
			
		}
		return String.valueOf(iceArr[i]);
//		
//		System.out.println(str);
//		name = sc.nextLine();
//		
//
//		return name;

	}

	String icePrice(int no) {
		
		IcecreamHomework[] iceArr = new IcecreamHomework[no];
		int i = 0;
		for(i = 0; i < no; i++) {
			iceArr[i].price = sc.nextInt();
			
		}
		return String.valueOf(iceArr[i]);
//		System.out.println(str);
//		price = sc.nextInt();
//
//		return price;
	}
	
	

}
