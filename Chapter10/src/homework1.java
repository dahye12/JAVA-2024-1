

import java.util.Scanner;

class Calculator  {
	private int num1, num2;
	private String op;
	private int result;
	
	public int getResult() {
		return result;
	}

	public Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public void calc() {
		
		switch(op) {
		case "+": result = num1+num2;break;
		case "-": result = num1-num2;break;
		case "*": result = num1*num2;break;
		case "/": result = num1/num2;
		}
	}
}

public class homework1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // 키보드 입력을 위해 Scanner 객체 생성
		System.out.print("첫번째 정수를 입력하시오. : ");
		int num1 = stdIn.nextInt();
		System.out.print("두번째 정수를 입력하시오. : ");
		int num2 = stdIn.nextInt();
		System.out.print("연산자를 입력하시오. : ");
		String op = stdIn.next();

		Calculator calc = new Calculator(num1, num2, op);
		calc.calc();
		System.out.println("연산결과 : " + calc.getResult());
	}
}