package kr.ac.kopo.day06.exam;

public class ExamMain02 {

	
	
	public static void main(String[] args) {
		
			
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5; j++) {
					System.out.printf("%c", j >= i ? '*' : ' ');
				}
				
			}else {
				for(int j = 1; j <= 5; j++) {
					if(j < 10 - i) {
						System.out.print(' ');
					} else {
						System.out.print('*');
					}
				}
				
			}
			
			System.out.println();
		}
		
		
	}
	
}

