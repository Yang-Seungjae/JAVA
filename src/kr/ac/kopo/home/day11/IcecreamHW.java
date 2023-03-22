package kr.ac.kopo.home.day11;

public class IcecreamHW {
	
	static int total;
	String name;
	int price;
	
	
	IcecreamHW(){
	}
	
	IcecreamHW(String name, int price){
		this.name = name;
		this.price = price;
		IcecreamHW.total+=price;// 매출액개념이 되어버리고 일회성을 의미할수없다.
	}
	void Info() {
		System.out.println(name + "\t" + price);
	}
	
	public static void totalInfo() {
		System.out.println("총액" + IcecreamHW.total + "원");
		
	}
}
