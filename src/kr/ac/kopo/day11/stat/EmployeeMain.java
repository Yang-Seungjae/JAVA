package kr.ac.kopo.day11.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.employeeCntInfo(); 
		

		Employee e = new Employee(1, "홍길동", 3_400, "사원");// 1.7버전부터 자리수를 편하게 보기위해 _추가가능
		
		Employee e2 = new Employee(2, "고길동", 3_700, "주임");// 출력은 안된다
		
		Employee e3 = new Employee(3, "임길동", 3500, "사원");
	
		
		e.info();
		e2.info();
		e3.info();

		System.out.println(Employee.employeeCnt);// static 없이 변수로 사용하면 e123이 만들어질때 각각의 
		// employeecnt 의 영역이 생기고 +1 되므로 항상 1이 되는데 이렇게 1개의 변수로 작용해야할때 static 사용
		
		Employee.employeeCntInfo();
		// 근데 클래스변수가 자기 클래스 외부에 노출되면 외부에서 접근이가능해 수정이 가능함으로 
		//이를 다른 클래스에 만들고 
		// 호출하는 방법이 좋다 근데 불러올때 객체가 없는상태면 불러올 방법이 없기때문에 static 메소드로 작성한다.
		
	}
}
