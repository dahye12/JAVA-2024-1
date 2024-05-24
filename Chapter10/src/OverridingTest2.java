class OT2a {
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 show() 수행 : " + str);
	}
}

class OT2b extends OT2a {
	// 메소드 이름 같고, 매개변수 타입 같고, 매개변수 개수 같다.
	// 오버라이딩 -> 상위 클래스의 메소드를 재정의 한 것. 
	public void show(String s) {   		
		System.out.println("하위 클래스의 메소드 show() 수행 : " + s);
	}
}

public class OverridingTest2 {
	public static void main(String args[]) {
		OT2b otb = new OT2b();  // 상위 클래스의 메소드 사용 못함.
		otb.show("쉽다 자바프로그래밍!!!"); 
		
		OT2a ota = new OT2a();  // 상위 클래스 메소드 사용.
		ota.show("어렵다 자바프로그래밍!!!"); 
	}
}