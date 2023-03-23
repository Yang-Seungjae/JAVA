package kr.ac.kopo.day13;

public class SamsungPrinter extends Print{
	
	
	
	
	
	public SamsungPrinter() {
		model = "삼성프린터";
		
		
	}
	
	@Override
	public void print() {

		System.out.println(model + "에서 출력중....");

	}

}
