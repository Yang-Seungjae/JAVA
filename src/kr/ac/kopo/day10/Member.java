package kr.ac.kopo.day10;

public class Member {
	
	String name;
	int age;
	String bloodType;
	
// 변수값을 모를때 초기화 된상태로 null 0 등의 값보다는 알수없음 등으로 표기하는게 보기 편하다. 
	// 이런식으로 표기하면 모든 생성자에서 3가지의 변수를 지정하는 일이 생김
	//
	
	Member(){
	//	Member("알수없음", -1, "알수없음");// 3개 변수가진 저게 시행되길 바랬는데 에러가남 new 가 없기 때문
		this("알수없음", -1, "알수없음"); //이럴때 this 생성자로 호출함 (오버로딩된 생성자를 다시 호출할때사용)
	}
	Member(String name, int a){
		this(name, -1, "알수없음");
//		name = n;
//		age = a;
	}
	Member(String n){
		name = n;
	}
	Member(String name, int age, String bloodType){ // n a bt라고 표기하면 뭘 의미하는지 한눈에 안들어옴.
		this.name = name; // 멤버변수에 지역변수를 넣고 싶지만 생성자안에서 변수는 지역변수를 우선시해서 
					// 둘다 지역변수로 인식되어 에러남. 앞에 this. 붙이면 멤버변수로 인식
		this.age = age;
		this.bloodType = bloodType;
	}
	void info() {
		System.out.println("이름 :" + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}
}
