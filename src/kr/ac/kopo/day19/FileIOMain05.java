package kr.ac.kopo.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class FileIOMain05 {

	//doc/iotest/FileIOMain02.java.txt ==> doc/iotest/FileIOMain02-1.java.txt 복사
	
	public static void main(String[] args) {
		
		FileReader re = null;
		FileWriter wi = null;
		BufferedReader bre = null;
		BufferedWriter bwi = null;
		try {
			re = new FileReader("doc/iotest/FileIOMain02.java.txt");
			bre = new BufferedReader(re);
			
			wi = new FileWriter("doc/iotest/FileIOMain02-1.java.txt");
			bwi = new BufferedWriter(wi);
			
			while(true) {
				
				String data = bre.readLine();
				if(data == null) break;
				bwi.write(data);
				bwi.newLine(); // readLine에서는 엔터는 스트링에 포함하지 않기 때문에 줄바꿈으로 뉴라인 메소드를 적어줘야함.
//				이방법도 가능하지만 readLine을 사용할수도있다.
//				int c = bre.read();
//				if(c == -1) break;
//				bwi.write(c);
//				
			}
			
			bwi.flush();
			
			System.out.println("java 파일 복사 완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			
		}
		
	}
}
