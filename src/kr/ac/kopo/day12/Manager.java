package kr.ac.kopo.day12;

public class Manager extends Employee {

	Employee[] empList;

	public Manager() {
		super();
	}

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}

	
	
	
}
