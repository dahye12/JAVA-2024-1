// i부터 하나씩 증가하는 수를 endNum까지 더해라 for /while 

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		System.out.println("endNum을 입력하세요");
		Scanner stdIn = new Scanner (System.in);
		
		int i = 1;
		int endNum = stdIn.nextInt();
		int sum = 0;
		
		while (i <= endNum) {
			sum = i + endNum ;
			i++;
			System.out.println("1부터" + endNum +"까지의 합은"  + sum  );
		}
		
	}

}
