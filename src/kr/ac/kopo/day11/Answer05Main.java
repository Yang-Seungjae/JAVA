package kr.ac.kopo.day11;

public class Answer05Main {
	public static void main(String[] args) {
		
		ScannerUtil sc = new ScannerUtil();
		StringUtilAnswer util = new StringUtilAnswer();
		
		String str = sc.nextString("문자열을 입력 : ");
		String revStr = util.reverseString(str);
		
		System.out.println(revStr);
	}

	
}
