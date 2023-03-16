package kr.ac.kopo.day06.exam;

public class SeungjaeHomework04 {

	
	
	public static void main(String[] args) {

		int h = 0;
		for (int i = 1; i <= 29; i++) {
			if (h < 50) {
					h+=4;
					System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %d", i, h);
					

			} else {
				h+=3;
				System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %d", i, h);
				
			}
			
			System.out.println();
			

		}
		

	}
}
