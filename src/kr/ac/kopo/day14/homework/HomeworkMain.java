package kr.ac.kopo.day14.homework;

public class HomeworkMain {

	public static void main(String[] args) {
		
//		FigureView view = new FigureView();
//		view.process();
		
		Circle c = new Circle(10);
		c.printArea();
		
		Triangle t = new Triangle(3, 4);
		t.printArea();
		
		Rectangle r = new Rectangle(3,4);
		r.printArea();
		
		Square s = new Square(3);
		s.printArea();
	}
}







