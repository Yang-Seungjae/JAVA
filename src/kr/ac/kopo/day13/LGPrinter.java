package kr.ac.kopo.day13;

public class LGPrinter extends Print{

	
	
	public LGPrinter() {
		model = "LG프린터";
		
		
	}
	@Override
	public void print() {
		
		System.out.println(model + "에서 출력중....");
		
	}
	
}
