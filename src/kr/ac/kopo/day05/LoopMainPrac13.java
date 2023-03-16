package kr.ac.kopo.day05;

public class LoopMainPrac13 {

	
	public static void main(String[] args) {
		
		
		
		for (int i = 1; i <= 9; i++)

			if (i <= 5) {
				{

					for (int k = 1; k <= i - 1; k++) {
						System.out.print(" ");
					}

					for (int j = 1; j <= 6 - i; j++)

						System.out.print("*");
				}

				System.out.println();
			}

			else {
				for (int e = 1; e <= 9 - i; e++) {
					System.out.print(" ");
				}

				for (int f = 1; f <= i - 4; f++)

					System.out.print("*");
				System.out.println();
			}
            	
            
		}
           
            
	}

		



			
		

			
		
	
	
	






	

