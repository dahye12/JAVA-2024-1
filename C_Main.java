//5.14
public class C_Main {
	int count = 10; //객체변수
	static int num = 20; // 클래스변수
	
	
	//메소드 선언
	public int sum(int x, int y) {
		return x + y;
	}
	
	//클래스 메소드 선언 
	static int mul( int x, int y) {
		return x * y;
	}
	
	//메인 메소드 - 클래스 메소드 
	public static void main(String[] args) {
		int same; // 메인메소드에서 선언한 지역변수 
		
		// 반드시 클래스 변수, 지역변수만 사용가능하다.
		//same = count; // same = count; 하면 오류 나는 이유 : count는 객체 변수여서 오류 발생 

		same = num;
		System.out.println("num = " + same);
		
		// 클래스 메소드가 아니어서 오류 발생한다. 
		// 그래서 호출 불가능. 
		same = mul(5, 5);
		
		same = mul(5,5); 
		System.out.println("mul = " + same);
	}

}
