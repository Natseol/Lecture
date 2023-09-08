package Object;

//생성자에서 다른 생성자 호출
//같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼
//생성자 간에도 서로 호출이 가능하다.
//1. 생성자의 이름으로 클래스 이름 대신 this를 호출
//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫출에서만 호출이 가능

class Car01{

	String color;
	String name;
	int price;
	
	Car01()	
	{
		this("화이트", "a", 5);
	}
	
	Car01(String color)
	{
		//다른 생성자를 호출할 때 첫번째 줄에서만 가능한 이유
		//초기화를 먼저 해야해줘서
//		color = "red";
		this(color, "a", 5); // this(참조변수) = 자기자신의 인스턴스, 인스턴스 멤버를 가리킬 때 사용 
	}
	
	Car01(String color, String name, int price)
	{
		this.color=color;
		this.name=name;
		this.price=price;				
	}
	
	//생성자를 이용한 인스턴스 복사
	//참고 : object클래스 - clone 
//	Car01(Car01 c)
//	{
//		color=c.color;
//		name=c.name;
//		price=c.price;
//	}
	
	Car01(Car c)
	{
		this(c.color,c.name,c.price);		
	}
}
public class Constructor01 {
	
	static void CarPrint(Car01 car01) {
		System.out.println(car01.color+car01.name+car01.price);
	}

	public static void main(String[] args) {
		
//		Car01 c1 = new Car01();
//		Car01 c2 = new Car01("파랑");
//		
//		System.out.println(c1.color+c1.name+c1.price);
//		System.out.println(c2.color+c2.name+c2.price);
		
		Car01 c1 = new Car01();
		Car01 c2 = new Car01(); //car01의 복사본 car02생성
		CarPrint(c1);
		CarPrint(c2);
		
		c1.price = 599;
		
		CarPrint(c1);
		CarPrint(c2);
		
		//
		
		//1.Rectangle Class 만들기
		//사각형은 가로와 세로 길이를 가지고 있음
		//면적과 둘레를 계산하는 메서드가 포함
		//결과 출력
		
		//2.Calculator 클래스 만들기
		//사칙연산 메서드 포함. 이거를 활용한 프로그램 만들기
		//사칙연산 메서드는 오버로딩 구현
		
		//3.Student 클래스 만들기
		//이름, 학번, 나이 등등
		//생성자를 이용하여 객체를 초기화 활 때 필요한 정보를 전달할 수 있도록 한다.
		
		
		
	}//end of main
}
