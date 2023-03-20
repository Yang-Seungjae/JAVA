package kr.ac.kopo.day09;

import java.util.Random;
import java.util.Scanner;

public class GameHomework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int random = r.nextInt(100);
		int max = 100;
		int min = 1;
		

		System.out.println("컴퓨터가 생각하고 있는 1~100사이의 정수를 맞추시오. 기회는 총 5번");
		
		for(int i = 6; i >= 1; i --) {
			int num = sc.nextInt();
			System.out.println(min + " - " + max + " : "  + num);
			
			if(random == num) {
				System.out.println("축하합니다. 정답입니다");
				break;
				
			}else if(i == 1) {
				System.out.printf("기회는 총 %d번 남았습니다.\n", 0);
				System.out.println("아쉽습니다. 기회를 소진하셨습니다.");
				System.out.printf("정답은 [%d] 입니다.", random);
				
				
			}else if(num > random) {
				System.out.println(num + "보다 작은수 입니다.");
				System.out.printf("기회는 총 %d번 남았습니다.", i-1);
			
				
			}else if(num < random){
				System.out.println(num + "보다 큰수 입니다.");
				System.out.printf("기회는 총 %d번 남았습니다.", i-1);
				
			}
			if(num < min || max < num) {
				i++;
			}else if(num > random) {
				max = num - 1;
			}else if(num < random) {
				min = num + 1;
			}
			
			System.out.println();
		}
		sc.close();

	}

}
