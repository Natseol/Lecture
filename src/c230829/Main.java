package c230829;

interface InterfaceTest {

	/*public static final*/int NUMBER=12;

	void methodTest();

	static void staticMethodTest() {
		System.out.println("정적 메서드 가능");
		privateStaticMethodTest();
	}//클래스메모리자체에 있음, 객체 생성과 관련없이 쓸 수 있어서

	private static void privateStaticMethodTest() {
		System.out.println("private static 메서드 가능");
	}//static이 붙으면

	private void privateMethodTest() {
		System.out.println("private 메서드 가능");
	}

	default void defaultMethodTest() {
		privateMethodTest();
	}
}

class ClassTest implements InterfaceTest{
	@Override
	public void methodTest() {};
	@Override
	public void defaultMethodTest() {
		InterfaceTest.super.defaultMethodTest();
	}
}

public class Main {	
	public static void main(String[] args) {
		InterfaceTest.staticMethodTest();
		YellowRace JKH = new YellowRace() ;
		JKH.move();
		Person[] people = new Person[] {JKH, new WhiteRace()};
		JKH.getSkinColor();

	}
}
