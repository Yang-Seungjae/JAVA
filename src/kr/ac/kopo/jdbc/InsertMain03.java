package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.JDBCClose;

public class InsertMain03 {

	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터 연결 후 연결객체 얻어오기 -- 연습용 실제로 이렇게 올리면 개인정보가 모두 노출되어버림.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);
			//3단계
			Scanner sc = new Scanner(System.in);

			System.out.println("삽입할 id를 입력 : ");
			String id = sc.nextLine();
			System.out.println("삽입할 이름을 입력 :");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name) values(?, ?)"; // prepared에서는 변수의 자리에 ?를 표시하면 이자리에 무언가 들어갈것이라는 
//			것을 표시 할 수 있다.
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id); // DB의 언어에서는 제일 처음의 숫자가 1 이다. 첫번째 물음표라는 의미
			pstmt.setString(2, name);
			
			//4단계 실행
			
			int cnt = pstmt.executeUpdate(); // sql 쿼리 안들어감 실행만 하는의미 이미 위에서 넣어줬기때문 // 쿼리의 내용을 수정하는 명령어 (실행)
			System.out.println("총" + cnt + "개 행 삽입...");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		} finally {
			
			JDBCClose.close(pstmt, conn);
		}
		
		
	}
}
