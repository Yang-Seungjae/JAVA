package kr.ac.kopo.home.day11;

public class IcecreamHW {
	
	
	String name;
	int price;
	
	
	IcecreamHW(){
	}
	
	IcecreamHW(String name, int price){
		this.name = name;
		this.price = price;
		
	}
	void Info() {
		System.out.println(name + "\t" + price);
	}
}
