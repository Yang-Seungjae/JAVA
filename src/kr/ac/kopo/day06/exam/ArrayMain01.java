package kr.ac.kopo.day06.exam;

public class ArrayMain01 {

	
	public static void main(String[] args) {
		
		
		int[] ar;
		ar = new int[10];
		
		System.out.println(ar); // 값으로 나오는 것에 @가 있는것들이 전부 주소를 의미한다. but 자바는 실제 램주소를 접근못하게 해놔서 가상주소가 나옴
		
		
		System.out.println(ar.length);
		
		
		System.out.println(ar[4]); // 변수에 값을 지정하지 않았는데도 출력결과가 나옴. heap의 영역에 있는 것은 자동으로 default로 초기화됨.
		// ar[변수] 로 표현할 수 있다. == 변수 선언을 편리하게 할수 있다.
		// for문에서 변수명을 i로 쓰는게 index를 의미함
		for(int i = 0; i < ar.length; i++) { // for문의 i = 1; 도 배열과 맞춰서 0부터 시작하는게 좋다 뒤에 i <= ar.length - 1도 귀찮으니까 작다로 바꿈
			System.out.println("ar[" + i + "] : " + ar[i]);
		}
		
		
	}
}
