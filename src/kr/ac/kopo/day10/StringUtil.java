package kr.ac.kopo.day10;
// 과제 내가 한것
import java.util.Scanner;

public class StringUtil {
	
	char ch;
	int i, j;
	String str;
	String reverse;

	// 1번, 2번 
	/**문자하나를 입력하면 대문자인지 소문자인지 구별하는 메소드
	 * 
	 * @param ch 입력된 문자 하나를 의미
	 */
	void isUpperChar(char ch) {
		this.ch = ch;
		if (Character.isUpperCase(ch)) {
			System.out.println(ch + "는 대문자입니다." + true);

		} else { System.out.println(ch + "는 소문자입니다 : " + true);
		

		}
	}
	
	//3번 4번
	/**두개의 숫자를 입력하면 큰수와 작은수를 구별해 주는 메소드 
	 * 
	 * @param i 첫번째 입력된 숫자를 의미
	 * @param j 두번쨰 입력된 숫자를 의미
	 *
	 */
	void maxminMethod(int i, int j) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 숫자를 입력하시오 : ");
		i = sc.nextInt();
		j = sc.nextInt();
		
		if( i > j ) {
			System.out.printf("%d\n", i);
			
		}else {
			System.out.printf("%d\n", j);
			
		}

	}
	
	//5번
	/**문자열을 입력받아 반대 순서로 출력하는 메소드
	 * 
	 * @param str 입력받은 문자열을 의미
	 */
	void reverseString(String str) {
		
		String reverse ="";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
		
		
	}
	
	//6번
	/**문자열을 입력받으면 대문자로 출력하는 메소드
	 * 
	 * @param str 입력받은 문자열
	 */
	void toUpperString( String str ) {
		 
		System.out.println(str.toUpperCase());
		
		
	}
	//7번
	/**문자열을 입력받으면 소문자로 출력하는 메소드
	 * 
	 * @param str 입력받은 문자열
	 */
	void toLowerString( String str ) {
		
		System.out.println(str.toLowerCase());
		
	}
	
	//8번
	int compareTo(String str3, String str4) {
		
		int i = str3.compareTo(str4);
		
		
		return i;
	}
	
	//9번
	boolean endsWith(String str5, String sub) {
		
		if(str5.endsWith(sub)) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	//10번
	int indexOf(String str6, String sub2) {
		
		int i = str6.indexOf(sub2);
		
		return i;
		
		
	}
	

}
		 
		


	
	
	
	
	
	
	
	


