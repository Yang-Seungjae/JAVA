package kr.ac.kopo.day11.stat;

public class StringUtil {
	
	public static int checkChar(String strData, char ch) {
		
		char[] strArr = new char[strData.length()];
		int samecnt = 0;
		for(int i = 0; i < strData.length(); i++ ) {
			
			strArr[i] = strData.charAt(i);
			if(strArr[i] == ch) {
				samecnt++;
			}
			
		}
		return samecnt;	
		
	}
	
	public static String removeChar(String oriStr, char delChar) {
		
		String str = "";	
		
		for(int i = 0; i < oriStr.length(); i++ ) {
			
			if(oriStr.charAt(i) != delChar) {
				str+=oriStr.charAt(i);	
			}

		} return str;
		
	}
	
	
	
	
	
	
	
	
}
