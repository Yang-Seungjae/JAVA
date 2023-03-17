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
		
		Student[] stArr = new Student[5];
		for(int i = 0; i < stArr.length; i++) {
			stArr[i] = new Student();
		}  /*위의 방법보다 아래의 방법으로 코드를 만들어야 유지 보수가 쉽고 편리하다.*/
		
		Student[] studentArr = {st1, st2, st3, st4, st5};
		
		int data = 0; // ���� ���Ҷ� ���� ����
		int errorcnt = 0;
		for(int i = 0; i < studentArr.length; i++) {
			System.out.println(studentArr[i]+"s ���� : " );
			studentArr[i].score = sc.nextInt();	
			}
		
		System.out.println(" < PRINT > ");
		System.out.println("��ȣ\t����\t����");
		
		
		
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
		System.out.printf("%d�� �Է� �� [%d]ȸ �����߻�\n", studentArr.length, errorcnt);
		System.out.println("���� : " +data);
		System.out.printf("��� : %.1f\n", (double)data/studentArr.length);
		sc.close();
		}	
	
		
	
	
	
	
	
	
}