package kr.ac.kopo.day06.exam;

public class LoopMainPrac18 {

	
	public static void main(String[] args) {
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= star || 10 - j <= star) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i<5) {
				star++;
			}else {
				star--;
			}}
		
	 
	
	
	
	}
	
	
	

}

		
		
		
		
		
	
            


	


		



			
		

			
		
	
	
	






	

