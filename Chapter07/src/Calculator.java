/*
 * 작성일 : 2024년 4월 30일 
 * 작성자 : 202213015 컴퓨터공학과 박다혜 
 * 설명 : 메인메소드가 있는 클래스 . 
 * 클래스로부터 객체 생성하여 계산 결과 출력한다. plusminus 파일이랑 연결
 * 
 */
public class Calculator {

	public static void main(String[] args) {
		// plusMinus 클래스로부터 객체 생성. 
		PlusMinus pm = new PlusMinus(); // *-+/ //pm은 클래스로 가기위한 통로 
		// MultiDiv 클래스로부터 객체 생성. 
		MultiDiv md = new MultiDiv(); // */-+
		
		
		
		
		// 변수 선언
		String sum, cha, multi, div;
		
		// pm객체를 통해 PlusMinus 클래스에 있는 메소드 호출 
		sum = pm.plus(10,20); 
		System.out.println(sum);
		
		
		// 객체를 통해서 miunus 메소드 호출하여 결과 
		cha = pm.minus(10,20); 
		System.out.println(cha);
		// md 객체를 통해서 MultiDiv 클래스에 있는 메소드 호출
		multi = md.multi(10,20);
		System.out.println(multi);
		
		// md 객체를 통해서 더하기 결과 출력
		// 상속 받아 사용하기에 plus 메소드 접근 가능.
		// 메시지가 요구하는 메소드가 자신의 클래스에 없으면 상위 클래스에서 메소드를 찾는다.
		sum = md.plus (10,20);
		System.out.println(sum);
		
		// md 객체를 통해서 div 메소드 호출 
		// div 메소드가 private로 선언되어 접근 금지.
		div = md.div(5,2); // 오류발생 
		System.out.println(div);
	}

}
