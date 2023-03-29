package kr.ac.kopo.day16.homework;

import java.util.Arrays;

public class LottoView {

	public void start() {
		
//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}
		
	}
	
	private int[] getLotto() {
		
		return null;
	}
}












