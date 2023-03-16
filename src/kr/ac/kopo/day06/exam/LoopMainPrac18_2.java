package kr.ac.kopo.day06.exam;

public class LoopMainPrac18_2 {

	
	public static void main(String[] args) {
		
		int space = 0;
		int space2 = 0;
		for(int i = 1; i <=9; i++) {
			
			if (i <= 5) {
				for (int j = 1; j <= 9; j++) {

					if (1 + space < j && j < 9 - space) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}
				System.out.println();
				space++;
			} else {

				for (int j = 1; j <= 9; j++) {
					if (4 - space2 < j && j < 6 + space2) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
				space2++;
			}
		}
	
	
	}
	
	
	

}

		
		
		
		
		
	
            


	


		



			
		

			
		
	
	
	






	

