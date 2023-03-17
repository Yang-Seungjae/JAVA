package kr.ac.kopo.day08;

import java.util.Scanner;

public class Homework01_230316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] iArr = new int[10][20];

// ���� 10���� �Է¹޴´� . 0�̳����� ���α׷��� �����Ѵ�.

		for (int i = 0; i < iArr.length; i++) {
			System.out.print((i + 1) + "��° ������ �Է��ϼ���. 0�� �Է½� ���� : ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			} else {
				iArr[i][0] = n; // �Ʒ��� �ݺ������� n ���� ���� ���� ����.
			}
//�Է��� ������ ����� ���ϴ� ���� ����, ������� �����Ѵ�.
			for (int j = 1, k = 1; j <= n; j++) {
				if (n % j == 0) {
					iArr[i][k++] = j; // 1���� n���� ���ڷ� ������ 0�̸� ��� �� ���� ���� �迭�� ������� ����.
				}

			}

		}
// ~�� ����� ? �ݺ� ��� // 1.5 for�� �տ� ��������ϴ��� �����
		for (int i = 0; i < iArr.length; i++) {
			if(iArr[i][0] != 0) {
			System.out.print(iArr[i][0] + "�� ����� : ");
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
//1.5 for�� �տ� ��������ϴ��� �����//�����ϱ�
