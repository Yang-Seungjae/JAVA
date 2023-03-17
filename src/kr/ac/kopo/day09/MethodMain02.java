package kr.ac.kopo.day09;

public class MethodMain02 {
	/*다른 클래스에 있는 메소드 불러오기
	 1. new 키워드를 이용해 눈에 보이게 객체를 만든다.
	 2. 사용하기 위해 참조변수 만듬
	 3. 참조변수.실행메소드();
	 */

	public static void main(String[] args) {
		
		Method m = new Method(); //1번 , 2번
		m.call();//3번
		m.call(10);
		m.call('a');// 크기에 따른 묵시적 형변환이 일어나 char 메소드가 없지만 그다음 크기인 int 로 출력
		// 메소드 오버로딩. 
		
		
	}

}