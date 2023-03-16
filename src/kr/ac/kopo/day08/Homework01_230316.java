package kr.ac.kopo.day08;

import java.util.Scanner;

public class Homework01_230316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] iArr = new int[10][20];

// 정수 10개를 입력받는다 . 0이나오면 프로그램을 종료한다.

		for (int i = 0; i < iArr.length; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요. 0을 입력시 종료 : ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			} else {
				iArr[i][0] = n; // 아래의 반복문에서 n 값을 쓰기 위해 설정.
			}
//입력한 정수의 약수를 구하는 식을 쓴다, 약수값을 저장한다.
			for (int j = 1, k = 1; j < n; j++) {
				if (n % j == 0) {
					iArr[i][k++] = j; // 1부터 n까지 숫자로 나누어 0이면 약수 그 나눈 값이 배열에 순서대로 저장.
				}

			}

		}
// ~의 약수는 ? 반복 출력 // 1.5 for문 앞에 뭘적어야하는지 물어보기
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i][0] != 0) {
			System.out.print(iArr[i][0] + "의 약수는 : ");
			}
			
			for(int j = 1; j <= iArr[i][0]; j++) {
				if(iArr[i][j] != 0) {
				System.out.print(iArr[i][j]+" ");
				
				}
				else {
					break;
				}
				
				
			}System.out.println();
		}
		sc.close();
	
	}
}





/*System.out.println(iArr.length);
System.out.println(iArr[0].length);
System.out.println(iArr[1].length);
System.out.println(iArr[2].length);
System.out.println(iArr[3].length);*/ 
//1.5 for문 앞에 뭘적어야하는지 물어보기//질문하기
