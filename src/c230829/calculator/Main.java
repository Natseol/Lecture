package c230829.calculator;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		System.out.println(calc.add(1,2,3,4));
//		System.out.println(calc.subtract(10,2,3,4));
		
		System.out.println(calc.calculate('+',1,2,3,4));
		System.out.println(calc.calculate('-',10,2,3,4));
		System.out.println(calc.calculate('*',10,2,3,4));
		System.out.println(calc.calculate('/',10,5));
	}
}
