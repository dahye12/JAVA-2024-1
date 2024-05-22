/*
 * 작성일 : 2024년 4월 5일




 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 사용자가 0을 입력하면 프로그램이 종료되도록 되어 있습니다. 사용자가 월을 입력할 때마다 해당하는 계절이 출력됩니다.
 * Scanner 클래스를 사용하여 사용자의 입력을 받기 위해 Scanner 객체를 생성합니다.
 * month라는 정수 변수를 선언합니다.
 * do-while 반복문을 사용하여 아래의 작업을 반복합니다:
 * 사용자로부터 월을 입력받습니다.
 * switch 문을 사용하여 입력된 월에 따라 해당하는 계절을 출력합니다.
 * 입력된 월이 0이면 프로그램을 종료합니다.
 * do-while 반복문은 사용자가 0을 입력할 때까지 계속 실행됩니다.
 * 
  */

import java.util.Scanner;

public class doWhileTest2 {

	public static void main(String[] args) {
//	 	// // Scanner 객체 생성.
			Scanner stdIn = new Scanner(System.in);

			int month;
			
			
		 do {
		
			//1. 정수를 입력받는다.
			System.out.print("월을 입력하세요(종료:0) : ");
			month = stdIn.nextInt();
			switch(month)
			{
				// if(month == 3 || month == 4 || month == 5)
				case 3 :  case 4 : case 5 :
					System.out.println("봄 입니다.");
					break;
				case 6 : case 7 : case 8 :
					System.out.println("여름 입니다.");
					break;
				case 9 : case 10 : case 11 :
					System.out.println("가을 입니다.");
					break;
				case 12 : case 1 : case 2 :
					System.out.println("겨울 입니다.");
					break;
				case 0 :
					System.out.println("프로그램 종료");
					break;
				default :
					System.out.println("해당 월은 없습니다.");
					break;
			}

		 } while(month != 0);
	{
		 

		 }

}
}


