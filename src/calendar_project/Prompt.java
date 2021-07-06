package calendar_project;

import java.util.Scanner;

public class Prompt {
	
	
	public void runPrompt() {
		Scanner scn = new Scanner(System.in);   //키보드 출력받기
		Calendar cal = new Calendar();
		
		int month = 1;         //사실 디폴트 값은 아무거나 해도 상관 없음
		int year = 2015;
		
		
		while(true) {                                
			System.out.println("년도을 입력하세요");
			System.out.print("YEAR> ");
			year = scn.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scn.nextInt();                       
			if (month == -1) {                              
				break;
			} if (month >12) {								
				continue;
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

		


