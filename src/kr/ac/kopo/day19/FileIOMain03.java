package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {

	
	public static void main(String[] args) {

		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("doc/iotest/Desert.jpg"); // dos모드에서는 대소문자를 구별하지않아서 Desert에 d로 적어도 에러x
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("doc/iotest/Desert3.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("Desert3.jpg 복사 완료....");
			
			
			
			System.out.println("소요시간 : " + (end - start)/1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
			
			
			/*FileClose.close(bis);
			FileClose.close(fis);
			FileClose.close(bos);
			FileClose.close(fos);*/ //총과 소음기가 하나로 보면 
		}
		
		
		/*finally {
			if(bis != null) {
				
			try {
				bis.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			}
			if(bos != null) {
				
			try {
				bos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			
			}
		}*/
		
		
	}
}
