package calendar_project;

import java.util.Scanner;

public class CaendarWorkspace {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		int a,b;
		Scanner scanner = new Scanner(System.in);   //System.in 으로 키보드 입력을 받을 수 있다.  오픈!
		String s1, s2;                              
		System.out.println("두 수를 입력해 주세요.");
		s1 = scanner.next();                             // string 만 올 수 있음, 에러확엔해보기, 따라서 s1을 따로 설정한것
		s2 = scanner.next();
//		System.out.println(s1 +","+ s2);                //string 이므로 abc, 만원 등 문자도 입력가능
		
		a = Integer.parseInt(s1);                      //이제 int로 형변환
		b = Integer.parseInt(s2);
//		System.out.println(a +","+ b);                   //이제 정수만 입력가능.
		
		
		//출력: 화면에 두 수의 합을 출력한다.
//		int c = a + b;
//		System.out.println("두 수의 합은 "+(a+b)+ " 입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", a,b, a+b);    //%d에 정수를 넣을 수 있음
		scanner.close();                                                        //클로즈!!
		
	}

}
