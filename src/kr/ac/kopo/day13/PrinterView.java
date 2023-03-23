package kr.ac.kopo.day13;

import java.util.Scanner;

public class PrinterView {
	
	private Scanner sc = new Scanner(System.in);
	
	public void work() {
		
		
		System.out.println("출력할 프린터를 선택하세요(1. LG 2. SAMSUNG ) :");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
//		switch(choice) {
//		case 1 : 
//			LGPrinter lg = new LGPrinter();
//			lg.print();
//			break;
//		case 2 : 
//			SamsungPrinter sam = new SamsungPrinter();
//			sam.print();
//			break;
//		case 3 : 
//			
//			Print err = new LGPrinter();
//			err.error();
		
		Print p = null;
		
		switch(choice) {
		case 1 :
		p = new LGPrinter();
		break;
		case 2 :
		p = new SamsungPrinter();
		break;
		default :
			System.out.println("잘못입력하였습니다");
		}
		if(p != null) {
			p.print();
		}
		
		
		}
		
		
		
	}


