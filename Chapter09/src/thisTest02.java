class Box2 {
	int width,height,depth; // 멤버 변수 
	
	// 생성자 
	// 매개변수의 의미가 명확해졌다.
	// 객체변수와 매개변수의 이름이 같다 => 문제있다! 매개변수와 객채변수 이름이 다르면 젤 좋은 방법이겠지, 근데 지금처럼 의미가 있는 걸로 하려다보니까 ->this
	public Box2 (int width, int height, int depth) {
		// 자신의 변수에 자신의 값을 저장한다. 
		// 생성자 메소드 내의 변수로만 취급된다. 
		width = width;
		height = height;
		depth = depth;
		//1번 파일보면 파란색에서 갈색으로 변한 걸 알수있음 매개변수에 있는 값을 자기자신에 넣음 근데 왜 0이 출력될까 
	}
}
public class thisTest02 {

	public static void main(String[] args) {
		Box2 mybox = new Box2(1,2,3);
		System.out.println(mybox.width);
		// 묵시적 값인 0인 출력된다 -> 7번 라인이 아니라 2번 라인으로 멤버변수 찾으러 감 근데 없으니까 의미없는 묵시적인 0이 출력 

	}

}
