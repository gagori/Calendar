package calendar_project;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if(week.equals("일")) return 0;
		 else if(week.equals("월")) return 1;
		 else if(week.equals("화")) return 2;
		 else if(week.equals("수")) return 3;
		 else if(week.equals("목")) return 4;
		 else if(week.equals("금")) return 5;
		 else if(week.equals("토")) return 6;
		 else
			 return 0;                   //혹시나 이상한거 있으면 일요일로 칩시다~		
	}
	
	public void runPrompt() {
		Scanner scn = new Scanner(System.in);   //키보드 출력받기
		Calendar cal = new Calendar();
		
		int month = 1;         //사실 디폴트 값은 아무거나 해도 상관 없음
		int year = 2015;
		
		
		while(true) {                                
			System.out.println("년도을 입력하세요. (exit: -1)");
			System.out.print("YEAR> ");
			year = scn.nextInt();
			
			if (year == -1)                              //년도 중심으로 break 무한루프 빠져나가기 ; break는 원하는 지점에 위치 가능
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scn.nextInt();     
			
	
			if (month >12 || month <1) {
				System.out.println("잘못된 입력입니다.");
				continue;                                    //continue 는 무조건 루프의 마지막에 와야함
			}
			
			cal.printCalendar(year, month);

		}
		System.out.println("Bye~");
		scn.close();
	}

	public static void main(String[] args) {   //셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
	}	
}

		


