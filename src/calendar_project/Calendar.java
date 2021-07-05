package calendar_project;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("   Hello, Calendar\n");
		System.out.println("일 월  화  수  목  금  토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 입력
		Scanner scn = new Scanner(System.in);
		System.out.println("\n달을 입력하세요");
		int month = scn.nextInt();                                          //scn.next()는 string을 받는 반면, scn.nextInt()는 Int를 받는다.
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   //배열 표기법 int[], 문자열 표기법 String[]
		
		System.out.printf("%d 월은 %d일 까지 있습니다.\n", month, maxDays[month -1]);
		scn.close();
		
		}
		
		
	}


