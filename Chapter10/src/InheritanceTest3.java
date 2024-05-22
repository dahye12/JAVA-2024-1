/* 
 * 작성일 : 2024년 5월 21일 
 * 작성자 : 202213015 컴퓨터공학과 박다혜 
 * 설명 : 클래스 변수와 클래스 메소드의 상속 
 * 
 */
class C1 {
	private static int x=100; 	 // 클래스 변수
	public static int y = x;  	// 클래스 변수
	static int z=x;  			// 클래스 변수
	
 	public static int cc() {   	// 클래스 메소드
 		return x;
 	}
}

class C2 extends C1 {
	public static String x;  // 클래스 변수
	static int y; 			 // 클래스 변수
}
	//이 클래스에는 x,y,z cc()가 있다. 
	// x,y는 c2클래스에 있는 클래스변수이다. 

 
class InheritanceTest3 {
	public static void main(String args[]) {
		System.out.println("클래스 메소드 C1.cc() 값 : " + C1.cc());
		//객체 생성 할까요? 아니요 왜냐하면 선언해놓은게 모두 static인데 클래스 변수 클래스 메소드니까
		// 클래스 변수와 클래스 메서드는 클래스이름으로 선언한다. 
		System.out.println("클래스 변수 C1.y 값 : " + C1.y);
	    System.out.println("클래스 변수 C1.z 값 : " + C1.z);
	    System.out.println("클래스 변수 C2.x 값 : " + C2.x);
	    System.out.println("클래1스 변수 C2.y 값 : " + C2.y);
	    System.out.println("클래스 변수 C2.z 값 : " + C2.z);
	    System.out.println("클래스 메소드 C2.cc() 값 : " + C2.cc()); 
	    // 필기 문제 나오면 접근가능한지 알고있어야겠지? 
	    C2.x = "오늘은 화요일입니다.";
	    C1.y = 200; 
	    C2.z = 300; //c1.z = 300도 가능  
	    System.out.println("클래스 변수 C2.x 값 : " + C2.x);
	    System.out.println("클래스 변수 C2.y 값 : " + C2.y);
	    System.out.println("클래스 변수 C2.x 값 : " + C2.z);
  }
}