package kr.ac.kopo.day08;

public class ArrayMain04 {
	//"하이테크" "자바 " 교육"

	public static void main(String[] args) {
		
	int loc = 0;
	
	
	String[] strArr = new String[5];
	strArr[loc++] = "하이테크";
	strArr[loc++] =	"자바";
	strArr[loc++] =	"인공지능소프트웨어과";// 변수를 이용해서 지정하게되면 중간에 값을 추가해도 순서대로 넣는게 가능
	strArr[loc++] =	"교육";
	    
	/*strArr[0] = "하이테크";
	strArr[1] = "자바";
	strArr[2] = "교육";*/
	for(int i = 0; i < strArr.length; i++) {
	System.out.println(strArr[i]);
	}

}
}
