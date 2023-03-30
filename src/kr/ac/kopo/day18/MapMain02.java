package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private String name;
	private String phone;
	
	Employee(String name, String phone){
		this.name = name;
		this.phone = phone;
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		Employee e = (Employee)obj;
//		if(this.name.equals(e.name) && this.phone.equals(e.phone)) {// 객체와 객체를 비교할때 equals 메소드 사용
//			return true;
//		}
//		return false;
//		if(this.name.equals(((Employee)obj).name)) {
//			if(this.phone.equals(((Employee)obj).phone)) {
//				return true;
//			}
//			
//		}
//		return false;
//	
//	}
//
//	@Override
//	public int hashCode() {
//		
//		return super.hashCode();
//	}
//	
	
// 위의 두개의 메소드를 해줘야 객체와 객체를 비교할때 해쉬코드와 이퀄스가 둘다 같아야 같은거로 보기때문에 
	// 이 두개를 편의하게 하기위해 source에 기능을 사용한다.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
}

class Car {
	String model;
	String no;
	
	Car(String model, String no){
		this.model = model;
		this.no = no;
		
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		

		
		Map<Employee, Car> carList = new HashMap<>();
		
		carList.put(new Employee("홍길동", "010-1111-2222"),new Car("소나타", "123나4567"));
		carList.put(new Employee("고길동", "010-3333-4444"),new Car("산타페", "456나7890"));
		carList.put(new Employee("한길동", "010-5555-6666"),new Car("포르쉐", "147나8523"));
		carList.put(new Employee("홍길동", "010-1111-2222"),new Car("벤츠", "789나4697"));  
//그냥 이렇게 입력하면 첫번째거랑 같다는 표시가 필요함
// 근데 이렇게 적어도 그냥 위에 거가 적용되는데 왜 그런거지?
//==> 자신의 클래스안에 위의 equals 와 hashcode에 관한 메소드가 정의되어있으면 Map과같이 자바에서 제공하는 기능들은 자동으로 객체를 비교한다.
// 정의 위치를 employee 클래스위에 상속받는 클래스가 있으면 위에만 정의해도되는건가
		System.out.println("등록된 차량 대수 : " + carList.size());
		
		
	}
}
