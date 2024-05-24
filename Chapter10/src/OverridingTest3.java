class OT3a {
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 show() 수행 : " + str);
	}
}
class OT3b extends OT3a {
	// 메소드 이름 같고, 매개변수 타입 같고, 매개변수 개수 같다.
	// 오버라이딩 -> 상위 클래스의 메소드를 재정의 한 것.
	@Override
	public void show(String str) {
		System.out.println("하위 클래스의 메소드 show() 수행 : " + str);
	}	
	// 자바 컴파일러는 @Override 주석이 사용되어 메소드가 선언되면 
	// 상위 클래스의 메소드와 정확하게 일치하는지 검사하여 
	// 일치하지 않은 경우에는 컴파일 오류를 발생
}

public class OverridingTest3 {
	public static void main(String args[]) {
		OT3a otb = new OT3a();  // 상위 클래스의 메소드 사용 못함.
		otb.show("쉽다 자바프로그래밍!!!"); 
	}
}