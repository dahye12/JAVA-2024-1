class Box3 {
	int width,height,depth; // 멤버 변수 
	
	// 생성자 
	// 매개변수의 의미가 명확해졌다.
	// 객체변수와 매개변수의 이름이 같다 => 문제있다! 매개변수와 객채변수 이름이 다르면 젤 좋은 방법이겠지, 근데 지금처럼 의미가 있는 걸로 하려다보니까 
	public Box3 (int width, int height, int depth) {
		// this는 현재 객체 변수를 의미 / 다른 생성자를 호출할때도 쓴다 !->4번 파일로 만듬
		// 객체 변수 width에 매개변수 width 값을 저장 
		this.width = width;
		this.height = height;
		this.depth = depth;
	
	}
}
public class thisTest03 {

	public static void main(String[] args) {
		Box3 mybox = new Box3(1,2,3);
		System.out.println(mybox.width);
		// 묵시적 값인 0인 출력된다 

	}

}
