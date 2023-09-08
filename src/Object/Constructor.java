package Object;

//생성자
//인스턴스가 생성될 때 호출
//인스턴스 변수의 초기화 작업에 주로 사용
//클래스내에 선언, 구조도 메서드와 유사함
//클래스명과 동일해야 함
//오버로딩 가능

//default Constructor

//모든 클래스에는 반드시 생성자가 정의되어 있어야한다.
//하지만 생성자를 정의하지 않고도 인스터스를 생성할 수 있다(컴파일러가 자동적으로 추가해줘서)
//생성자를 하나라도 만들었으면 기본생성자를 만들어주지 않는다.

class Data {
	int value;
}

class Data1 {
	int value1;
	
	Data1(int n) { // 매개변수가 있는 생성자
		value1=n;
	}
//	Data1() {
//	}
}

class Student {
	
	Student() {		
	}
	
	Student(String str) {		
	}
	
	
}

class Car {
	String color;
	String name;
	String type;
	int  price;
	
	Car(){}
	Car(String c, String n, String t, int p){
		color = c;
		name = n;
		type = t;
		price = p;	
	}
	
	Car(Car a) {
		
	}

}
public class Constructor {

	static void Print(Car a) {
		System.out.println(a.color);
		System.out.println(a.name);
		System.out.println(a.type);
		System.out.println(a.price);
	}
	
	public static void main(String[] args) {
				
//		Student student = new Student();
		
		Data data = new Data();
		data.value = 5;
		System.out.println(data.value);
		
		Data1 data1 = new Data1(1);
		System.out.println(data1.value1);
		
//		Data1 data2 = new Data1();//Data1()이 없음
		
		Car hyundai = new Car();
		hyundai.color = "검정";
		hyundai.name = "그랜저";
		hyundai.price = 5000;
		hyundai.type="auto";
		
		Car kia = new Car("빨강", "모닝","auto",1000);
		
		Print(hyundai);
		Print(kia);
		
		
	}
}
