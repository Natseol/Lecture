package Object;

//1. packagePrivate(default) 같은 패키지 내에서만 사용가능
//2. private 키워드가 사용되면 자기자신 클래스외에 접근 불가
//3. public이 없고 static만 붙어 있을 경우, packagePrivate와 동일
//4. public이 붙은 메서드는 외부패키지 어디서든지 접근가능

//빙고 클래스로 만들기

public class Class04 {
	
	void packagePrivateMethod() {//같은 패키지 내에서만 접근 가능
		System.out.println("나는 packagePrivateMethod");
	}
	
	private void privateMethod() {//오직 클래스 내에서만 접근 가능
		System.out.println("나는 packageMethod");
	}
	
	static void staticMethod() {//클래스 이름으로 호출 가능, 같은 패키지 내에서만 접근 가능
		System.out.println("나는 staticMethod");
	}
	
	private static void privateStaticMethod() {
		System.out.println("나는 privateStaticMethod");
	}
	
	public void publicMethod() {
		System.out.println("나는 publicMethod");
	}
	
	public static void publicStaticMethod() {
		System.out.println("나는 publicStaticMethod");
	}
	
}//end of class.Exam

//public class Class04 {
//
//	public static void main(String[] args) {
//		
//		Exam exam =  new Exam();
//		exam.packagePrivateMethod();
////		exam.privateMethod();
//		Exam.staticMethod();
//		exam.publicMethod();
//		
//	}//end of main
//}
