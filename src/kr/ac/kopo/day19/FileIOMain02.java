package kr.ac.kopo.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {
	
	// doc/iotest.Desert.jpg 파일을 doc/iotest.Desert2.jpg에 복사 
	// IN                              OUT
	
	public static void main(String[] args) {
		 
		try {
			FileInputStream fis = new FileInputStream("doc/iotest/Desert.jpg");
			FileOutputStream fos = new FileOutputStream("doc/iotest/Desert2.jpg");
			
			long start = System.currentTimeMillis();// 시간을 밀리세컨드로 찍는 명령어
			
			while(true) {
				int c = fis.read();
				if(c == -1) {
					break;
				}
				fos.write(c);
			}
			fos.flush();// byteStream 에 남아있을수 있는 버퍼를 완전히 옮기는 명령어
			long end = System.currentTimeMillis();
			System.out.println("Desert2.jpg에 복사완료...");
			
			System.out.println("소요시간 : " + (end - start)/1000. + "초");
		} catch (FileNotFoundException fnfe) {
			
			fnfe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
