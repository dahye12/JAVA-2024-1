/*
 * 작성일 : 2024년 3월 22일




 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 조건식 연습
 * 월을 입력받아 해당 계절을 출력하시오.
 * 	3,4,5월 => 봄
 * 	6,7,8 => 여름
 * 	9,10,11=> 가을
 * 	12,1,2=> 겨울
 * 
 *문제분석 :입력받아야할 값은 
 *		1,2,3,4,5,6,7,8,9,10,11,12 이다.
 *		0이나 13을 입력하면? => 해당 월은 없습니다 출력하자.
 *         
 *   		다중 if?
 *         내포된 if?
 *알고리즘 : 1.(점수)정수를 입력받는다.
 *        
 */

import java.util.Scanner;

public class ComConditionTest1 {
	
	public static void main(String[] args) {

	// // Scanner 객체 생성.
	Scanner stdIn = new Scanner(System.in);
	
	//1. 정수를 입력받는다.
	System.out.print("월 입력: ");
	int month = stdIn.nextInt();
	
	if (month == 12 || month == 1 || month == 2) {

		System.out.println("겨울입니다.");

		}

		else if (month == 3 || month == 4 || month == 5) {

		System.out.println("봄입니다.");

		}

		else if (month == 6 || month == 7 || month == 8) {

		System.out.println("여름입니다.");

		}

		else if (month == 9 || month == 10 || month == 11) {

		System.out.println("가을입니다.");

		}

		else {

		System.out.println("해당 월은 없습니다.");

		}

	}
}

	
