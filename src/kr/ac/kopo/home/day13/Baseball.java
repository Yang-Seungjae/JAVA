package kr.ac.kopo.home.day13;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int no1, no2, no3;
		int user1, user2, user3;
		int outcnt = 0;
		int strikeCnt = 0, ballCnt = 0;

		while (true) {

			while (true) {

				no1 = random.nextInt(10);
				no2 = random.nextInt(10);
				no3 = random.nextInt(10);
				if (!(no1 == no2 || no2 == no3 || no3 == no1)) {
					
					break;
				}
			}
			System.out.println("정답:" + no1 + "" + no2 + "" + no3);

			while (true) {
				System.out.println("3개의정수를 입력하세요(0~9)");
				user1 = sc.nextInt();
				user2 = sc.nextInt();
				user3 = sc.nextInt();

				
				if (no1 == user1)
					strikeCnt++;
				if (no2 == user2)
					strikeCnt++;
				if (no3 == user3)
					strikeCnt++;

				
				if (no1 == user2 || no1 == user3)
					ballCnt++;
				if (no2 == user1 || no2 == user3)
					ballCnt++;
				if (no3 == user1 || no3 == user2)
					ballCnt++;

				
				if (strikeCnt == 3) {
					System.out.println("3스트라이크 게임종료");

					break;
				} else if (outcnt == 3) {
					System.out.println("3아웃 게임에서 패배했습니다");
					break;
				} else {
					
					if (strikeCnt == 0 && ballCnt == 0) {
						System.out.println("아웃입니다");
						outcnt++;
					} else {
						System.out.printf("%d스트라이크, %d볼\n", strikeCnt, ballCnt);
					}
					
					strikeCnt = 0;
					ballCnt = 0;
					if (outcnt == 3) {
						System.out.println("3아웃 게임에서 패배했습니다");
						System.exit(0);
						break;
					}

				}
			}sc.close();
		}

		} 
	}

