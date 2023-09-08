package Object;

import java.util.Scanner;

class Example {
	
//	int a;
//	static int b;
//	static void number() {
//		
//		a=1;//클래스 메서드에서는 인스턴스 변수 사용 불가
//		b=2;
//	}
	
	void Print() {//void이므로 리턴타입 없음
		System.out.println("Print함수 호출");		
	}
	
	int num() {		
		return 3;//정수형으로 리턴
	}
	
	int sum(int a, int b) {
		return a+b;
	}
	
	void PrintMonth(int num) {
		if(num<0||num>12) {
			System.out.println("잘못된 입력");
			return;//함수 종료
		}
		else {
			System.out.println(num+"월");			
		}		
	}
	
}

class Operation {
	
	int plus(int a, int b) {
		return a + b;
	}
	
	int minus(int a, int b) {
		int result;
		result = a-b;
		return result;				
	}
	
	int multiplication(int a, int b) {
		int c = a*b;
		return c;		
	}
	
	double division(double a, double b) {
		return a/b;
	}
}

class op {
	int a;
	int b;
	
	int add()
	{
		return a+b;
	}
	int subStract() {
		return a-b;
	}
	
	//인스턴스 변수와 관계없이 매개변수로 처리
	static int add(int a, int b) {
		return a+b;//a,b는 지역변수
	}
	
}

public class Class03 {

	//method
	//반환타입 메서드이름(요기는 매개변수-> 경우에 따라 o,x) => 선언부
//	{
		//호출되면 실행되는 코드 => 구현부
//	}
	
	//static method(클래스 메서드), instance method
//	1. 메서드 앞에 static이 있으면 클래스, 없으면 인스턴스
//	2. 클래스 메서드는 클래스이름.메서드이름으로 호출가능. 인스턴스 메서드는 객체를 생성해야만 호출가능
//	3. 인스턴스 메서드는 인스턴스 변수를 필요로 하는 메서드 (인스턴스 변수와 관련된 작업)
//	4. 클래스 메서드는 인스턴스와 관계가 없는 것을 정의한다
//	5. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.(인스턴스를 생성하지 않았을 경우에도 사용하기 위해서)
//	6. 인스턴스 변수를 사용하지 않는 경우에는 static을 붙여 클래스로 사용할 것을 고려한다 
	
	
//	int Add(int a, int b ) {
//		int result = a+b;
//		return result;
//		return a+b;
//	}	
//	
//	void Print(int a) {
//		System.out.println(a);
//	}
	
	public static void main(String[] args) {
		
//		Example example = new Example();
//		
//		example.Print();
//		example.PrintMonth(3);
//		example.PrintMonth(15);
//		int number = example.num();
//		System.out.println(number);
//		int result = example.sum(3, 7);
//		System.out.println(result);
		
		//실습
		// + , - , , * , / 메서드 구현 후 각 해당 메서드를 호출해라
		
		Operation operation = new Operation();
		int number1 = 13;
		int number2 = 4;
		
		System.out.println(operation.plus(number1, number2));
		
		int result = operation.minus(number1, number2);
		System.out.println(result);
		
		System.out.println(operation.multiplication(number1, number2));
		System.out.printf("%.1f\n",operation.division(number1, number2));
		
//		Scanner input = new Scanner(System.in);
//		int num1 = input.nextInt();
//		System.out.println("+ - * /");
//		String a = input.next();
//		int num2 = input.nextInt();
		
		
		
	
		
	}//end of main
	
}
