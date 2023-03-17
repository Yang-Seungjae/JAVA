package kr.ac.kopo.day08;

import java.util.Scanner;

public class Answer01_0316 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int[][] numArr = new int[SIZE][20];
		int loc = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. 최대" + SIZE + "개 입력, 0 입력시 종료됩니다");
		
//		while(true) {
//			numArr[loc][0] = sc.nextInt();
//			if(numArr[loc][0] == 0) {
//				break;
//			}
//			if(++loc == numArr.length) {
//				break;
//			}
//		}
		do {
			numArr[loc][0] = sc.nextInt();
			
			int j = 1;
			for(int i = 1; i <= numArr[loc][0]; i++) {
				if(numArr[loc][0] % i == 0) {
					numArr[loc][j++] = i;
				}
			}
			
			numArr[loc][0] = j-1; // numArr의 loc행 1번 값을 약수가 들어있는 칸의 번호 끝으로 지정
			
		}while(numArr[loc][0] != 0 && ++loc < SIZE);
		
		for(int i = 0; i < loc/*작거나 같다면 밑에 출력인데 작다여서 애초에 거짓*/; i++) { 
			                                         
			int idx = numArr[i][0];
			System.out.print(numArr[i][idx] + "의 약수 : ");
			for(int j = 1; j <= idx; j++)
				System.out.print(numArr[i][j] + "  ");
			System.out.println();
		}
	}
}

