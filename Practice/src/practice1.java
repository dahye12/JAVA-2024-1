
//1부터 시작해서 숫자를 계속 누적해서 더하다ㅏ가 합계가 10보다 처음으로 큰 값은 얼마인가?

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		System.out.println("얼마만큼 더할 건가요");
	Scanner stdIn = new Scanner(System.in);
	int count = stdIn.nextInt();
	System.out.println("얼만큼 증가시킬 건가요");	
	int i = stdIn.nextInt();
	int sum = 0;

	
	while (i <= count ) {
		sum = sum + i;
	
		i++;
		
	}	
	System.out.println("1부터" + count + "까지의 합은 : " + sum);
	}
	
	}
