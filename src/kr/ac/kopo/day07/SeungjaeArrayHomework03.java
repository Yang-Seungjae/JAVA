package kr.ac.kopo.day07;

import java.util.Scanner;

public class SeungjaeArrayHomework03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int[] score = new int[5];// 성적 입력 변수 5개 만들기
		char[] grade = new char[5];// 학점 변수 5개
		int data = 0; // 총합 구할때 변수 설정
		int errorcnt = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"s 성적 : " );
			score[i] = sc.nextInt();	
			}
		
		System.out.println(" < PRINT > ");
		System.out.println("번호\t성적\t학점");
		
		
		
		for (char i = 0; i < score.length; i++) {
			if (0 <= score[i] && score[i] <= 100) {

				if (90 <= score[i]) {
					grade[i] = 'A';
				} else if (80 <= score[i]) {
					grade[i] = 'B';
				} else if (70 <= score[i]) {
					grade[i] = 'C';
				} else if (60 <= score[i]) {
					grade[i] = 'D';
				} else if (score[i] < 60) {
					grade[i] = 'F';
				}
				System.out.printf("%d\t" + "%d\t" + "%s\n", (i + 1), score[i], grade[i]);
				data+=score[i]; 
			} else {
				System.out.println("ERROR!!");
				errorcnt++;
			}
			
			
		}
		System.out.printf("%d명 입력 중 [%d]회 에러발생\n", score.length, errorcnt);
		System.out.println("총점 : " +data);
		System.out.printf("평균 : %.1f\n", (double)data/score.length);
		
		}	
		
	
	
	
	
	
	
}
