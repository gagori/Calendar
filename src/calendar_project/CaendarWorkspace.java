package calendar_project;

import java.util.Scanner;

public class CaendarWorkspace {
	public static void main(String[] args) {
		// 입력
		
		System.out.println("두 수를 입력하세요.");          // 아래문장 위에 올라와야 첫 화면에 뜬다!! 해보기
		Scanner scn = new Scanner(System.in);           //여기서 부터 키보드 입력해야 뜨는것 왜냐면 System.in 출력받는 역할 하므로
		int i1 = scn.nextInt();
		int i2 = scn.nextInt();
		//		String s1, s2;
//		s1 = scn.next();                              //출력 받을 때 string 만 가능(?)
//		s2 = scn.next(); 
//		i1 = Integer.parseInt(s1);                    //이제 int로 형변환 해줌.
//		i2 = Integer.parseInt(s2);    

		// 출력
//		System.out.println("%d와 %d의 합은 %d 입니다.", i1, i2, i1+i2);               //즉 얘는 입력해야 뜸. // prinln에서는 이게 동작 ㄴㄴ 
		System.out.printf("%d와 %d의 합은 %d입니다.", i1, i2, i1+i2);
		scn.close();
		
		
				

	}
}