package calendar_project;

public class Calendar {

	private static final int[] MAX_DAYS =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
	private static final int[] LEAP_MAX_DAYS =  {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
	
	public boolean isLeapYear(int year) {
		if (year %4 ==0 && (year %100 !=0  |  year%400 ==0))
			return true;
		else
			return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month -1];
		} else {
		return MAX_DAYS[month -1];
		}
	}
	
	public void printCalendar(int year, int month, int weakday) {     
		
		System.out.printf("    <<%4d년 %d월>>\n", year, month);
		System.out.println(" 일 월  화  수  목  금  토");
		System.out.println("----------------------");
		
		//print blank space
		for(int i =0; i <weakday; i++) {
			System.out.print("   ");
		}
		
		//print first line
		int count = 7 - weakday;
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
}


