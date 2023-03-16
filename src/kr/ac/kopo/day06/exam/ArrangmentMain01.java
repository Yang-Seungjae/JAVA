package kr.ac.kopo.day06.exam;

public class ArrangmentMain01 {

	
	public static void main(String[] args) {
		
		int[] prime; 
		prime = new int[3];
		
		prime[0] = 10;
		prime[1] = 20;
		prime[2] = 30;
		
		// int[] prime = {10, 20, 30}; 이렇게 적으면 변수 prime[0,1,2]의 값을 10 20 30으로 바로 넣으면서 배열을 만들어라 라는 초기화의 의미를 가짐
		// int[] prime = new int[]{10, 20, 30}; 
		System.out.println(prime.length);
		
				
	}
}
