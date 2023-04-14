package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

//			ConnectionFactory factory = new ConnectionFactory();
//			conn = factory.getConnection();

			conn = new ConnectionFactory().getConnection(); // 이렇게 위에것을 표현할수도있다. 1,2 단계에 해당하는것

			// 3단계
			String sql = "select * from t_test";

			pstmt = conn.prepareStatement(sql);
			// 4단계

			ResultSet rs = pstmt.executeQuery(); // select를 쓸때만 사용한다. ResultSet == 행단위의 결과를 뽑아낼때 사용

			while (rs.next()) {
//			rs.next(); 같은위치에 열만 바뀌어 true false를 반환
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println(id + "(" + name + ")");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
	}
}
