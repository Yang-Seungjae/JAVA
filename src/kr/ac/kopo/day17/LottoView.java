package kr.ac.kopo.day17;



import java.util.Arrays;
import java.util.Random;

public class LottoView {
	private Random r = new Random();

	public void start() {
		
//		System.out.print("게임수를 입력 : );
		int gameCnt = 3;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}
		
	}
	
	private int[] getLotto() {
	
		int[] lottoNums = new int[6];
		loop : for(int i = 0; i < lottoNums.length; ) {
			lottoNums[i] = r.nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					
					continue loop;
				}
			}
			
				i++;
			
		}
		
		return lottoNums;
	}
	
	private int[] getLotto2() {
		
		int[] lottoNums = new int[6];
		int[] nums = new int[45];
		
		
		for(int i = 0; i < lottoNums.length; ) {
			nums[i] = i + 1;
		}

		for (int i = 0; i < 6; i++) {
			int randIdx = r.nextInt(45 - i);
			
			int temp = nums[randIdx];
			nums[randIdx] = nums[45 - 1 - i];
			nums[45 - 1 - i ] = temp;
		}
			
		
		System.arraycopy(nums, nums.length-lottoNums.length, lottoNums, 0, lottoNums.length); // 규칙 공부
		
		 
		
		
		
		
		
		
		
		return lottoNums;
		
	}
}
