package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;

public class FileClose {
//	public static void close(Reader re) {
//		
//		if(re != null) {
//			try {
//				re.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public static void close(Writer wi) {
//		
//		if(wi != null) {
//			try {
//				wi.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
	//메소드 오버로딩을 이용해 해결가능. 두개 동시에 적을수있음
	public static void close(InputStream bis, InputStream is) {
		close(bis);
		close(is);
	}
	
	public static void close(OutputStream bos, OutputStream os) {
		close(bos);
		close(os);
	}

	public static void close(InputStream is) {
		
		if(is != null) {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream os) {
		if(os != null) {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
