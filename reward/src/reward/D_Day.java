package reward;

import java.util.*;

public class D_Day {
	public static int getDDay(int _year, int _month, int _day) {
		try {
			Calendar today=Calendar.getInstance();
			Calendar d_day=Calendar.getInstance();
			
			d_day.set(_year, _month, _day);
			
			long l_dday=d_day.getTimeInMillis()/(24*60*60*1000);
			long l_today=today.getTimeInMillis()/(24*60*60*1000);
			
			long substract=l_today-l_dday;
			return (int)substract;
			
		}catch(Exception e) {
			System.out.println("프로젝트 마감일을 불러올 수 없습니다.");
			return -1;
		}
	}
	public static void main(String[] args) {
		System.out.println("D-day = "+getDDay(2019, Calendar.JULY, 30));
	}

}
