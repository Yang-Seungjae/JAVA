package kr.ac.kopo.day11.stat;

import java.util.Scanner;

public class IcecreamHomeworkMain {
	
	IcecreamHomeworkMain[] iceArr;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IcecreamHomework ice = new IcecreamHomework();
		IceScanner iceText = new IceScanner();
		int no = iceText.nextInt("아이스크림 몇개 구입할래? : ");
		
		
//		
//		
//		for (int i = 0; i < no; i++) {
//			System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 입력 ***");
//			ice.iceName("아이스크림 이름 : ");
//			ice.icePrice("아이스크림 가격 : ");
//			iceArr[i] = new IcecreamHomework(name, price);
//		}
//		
		System.out.println("< 총" + no +"개의 아이스크림 구매 정보 출력");
		
	
		IcecreamHomework[] iceArr = new IcecreamHomework[no];
		for(int i = 1; i <= iceArr.length - 1; i++) {
		System.out.println("번호 : " + i + "아이스크림 명 : " +iceArr[i].name + "아이스크림 가격" + iceArr[i].price);
		}
		

	
		
		}
		
		
	}

// iceArr[i]의 주소를 입력하는 방법을 모르겠습니다 내일 질문하려합니다.
