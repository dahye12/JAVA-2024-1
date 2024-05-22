/* 
 * 작성일 : 2024년 5월 21일 
 * 작성자 : 202213015 컴퓨터공학과 박다혜 
 * 설명 : 클래스 변수와 클래스 메소드의 상속 
 * 
 */
class DB1 {
	public double d1;
	
	public DB1() {  // 묵시적생성자 
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
		d1 = 10*10;
	}
}

class DB2 extends DB1 {
	public double d2;
	
	public DB2() { // 묵시적 생성자 
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
		d2 = 10*10*10;
	}
	
	public DB2(double d ) {	// 명시적 생성자 
		System.out.println("클래스 DB2의 명시적 생성자 수행");
		d2 = d*d*d;
	}
}

// 하위 클래스에는 묵시적, 명시적 생성자가 다 있다.
// 명시적 생성자를 호출하면 상위 클래스의 묵시적 생성자가 우선 수행. 무.조.건.
class DB3 extends DB2 {  
	public double d3;    
	
	public DB3() {
		System.out.println("클래스 DB3의 묵시적 생성자 수행");
		d3 = 10 * 10 * 10 * 10;
	}
	// 생성자 오버로딩(중첩)
	public DB3(double d ) {
		System.out.println("클래스 DB3의 명시적(매개변수1개) 생성자 수행");
		d3 = d * d * d * d;
	}
}

public class DefaultInheritanceTest2 {
	  public static void main(String args[]) {
		  DB3 db3 = new DB3(5); // 매개변수에 값 전달   // 값 예측 해보시오 
		
	  }
}
