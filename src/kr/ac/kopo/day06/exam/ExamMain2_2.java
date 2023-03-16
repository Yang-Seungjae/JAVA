package kr.ac.kopo.day06.exam;

public class ExamMain2_2 {

	
	
	public static void main(String[] args) {
		
		int star = 5;
		//int space = 0;	
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 5 - star/*space*/; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			if(i < 5) {
				//space++;
				star--;
			}else {
				//space--;
				star++;
			}
		}
		
		
	}
	
}

