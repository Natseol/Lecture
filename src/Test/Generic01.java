package Test;

//제네릭 메서드는 호출되는 시점에 실제 제네릭 타입을 지정한다
//1. 제네릭 타입변수명이 1개일 때
//접근지정자 <T> T 메서드이름(T t)
//2. 제네릭 타입변수명이 2개일 때
//접근지정자 <T, V> T 메서드이름(T t, V v)
//3. 매개변수에만 제네릭이 사용된 경우
//접근지정자 <T> void 메서드이름(T t) {}
//4. 리턴타입에만 사용된 경우
//접근지정자 <T> T 메서드이름(int a) {}

class GenericMethod{
	public <T> T method(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K,V> void method3(K k, V v) {
		System.out.println(k+ " : "+v);
	}
}

//class A {
//	public <T> void method(T t) {
//		System.out.println(t.equals("하이"));//내장메서드는 타입에 상관없이 쓸 수 있는 Object메서드만 사용가능
//		System.out.println(t.length());//사용 불가
//	}
//}

public class Generic01 {
	
//	public static <T> void swap(T[] array, int index1, int index2) {
//		T temp = array[index1];
//	}

	public static void main(String[] args) {
		
		GenericMethod gm = new GenericMethod();
		
		String str1=gm.<String>method("안녕");
		
		String str2=gm.method("하이");//타입을 유추할 수 있어서 이렇게도 가능
		
		System.out.println(str1);
		System.out.println(str2);
		
		boolean b1 = gm.method2(2.5, 2.5);
		System.out.println(b1);
		
		gm.<String, Integer> method3("국어",2);
		gm.method3("국어",3);
		
		
	}
}
