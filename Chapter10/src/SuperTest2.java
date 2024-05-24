class ST2a {
	int x = 1000;
	void display() {
		System.out.println("상위 클래스 ST2a의 display() 메소드입니다");
	}
}

class ST2b extends ST2a {
	int x = 2000;
	@Override
	void display() {  // 메소드 오버라이드.
		System.out.println("하위 클래스ST2b의 display() 메소드입니다");
	}
	
	void write() {
		display();      // 같은 클래스 내의 display() 메소드 호출
		super.display();  // 상의 클래스의 display() 메소드 호출
		System.out.println("ST2b 클래스 객체의 x 값은 : " + x);  // 이 클래스의 맴버 변수 출력
		System.out.println("ST2a 클래스 객체의 x 값은 : " + super.x); // 상위 클래스의 맴버 변수 출력
	}
}

class SuperTest2 {
	public static void main(String args[]) {
		ST2b st2 = new ST2b();
		st2.write();
	}
}