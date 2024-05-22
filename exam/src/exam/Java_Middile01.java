/*
 * 작성일 : 2024년 4월 23일



 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 :도형의 넓이를 출력하는 프로그램
 * 
 * 
 *       
 *문제분석 : 1. 원 관련 입력받기 (자름)
 *		2. 삼각형관련 입력받기(밑변, 높이)
 *		3. 사각형 관련 입력받기(변)
 		4. 본인의 학과,학번, 이름 입력받기 
 		0. 종료
 
 *
 *알고리즘 :1.원하는 도형 입력받기 2. case에 따라 switch문으로 숫자에 따라 출력 3. num 초기화하기 
 *
 */

package exam;

import java.util.Scanner;

public class Java_Middile01 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner (System.in);
		//입력받기
		System.out.println("원하는 도형을 입력하세요 1.원의 넓이, 2: 삼각형의 넓이, 3: 정사각형의 넓이. 4:본인의 학과 학번 이름,0: 종료 됩니다");
		int i = stdIn.nextInt();
		
		// 초기화
		int num;

		switch(i) {
		case 1: 
			System.out.println("지름을 입력하세요 ");
			int num1 = stdIn.nextInt();
			System.out.println((num1/2) * (num1/2) * num1);
			break;
		case 2: 
			System.out.println("밑변을 입력하세요: ");
			
			int under = stdIn.nextInt();
			System.out.println("높이를 입력하세요: ");
			int height = stdIn.nextInt();
			System.out.println(under * height);
			break;
		case 3: 
			System.out.println("변의 길이를 입력하세요 ");
			int num3 = stdIn.nextInt();
			System.out.println(num3 * num3);
			break;
		case 4:
			System.out.println("학과를 입력하세요");
			String ga = stdIn.next();
			System.out.println("학번을 입력하세요 ");
			int r = stdIn.nextInt();
			System.out.println("이름을 입력하세요 ");
			String name = stdIn.next();
			System.out.println( ga + r+ name);
			break;
		case 0:
			System.out.println( "종료");
		//다른 걸 입력하면 다시 입력받기
		default:
			System.out.println( "다시 실행하시오");
		}
		


	}

}
