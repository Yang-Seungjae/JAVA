package kr.ac.kopo.day06.exam;

public class LoopMainPrac17 {

	
	public static void main(String[] args) {
		
		
		
		
		
		
		int star2 = 3;
		int star = 9;
		for(int i = 1; i <=9; i++) {
			
			if(i <= 5) {
			for(int j = 1; j<= i - 1; j++) {
				
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				
				System.out.print("*"); // star  = 2n-1 의 규칙 변수 star 없이도 2*(6-i)-1 로 적을수있다.
				
			}
			System.out.println();
			star-=2;
			
		}
		else {
		
		
			for(int j = 1; j<= 9 - i; j++) {
				
				System.out.print(" ");
			}
			for(int j = 1; j <= star2 ; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			star2+=2;
			
			
			}
		}

	}
            
}

	


		



			
		

			
		
	
	
	






	

