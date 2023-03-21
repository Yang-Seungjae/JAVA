package kr.ac.kopo.day11;

public class StringAnswer {
	
	public static void main(String[] args) {
		
		ScannerUtil sc = new ScannerUtil();
		
		char c = sc.nextChar("문자를 입력 : ");
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("문자를 입력 : ");
//		char c = sc.nextLine().charAt(0); // 사용자마다 문자를 입력할수도 안할수도 있어서 
		//유틸에 있는 메소드는 판단만 해야한다.

		
		StringUtilAnswer util = new StringUtilAnswer();
		
		boolean bool = util.isUpperChar(c);
		if(bool) {
			System.out.println(c + "대문자가 맞습니다.");
		}else {
			System.out.println(c + "대문자가 아닙니다.");
		}
		
		
		int num1 = sc.nextInt("첫번째 정수를 입력 : ");
		int num2 = sc.nextInt("두번째 정수를 입력 : ");
		int maxNum = util.max(num1, num2);
		System.out.println(num1 + ", " + num2 + "중 큰수 : " + maxNum);
		
		
	}
	

}
