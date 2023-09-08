package c230829;

interface Human {
	// API: Applicaiton Programming Interface
	// 프로그램과 프로그램 사이에 데이터를 전달해주는 것
	// Web API / API 문서
	// Interface는 무언가와 무언가를 연결하여 중간 과정에서 통신을 처리한다.
	// 간단히 말하면 서로 간에 대화를 가능하게 해준다. 통역사

	// 자바는 컴파일러언어 + 인터프리터언어
	// bin폴더: 2진수, JVM에서 컴파일 하기위한 파일들이 있음, .class
	
	//abstract
	//interface implements
	//다중상속이 가능 : 추상메서드 밖에 없으니까, 다중상속이어도 같은이름이 존재 가능
	//sealed permits : non-sealed
	//final

	/**
	 * 이동하는 메서드
	 **/
	void move();	
}

interface Animal {
	// interface == abstract class
	void eat();
}

public sealed class Person
implements Human, Animal
permits YellowRace, WhiteRace
{
	String species;
	int number;
	
	Person() {
		species = "human:";
	}

	@Override
	public void move() {
		System.out.println("이동한다.");		
	}

	@Override
	public void eat() {

	}

}
