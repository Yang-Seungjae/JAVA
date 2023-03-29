package kr.ac.kopo.day16.calendar;

import java.util.Calendar;

public class CalendarUtil {
	
	private Calendar c;
	
	public CalendarUtil() {
		c = Calendar.getInstance();
	}

	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
	
	public void showByMonth(int year, int month) {
		
		System.out.printf("*** %4d년 %02d월 ***\n", year, month);
		
		// year/month/1 날짜정보 수정
		c.set(year, month-1, 1);
		
		// 요일 추출 
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		// 해당월의 마지막 날
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println("week : " + week + ", lastday : " + lastday);
		
		showByDay(week, lastday);
	}
	
	private void showByDay(int week, int lastday) {
		
		System.out.println("==================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("==================================================");
		int cnt = 0;
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
			cnt++;
		}
		for(int day = 1; day <= lastday; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0) {
				System.out.println();
			}
		}
		if(cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println("==================================================");
	}
}







