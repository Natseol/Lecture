package Test;

class Apple{}
//class Goods1 {
//	private Apple apple = new Apple();
//	
//	public Apple getApple() {
//		return apple;
//	}	
//	public void setApple(Apple apple) {
//		this.apple = apple;
//	}
//}

class Pencil{}
//class Goods2{
//	private Pencil pencil = new Pencil();
//	
//	public Pencil getPencil() {
//		return pencil;
//	}	
//	public void setApple(Pencil pencil) {
//		this.pencil = pencil;
//	}
//}

//위 코드를 봤을 때 새로운상품이 추가 될때마다 반복된다
//1. Object타입으로 선언
//Object 객체를 저장하고 관리하는 클래스를 생성하면 클래스를 만들어주면서 저장하거나 읽어들일 수 있음

class Goods3 {
	private Object object = new Object();
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object=object;
	}
}

// 제네릭 클래스와 제네릭 인터페이스
// 제네릭 클래스

/* 접근지정자 class 클래스명<T> {
 * }
 * 접근지정자 class 클래스명<K,T> {
 * }
 * 접근지정자 interface 클래스명<T> {
 * }
 * 접근지정자 interface 클래스명<K,T> {
 * }
 */

//제네릭 클래스의 객체생성
//객체생성 과정은 일반 클래스의 객체 생성과 비슷
//단, 클래스명 다음에<실제 제네릭 타입>을 삽입한다.
//즉,객체를 생성할 때 제네릭 타입 변수에 실제 타입을 대입한다.

//클래스명<실제 제네릭 타입> 참조변수명 = new 클래스명 <실제 제네릭타입>();
//클래스명<실제 제네릭 타입> 참조변수명 = new 클래스명 <>();

class MyClass<T> {
	
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

class KeyValue<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

class CharacterFactory<T> {
	private T character;
	
	public CharacterFactory(T character) {
		this.character=character;
	}
	public void Introduce() {
		System.out.println("나는"+character.getClass().getSimpleName()+"character");
	}
	public T getCharacter() {
		return character;
	}
		
}

class Knight {
	private String name;
	public Knight(String name) {
		this.name = name;
		
	}
	public void Attack() {
		System.out.println(name+" 공격!!");
	}
}

class Wizard {
	private String name;
	public Wizard(String name) {
		this.name = name;
		
	}
	public void Skill() {
		System.out.println(name+" 지팡이 공격!!");
	}
	
}

public class Generic {

	public static void main(String[] args) {

		Goods3 goods3 = new Goods3();
		
		goods3.set(new Apple());
		
		Apple apple = (Apple)goods3.get();
		
		
//		//타입을 만들기 위해서는 get은 형변환 필요
//		//필드 자체가 Object타입이라 get으로 가져오는 타입또한 항상 Object타입이기 떄문
//		//get을 할때는 set을 한 타입으로 형변환 해야 한다.
//		//end 1.
		
		//String 타입으로 저장하거나 꺼내 올수 있는 객체 지정
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		//Integer 타입으로 저장하거나 꺼내 올수 있는 객체 지정
		MyClass<Integer> mc2 = new MyClass<Integer>();
		mc2.set(123);
		System.out.println(mc2.get());
		//객체를 생성하는 시점에 타입을 지정함
		
		//변수가 2개일 경우
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		
		kv1.setKey("원숭이");		
		kv1.setValue(123);
		
		String key1=kv1.getKey();
		int value1=kv1.getValue();
		
		System.out.println(key1+value1);
		
		KeyValue<String, Void> kv2 = new KeyValue<>();
		
		kv2.setKey("키만 사용");
//		kv2.setValue(123);//안됨
		
		CharacterFactory<Knight> knightFactory = new CharacterFactory<>(new Knight("세바스찬"));
		CharacterFactory<Wizard> wizardFactory = new CharacterFactory<>(new Wizard("엘리자베스"));
		
		knightFactory.Introduce();
		Knight knight = knightFactory.getCharacter();		
		knight.Attack();
		
		Wizard wizard = wizardFactory.getCharacter();
		wizard.Skill();
		
	}
}
