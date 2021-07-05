package calendar_project;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month -1];
		}
		
	
	
	public void printSampleCalendar() {                       //버리긴 아까워서 저장해두고 출력은 안할 수 있게 함
		System.out.println("   Hello, Calendar\n");
		System.out.println("일 월  화  수  목  금  토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		String PROMPT = "cal> ";                    //">"프롬프트 커서가 옮겨가는 것을 의미~
		Scanner scn = new Scanner(System.in);
		Calendar calendar = new Calendar();
		
		
		
		
		
//		System.out.println("반복 횟수를 입력하세요.");       반복횟수 정해지지 않는다면???
		
		int month = 1;
		while(true) {                                 //반복 횟수를 모를 때 while문 사용, true면 무한루프
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scn.nextInt();                       
			if (month == -1) {                              //-1만나면 루프를 빠져나가라.
				break;
			}
			
			if (month >12) {								//12넘어가는 숫자가 나오면 continue, 루프의 처음으로 돌아가라.
				continue;
			}
			System.out.printf("%d 월은 %d일 까지 있습니다.\n", month, calendar.getMaxDaysOfMonth(month));   //미리 만들어 두었던 함수 쓰기
		}
		
		System.out.println("Bye~");
		scn.close();
		
		}
		
		
	}


