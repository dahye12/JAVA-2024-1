/* 문제분석 : i가 1씩 커지고, 입력받은 수보다 크면 입력문이 끝나게한다.
 * 알고리즘 : 1. count 변수 선언
 * 			2. i변수 선언
 * 			3. while 문으로  i < count 하기 
 * 			4. i++으로 1씩 커지게하고,
 * 			5. count 변수 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		
		
	      Scanner stdIn = new Scanner (System.in);
	  int i = 1;
	  int endnum = stdIn.nextInt();
	  int sum = 0;
	  
	  while ( i <= endnum) {
		  sum +=i;
		  i++;
		  
		  
	  }
	  System.out.println(sum);
	      
	}
	}