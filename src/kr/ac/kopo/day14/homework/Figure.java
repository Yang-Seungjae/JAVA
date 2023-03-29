package kr.ac.kopo.day14.homework;

public abstract class Figure {

	private double area;
	
	public double getArea() {
		return this.area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void printArea();
}




