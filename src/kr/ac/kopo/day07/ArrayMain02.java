package kr.ac.kopo.day07;

public class ArrayMain02 {

	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (i+1) * 10;
			// == int[] arr = {10, 20, 30, 40, 50};  int[] arr = new int[] {10, 20, 30, 40, 50}
		}
		/*
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
		for(int i = 0; i < arr.length; i++) {
		
		System.out.print(arr[i] + " ");
		
		}
		
	}
}
