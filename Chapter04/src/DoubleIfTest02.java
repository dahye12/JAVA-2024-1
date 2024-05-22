/*
 * 작성일 : 2024년 3월 19일


 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 이중 if실습. 
 *       하나의 정수를 입력 받아 짝수인지 홀수인지 확인하는 프로그램.
 *       
 *문제분석 : 짝수 => 2로 나눈 나머지가 0이다.
           홀수 => 2로 나눈 나머지가 1이다. (0이 아니다)
           (if)짝수 아니면 (else) 홀수이다.
           홀수 아니면 짝수이다.
 *
 *알고리즘 : 1.정수를 입력받는다.
 *         2.입력받은 정수가 짝수인지 판단한다.
 *         	  2-1. 00은 짝수이다. 출력
 *         3. 아니면
 *            3-1. 00은 홀수이다. 출력.
 */

import java.util.Scanner;

public class DoubleIfTest02 {

	public static void main(String[] args) {
		// Scanner 생성
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력받는다.
		System.out.print("정수입력 : ");
		int num = stdIn.nextInt();
			
		//2. 입력받은 정수가 짝수인지 판단한다.
		if(num%2 !=0) {
			System.out.println(num + "은(는)짝수입니다.");	
		}
		
		else { //아니면, 그렇지 않으면, 나머지는..
			System.out.println(num + "은(는) 홀수입니다.");
		}
	}
}