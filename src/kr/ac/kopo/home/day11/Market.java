package kr.ac.kopo.home.day11;

import java.util.Scanner;

public class Market {
	
	IcecreamHW[] iceArr;
	Scanner sc;
	
	Market(){
		
		sc = new Scanner(System.in);

	}
	
	// 숫자 입력받기
	int getInt(String msg) {
		System.out.println(msg);
		//int num = Integer.parseInt(sc.nextLine()); // 이부분에 nextInt로하면 오류가나는데 이유알아보기
		int num = sc.nextInt();
		sc.nextLine();
		// nextInt();로 입력받으면 입력 버퍼에 엔터 등의 잔여물이 남아있어서 이 뒤에 문자열을 찍는걸 반복하면
		//에러가뜬다 이를 해결하기 위해 sc.nexLine();쳐서 버퍼를 지워준다.
		
		return num;
	}
	//문자 입력받기
	String getStr(String str) {
		System.out.println(str);
		
		return sc.nextLine();
	
	}
	//구매단계
	
	void buy() {
		
		
		// 아이스크림 몇개 살래?
		int num = getInt("아이스크림 몇개 살래? : ");
		iceArr = new IcecreamHW[num];
		// 아이스크림 구매정보 반복 출력
		for (int i = 0; i < iceArr.length; i++) {
			System.out.println("***" + (i+1) + "번째 아이스크림 구매 정보 출력 ***");
			String name = getStr("아이스크림 명 : ");
			int price = getInt("아이스크림 가격 : ");
			iceArr[i] = new IcecreamHW(name, price);
		}

		// 총 구매 정보 출력
		System.out.println("< 총" + num + "개의 아이스크림 구매 정보 출력 >");
		System.out.println("번호\t" + "이름\t" +" 가격");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.print( (i+1) + "\t");
			 iceArr[i].Info();
		}
		IcecreamHW.totalInfo();

	}
	
	

	}
	
	
	
	
