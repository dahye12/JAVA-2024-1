/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터공학과 202213015 박다혜
 * 설명 : 변수와 자료형 
 */

public class VarDatatype {

	public static void main(String[] args) {
		// 상수(값이변하지 않는 것, 관례 : 대문자로 만드시오) 선언 // 상수니까 final 붙혀서 선언하기 
		final int MAX = 100;
		final double PI = 3.14;
		
		//PI = 3.14159; // 오류 뜨는 이유 : 상수는 한번 값이 결정되면 변할수없는데 3.14에서 3.14159로 바꼈으니까
		
		int r = 5; //정수 
		double pi = 3.14159; // 이건 변수(소문자)니까 바껴도 오류 안 뜸 
		String name = "박다혜"; //문자열
		char blood = 'o';
			// 문자 (문자열은 String / 문자는 Char임, char는 1byte만 가능하니까 혈액형이 ab형이면 string으로 저장할 것)
				
				
		//원주율 출력 
		System.out.println("원주율은"+ PI + "입니다.");
		System.out.println("원주율은"+ pi + "입니다.");
		
		//원의 넓이 계산하여 출력 
		System.out.println("반지름이"+ r + "인 원의 넓이는" + r * r* pi + "입니다.");
		// r제곱은 r*r로 
		
		// 더 보기쉽게 
		
		//원의 넓이를 계산한다.
		double area = r*r*pi; //어떤 자료형인지 정수인지 실수인지 반드시 선언할 것 
		

		System.out.println("반지름이"+ r + "인 원의 넓이는" + area + "입니다.");
		
		// printf로 원의 넓이를 출력한다.
		area = r*r*pi;
		System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.\n",r,area);
		
		//printf는 형식 지정자인데 %d는 정수가, %f는 실수가 들어가야함 차례대로 P.112
		
		


	}

}
