package kr.ac.kopo.day11.stat;

public class Employee { 
	/**사번
	 * 이름
	 * 연봉
	 * 직급
	 */
	int no;            // 멤버변수는 객체가 만들어 질때 메모리에 할당된다.
	String name; 
	int salary; 
	String grade;
	static int employeeCnt; // 새로운 생성자를 만들때 사원이 추가되는것이므로 생성자가 작동할때 올라가면된다는 개념
	//가장 먼저 메모리 영역에 할당되기 때문에 클래스.변수명으로 접근함.
	Employee(){
		employeeCnt++;
	}
	
	Employee(int no, String name, int salary, String grade){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}
	
	void info() {
		System.out.println("사번 :" + no + ", 이름 : " + name + ", 연봉 : " + salary +"만원" + ", 직급 : " + grade);
		
	}
	
	
	static void employeeCntInfo() {
		//static 메소드가 호출되는 시점에 객체가 만들어져있다는 보장이 없으므로
		//static 메소드안에서는 static 변수와 static 메소드 호출만 가능하다. 
		System.out.println(Employee.employeeCnt);
		
	}
	
	
}	
