package calendar_project;

public class Calendar {

	private static final int[] MAX_DAYS =  {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
	private static final int[] LEAP_MAX_DAYS =  {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
	
	public boolean isLeapYear(int year) {
		if (year %4 ==0 && (year %100 !=0  |  year%400 ==0))
			return true;
		else
			return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
		return MAX_DAYS[month];
		}
	}
	
	public void printCalendar(int year, int month) {     
		
		System.out.printf("    <<%4d년 %d월>>\n", year, month);
		System.out.println(" 일 월  화  수  목  금  토");
		System.out.println("----------------------");
		
		//get weekday automatically
		int weekday = getWeekDay(year, month, 1);
		
		//print blank space
		for(int i =0; i <weekday; i++) {
			System.out.print("   ");
		}
		
		//print first line
		int count = 7 - weekday;
		for(int i =1; i<=count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		//print from second line to last
//		int delim = (count < 7) ? count : 0;   
		//if (count < 7) {delim = count};
		//else {delim = 0}; 과 같은 의미
		
		int maxDay = getMaxDaysOfMonth(year, month);
		for(int i = count +1 ; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == count && count != 7) {
				System.out.println();
			} else if(i %7 == 0 && count == 7) {
				System.out.println();
			}
		}
		System.out.println();                       
		System.out.println();                       
	}

	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4;    //1970년 1월 1일이 목요일이므로 목=3
		
		int count = 0;
		
		for(int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
			
//		System.out.println(count);
		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		
		count += day -1;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7 ;
//		System.out.println(count);
		return weekday;
	}

//	//simple test code here
//	public static void main(String[] args) {
//		Calendar c = new Calendar();
//		System.out.println(c.getWeekDay(1970, 1, 1) == 3);
//		System.out.println(c.getWeekDay(1971, 1, 1) == 4);
//		System.out.println(c.getWeekDay(1972, 1, 1) == 5);
//		System.out.println(c.getWeekDay(1973, 1, 1) == 0);  //1972년 윤년이 끼기 때문에
//		System.out.println(c.getWeekDay(1974, 1, 1) == 1);  
//		
//		
		
		
}
	



