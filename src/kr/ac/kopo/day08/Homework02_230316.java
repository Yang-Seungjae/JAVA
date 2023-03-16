package kr.ac.kopo.day08;

import java.util.Scanner;

public class Homework02_230316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		
		Student[] studentArr = {st1, st2, st3, st4, st5};
		
		int data = 0; // 총합 구할때 변수 설정
		int errorcnt = 0;
		for(int i = 0; i < studentArr.length; i++) {
			System.out.println(studentArr[i]+"s 성적 : " );
			studentArr[i].score = sc.nextInt();	
			}
		
		System.out.println(" < PRINT > ");
		System.out.println("번호\t성적\t학점");
		
		
		
		for (char i = 0; i < studentArr.length; i++) {
			if (0 <= studentArr[i].score && studentArr[i].score <= 100) {

				if (90 <= studentArr[i].score) {
					studentArr[i].grade = 'A';
				} else if (80 <= studentArr[i].score) {
					studentArr[i].grade = 'B';
				} else if (70 <= studentArr[i].score) {
					studentArr[i].grade = 'C';
				} else if (60 <= studentArr[i].score) {
					studentArr[i].grade = 'D';
				} else if (studentArr[i].score < 60) {
					studentArr[i].grade = 'F';
				}
				System.out.printf("%d\t" + "%d\t" + "%s\n", (i + 1), studentArr[i].score, studentArr[i].grade);
				data+=studentArr[i].score; 
			} else {
				System.out.println("ERROR!!");
				errorcnt++;
			}
			
			
		}
		System.out.printf("%d명 입력 중 [%d]회 에러발생\n", studentArr.length, errorcnt);
		System.out.println("총점 : " +data);
		System.out.printf("평균 : %.1f\n", (double)data/studentArr.length);
		sc.close();
		}	
	
		
	
	
	
	
	
	
}