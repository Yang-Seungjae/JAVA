package kr.ac.kopo.day10;
/*생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환값 존재 안함
 * 3. default 생성자 지원 : 클래스내에 생성자가 하나도 정의되어 있지 않은 경우 JVM에서 자동으로 생성
 * 4. 생성자 오버로딩 지원
 * 5. 멤버변수값을 초기화
 * */
class Dog {
	// Dog 클래스를 따로 만드는것과 완전 같은 개념은 아니다. 
	Dog(){
		System.out.println("디폴트 생성자 Dog() 호출 ...");
	}
	Dog(int i){
		System.out.println("Dog(int) 생성자 호출...");
	}
	//기본적으로 매개변수가 있는 생성자를 만드려할때 디폴트 생성자를 먼저 만들고 그 뒤에 만드는걸 습관화
}
public class ConstructorMain01 {
	
	
	public static void main(String[] args) {
		
		//new Dog();// 생성자 호출 정의안해도 에러안나는건 default 생성자를 JVM이 자동으로 만들기 때문
		
		new Dog(10);
		
	}

}
