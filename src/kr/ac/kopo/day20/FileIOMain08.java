package kr.ac.kopo.day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain08 {

	
		public static void write() {
			
			UserInfo user = new UserInfo("홍길동", 20, "010-1111-2222");
			
			FileWriter fw = null;
			PrintWriter pw = null;
			try {
				fw = new FileWriter("doc/iotest/userInfo.txt");
				pw = new PrintWriter(fw);
				
				pw.printf("%s#%d#%s\n", user.getName(), user.getAge(), user.getPhone());
				pw.flush();
				System.out.println("userInfo.txt에 저장완료...");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileClose.close(pw,fw);
			}
		}
		
		public static void read() {
			
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				fr = new FileReader("doc/iotest/userInfo.txt");
				br = new BufferedReader(fr);
				
				String data = br.readLine();
		//		System.out.println(data);
				
				String[] dataArr = data.split("#");
				System.out.println(Arrays.toString(dataArr));
				
			// int a = Integer.valueOf("23"); 문자열을 참조자료형의 integer로 변환하는것
			// int a = Integer.parseInt("23");문자열을 기본자료형의 integer로 변환하는것
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileClose.close(br,fr);
			}
			
		}
		
		public static void main(String[] args) {
			
			read();
				
			//write();
		}
}
