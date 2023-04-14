package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import kr.ac.kopo.util.JDBCClose;

public class InsertMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터 연결 후 연결객체 얻어오기 -- 연습용 실제로 이렇게 올리면 개인정보가 모두 노출되어버림.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);
			// 3. 쿼리를 생성하고
			Scanner sc = new Scanner(System.in);

			System.out.println("삽입할 id를 입력 : ");
			String id = sc.nextLine();
			System.out.println("삽입할 이름을 입력 :");
			String name = sc.nextLine();

			String sql = "insert into t_test(id,name)";
			sql += "values (\'" + id + "\',\'" + name + "\')";
			stmt = conn.createStatement(); // Statement 객체 만들기 // 쓰는데에 불편함이 많음 ' 같은것도 붙여줘야하고 그래서 preparedstatement를 사용
			// 4. 실행결과를 얻어오기
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. DB와 접속 종료 만든 순서의 반대로 지워줌
			JDBCClose.close(stmt, conn);

		}

	}
}
