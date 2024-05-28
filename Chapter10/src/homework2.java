class Car {
    private String name;
    private String color;
    private int speed;

    // 이름만 초기화하는 생성자
    public Car(String name) {
        this.name = name;
    }

    // 이름과 색깔을 초기화하는 생성자
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 모든 멤버 변수를 초기화하는 생성자
    public Car(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    // 멤버 변수들을 출력하는 메소드
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}

public class homework2 {
    public static void main(String[] args) {
        Car car1 = new Car("제네시스", "검정", 240);
        Car car2 = new Car("BMW", "빨강", 200);

        System.out.println("Car 1:");
        car1.display();
        System.out.println();

        System.out.println("Car 2:");
        car2.display();
    }
}