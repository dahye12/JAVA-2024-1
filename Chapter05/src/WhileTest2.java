/*
 * 작성일 : 2024년 4월 2일



 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 알고싶은 단을 입력받아 구구단을 출력하시오. // 곱하는 수가 1씩증가
 *       
 *문제분석 : 단은 고정이다. 입력받느다.
 *곱하는 수는 1부터 9까지 1씩 증가한다. 
 *곱셈의 결과는 단 * 수 이다. 
 *구구단 곱셈의 과정이 하나씩 출력되야한다.
 *알고리즘 : 1. 단을 입력 받는다(졍수)
 *	2. 곱하는 수는 1부터 (초기값)
 *	3. 곱하는 수는 9까지 반복하면서(조건식)
 *		3-1 구구단을 출력한다.
 *		3-2. 곱하는 수를 1씩 증가시킨다.(증감식)
 * 
 */
import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// // Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//1. 단을 입력 받는다.
		System.out.print("알고싶은 단 : ");
		int dan = stdIn.nextInt();
		
		//2. 곱하는 수는 1부터 
		int su = 1;
		
		//3. 곱하는 수를 9까지 반복하면서 
		while (su <= 9) { //>=9면 안나옴
			//1) 구구단을 출력한다
			System.out.println(dan + "x " + su + "=" + dan*su);
			su++; //2) 곱하는 수를 1씩 증가
		}

	}
}
