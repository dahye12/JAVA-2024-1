/*
 * 작성일 : 2024년 3월 19

일


 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 다중 if실습. 
 *       하나의 정수를 입력 받아 짝수인지 홀수인지 확인하는 프로그램.
 *       
 *문제분석 : 수는 0보다 작은 수이다.  
 *         정수를 입력받아 0보다 작은지 비교,판단.
 *         양수는 0보다 큰 수이다.
 *         입력 받은 정수가 1보다 큰지 판단.
 *         0은0이다
 *         
 *알고리즘 : 1.정수를 입력받는다.
 *         2.만약에 입력받은 정수가 0보다 작은가?
 *         	  2-1. "-0은 음수입니다." 출력한다.
 *         3. 아니고, 만약에 입력 받은 정수가 0보다 큰가?
 *            3-1. "0은 양수입니다." 출력한다
 *         4. 아니면 (나머지는)
 *         		0입니다.
 */

import java.util.Scanner;

public class MultilfTest1 {

	public static void main(String[] args) {
		// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력받는다.
		System.out.print("정수입력 : ");
		int num = stdIn.nextInt();
		
		//2. 음수인지
		if(num <0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
		
		//3. 아니면 양수인지 
		else if(num >0) {
			System.out.println(num + "은(는) 양수입니다.");
		}
		//4. 아니면(0이다. num == 0)
		else {
			System.out.println("0입니다.");
		}
				}
	}

