/*
 * 작성일 : 2024년 3월 22일



 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 내포된 if실습. 
 *       점수를 입력받아 학점을 출력하시오.
 *       점수는 0~100점 사이 입니다.
 *       점수 범위를 벗어나면 "잘못된 점수입니다."를 출력하시오.
 *       
 *문제분석 :입력받은 점수가 0~100사이인가?
 *		  점수가 0~100 사이가 아니면?
 *         90점 이상이면 A학점
 		   80점 이상이면 B학점
 		   70점 이상이면 C학점
 		   60점 이상이면 D학점
 		   60점 미만이면 F학점
 	       점수는 정수로 입력 받는다.
 *         
 *알고리즘 : 1.(점수)정수를 입력받는다.
 *        2.if 점수의 범위가 0~100 사이인가?
 *         1)A
 *         2)B
 *         3)c
 *         4)D
 *         5)F
 *         
 *         3. else 아닌가?
 *          1)"잘못된 점수입니다."를 출력
 *         
 */

import java.util.Scanner;

public class NestedIfTest1 {

	public static void main(String[] args) {
		// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력받는다.
		System.out.print("점수 입력 : ");
		int score = stdIn.nextInt();
		
		if(score >= 0 && score <= 100) {
			//학점
		}
		else {
			// 잘못된 점수
		}
	//////////잘못된점수가 중점이면 
		if(score < 0 || score > 100) {
			// 잘못된 점수
		}
		else {
			//학점
		}
			
		if(score >= 90 && score <= 100) { // 90점이상이고, 100점이하
		System.out.println("A");
		}
		

		else if(score >= 80 && score <90) {
		System.out.println("B");
		}
		
		
		else if(score >= 70 && score <80) {
		System.out.println("c");
		}
		

		else if(score >= 60 && score <70) {
		System.out.println("D");
		}
		
		else if(score >= 0 && score <60) {
			System.out.println("F");
			}
			
		else {
			System.out.println("잘못된 점수 입력입니다.");
			
		}
		
	}
}
