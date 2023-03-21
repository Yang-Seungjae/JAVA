package kr.ac.kopo.day11;

public class StringMain04 {
	
	
	public static void main(String[] args) {
		
		String str = "Hello world";
		
		char ch = 'l';
		
		
		int idx = -1;
		while((idx = str.indexOf(ch, idx + 1)) != -1) {
			System.out.println(ch + "위치 : " + idx);
			
		}
		
		int idx2 = 10;
		while((idx2 = str.lastIndexOf(ch, idx2 - 1)) != -1){
			System.out.println(ch + "위치 : " + idx2);
			
		}
			
		/*
		int idx = str.indexOf(ch);	
		while(idx != -1) {
			
			System.out.println(ch + "위치 : " + idx);
			idx = str.indexOf(ch, idx+1);
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
