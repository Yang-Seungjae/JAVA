package kr.ac.kopo.day10;

public class MethodExamMain {

	public static void main(String[] args) {
		
		MethodExam exam = new MethodExam();
		
		int total = exam.getTotal(10, 100);
		System.out.println("10 ~ 100사이의 총합 : " + total );
		
		exam.printGugudan(5);
		exam.printGugudan(); // 오버로딩을 활용하여 같은 이름의 메소드로 여러기능 사용.
		
		System.out.println("시작단 : ");
		int startDan = exam.getInt();
		System.out.println("종료단 : ");
		int endDan = exam.getInt();
		
		exam.printGugudan(startDan, endDan);
		
		
		
			
		}
		
	}

