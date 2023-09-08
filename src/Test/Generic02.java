package Test;

//제네릭 클래스의 타입제한
//접근지정자 class 클래스명 <T extends 최상위클래스/인터페이스> {}

//제네릭 메서드 타입제한
//접근 지정자<T extends 최상위클래스/인터페이스> 메서드 (T t) {}

class GenericMethod01 {
	public <T> void test(T t) {
//		char c=t.charAt(0);
	}
	public <T extends String>void method1(T t) {
		char c=t.charAt(0);
	}
}

class GenericMethod02 {
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());
	}
}

interface Myinterface {
	public abstract void print();
}

class BB{
	public <T extends Myinterface> void method01(T t) {
		t.print();
	}
}


class A{}
class B extends A{}
class C extends B{}
class D <T extends B>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Generic02 {

	public static void main(String[] args) {
		
//		D<A> d1=new D<>();
		D<B> d2=new D<>();
		D<C> d3=new D<>();
		
		GenericMethod02 g = new GenericMethod02();
		g.method1(5.5);
		
		BB bb = new BB();
		bb.method01(new Myinterface() {
			
			@Override
			public void print() {
				System.out.println("print");
			}
		}
		);
	}
}		

