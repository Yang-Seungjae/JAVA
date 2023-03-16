package kr.ac.kopo.day07;

import java.util.Arrays;
import java.util.Scanner;

/* 키보드로 3개의 실수를 입력받아 출력하는 코드를 작성하시오
 * 첫번째 실수 12.3
 * 두번째 실수 : 66.73
 * 세번째 실수 : 10.673
 * 
 * <PRINT>
 * 12.3   66.23   10.673
  */





public class ArrayMain03 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double[] ar = new double[3];
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print(i+1 + "번째 실수 :   ");
			ar[i] = sc.nextDouble();
			
		}
		System.out.println(" < PRINT > ");
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print(ar[i] + "\t");
			
		}
		System.out.println();
		
		/*배열의 모든 요소를 출력방식
		 * 1. index를 이용해서 출력
		 * 2. 1.5버전의 for문을 이용해서 출력
		 * 3. Arrays.toString() 을 이용해서 출력
		 * */
		
		System.out.println(" < 1.5버전의 for문을 이용한 출력 > ");
		// : ar ar0부터 마지막까지 반복 한다는 뜻 첫 루프때 data = ar[0] 2번째 루프때 data = ar[1]
		for( double data : ar) {
			
			System.out.print(data + "\t");
		}
		
		System.out.println();
		
		
		System.out.println(" < Arrays.toString() 을 이용한 출력 > ");
		
		System.out.println(Arrays.toString(ar));
		
		
	}
}
