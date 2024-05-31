/*
 * 문제 : student_class 클래스를 작성하세요
 * 이 클래스는 다음과 같은 속성을 가집니다. 
 * private String name
 * private int studentId    //속성. 멤버변수
 * private double grade
 * 
 * 다음 요구 사항을 만족하는 생성자를 작성하세요
 * 기본 생성자 : name을 "홍길동", studentId를 0, grade를 0.0으로 초기화합니다. 
 * 매개변수가 있는 생성자 : 이름, 학생, ID, 학점을 입력받아 초기화합니다. 
 * 메소드 : printstudentInfo() : 학생의정보를 출력합니다. 
 * 
 * ----------------------------------
 * student 클래스 
 * main 메소드 : student_class로부터 객체를 두 개 생성하고, 각각의 정보를 출력합니다. 
 * 
 * [출력결과]
 * Name : 홍길동, student ID : 0,학점 : 0.0
 * Name : 박다혜, Student ID : 202213015, 학점:4.5
 */
class student_class {


 private String name;
  private int studentId;    //속성. 멤버변수
 private double grade; 
 
 	// 생성자 - 매개 변수가 없는 묵시적 생성자  - 학새 정보 기본 세팅하는 기능
 	public student_class() {
	 this.name = "홍길동";
	 this.studentId = 0;
	 this.grade = 0.0;
 }
 	//생성자 오버로딩 = 매개변수의 개수와 타입이 달라야한다. 
 	// 학생 정보를 전달 받아 세팅하는 기능
 	public student_class(String name, int studentId, double grade) {
	 this.name = name;
	 this.grade = grade;
 	}
 	
 	//학생정보 출력 메소드 
 	public void printStudentInfo() {
 		System.out.println("Name : " +name + ", student ID : " +  studentId + "학점 :" +  grade);
 		
 	}
 	
 	public class Student {
 		
 		public static void main(String[] args) {
 			// 객체 생성
 			// 매개변수가 없는 생성자 호출 
 			student_class s1 = new student_class();
 			s1.printStudentInfo(); //메소드 호출 
 			
 			// 내 정보를 가지고 생성자 호출 
 			student_class s2 = new student_class("박다혜", 202213015, 4.5);
 			s2.printStudentInfo();
 	}

	}

}
