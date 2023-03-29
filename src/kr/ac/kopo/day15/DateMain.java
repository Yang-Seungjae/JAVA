package kr.ac.kopo.day15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DATE);
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);	// 1(일) ~ 7(토)
		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 "
					+ date + "일(" + dayArr[day] + ")입니다");
		
		// 날짜를 변경  2020년 5월 5일
		c.set(2020, 5-1, 15);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/15 무슨요일 : " + day);
		
		Date d = c.getTime();
		System.out.println(d);
		
		System.out.println("1 ~ 12월 중 가장 큰달 : " + (c.getActualMaximum(Calendar.MONTH)+1));
		System.out.println("1 ~ 12월 중 가장 작은달 : " +( c.getActualMinimum(Calendar.MONTH)+1));
		System.out.println("5월의 마지막날 : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// 현재시간을 년-월-일 시:분:초 표현
//		String pattern = "yyyy-MM-dd HH:mm:ss";
		String pattern = "오늘은 yyyy년 MM월 dd일 HH시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf.format(c.getTime()));
		
		/*
		Date d = new Date();
		System.out.println("d : " + d);
		
//		오늘은 2023년 3월 27일(월)입니다
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay(); // 0(일) ~ 6(토)
		String[] dayArr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 "
				+ date + "일(" + dayArr[day] + ")입니다");
		*/
		
	}
}







