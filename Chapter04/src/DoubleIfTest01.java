/*
 * 작성일 : 2024년 3월 19일


 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 단순 if실습. 
 *       하나의 정수를 입력 받아 음수인지 확인하는 프로그램.
 *       
 *문제분석 : 음수는 0보다 작은 수이다.  
 *         정수를 입력받아 0보다 작은지 비교,판단.
 *         양수는 0보다 큰 수이다.
 *         입력 받은 정수가 1보다 큰지 판단.
 *
 *알고리즘 : 1.정수를 입력받는다.
 *         2.입력받은 정수가 0보다 작은지 판단한다.
 *         	  2-1. "-0은 음수입니다." 출력한다.  
 *         3. 입력 받은 정수가 0보다 큰지판단.
 *            3-1 "0은 양수입니다."출력한다.
 */

import java.util.Scanner;

public class DoubleIfTest01 {

	public static void main(String[] args) {
		// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력받는다.
		System.out.print("정수입력 : ");
		int num = stdIn.nextInt();
		
		//2. 음수인지 판단.
		//만약에 변수에 저장된 값 (입력 받은 값)이 0보다 작으면..
		if(num <0) {
			System.out.println(num + "은(는) 음수입니다.");
		}   //if 종료지점. 
		
		//3. 양수인지 판단. 
		if(num > 0) {
			System.out.println(num + "은(는) 양수입니다.");
			
		}
		
		// 조건과 상관없이 무조건 출력되는 문장.
		System.out.println("프로그램 종료.");
		
		//음수인지 판단 후 음수가 맞더라도 양수인지 판단하러 간다. 이 번거로운 걸 해결해보자 
		//만약 정수가 0보다 작으면 아니면(크면)
		if(num <0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
			
		else { //아니면, 그렇지 않으면, 나머지는..
			System.out.println(num + "은(는) 양수입니다.");
				//else 종료 

		}
		
		//조건과 상관없이 무조건 출력되는 문장
	    System.out.println("프로그램 종료");
		
	}
}