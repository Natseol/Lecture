package c230831;

public class Main {

	public static void main(String[] args) throws Exception{

		//기본 모듈 : 알아서 가져다 사용하는 것들, java.lang에 위치
		//Object(객체), System, String, BuilderString, Math, Class 
		//1. Object : 최상위 클래스, 모든 클래스는 Object를 상속받는다
		//

		//표준 모듈 : 다운받거나 설치하지 않은 모듈들, java.util에 위치
		//Scanner

//		Object ob = new Object();
//		Main main = new Main();

//		System.out.println(main.hashCode());

		EqualsTest et1 = new EqualsTest(12,"test");
		EqualsTest et2 = new EqualsTest(34,"test");
		EqualsTest et3 = et1;
//			EqualsTest2 et4 = new EqualsTest2("test");
		System.out.println(et1.equals(et2));//주소 값이 다르면 false
		System.out.println(et1.equals(et3));//override

		System.out.println(et1.hashCode());//메모리 주소랑 비슷한 개념
		System.out.println(et2.hashCode());//모든 변수를 숫자로 표현
		
		System.out.println(et1.name.hashCode());
		System.out.println(et2.name.hashCode());
		
		System.out.println(et1.toString());//문자열로 변환
		System.out.println(et2.toString());//
		
		RecordTest recordTest = new RecordTest(1,"recordTest");
		RecordTest recordTest2 = new RecordTest(1,"recordTest");
		
		System.out.println(recordTest.hashCode());
		System.out.println(recordTest.name());//기본적으로 private, get쓸때
		System.out.println(recordTest2.hashCode());

		//System
		System.out.print("");//콘솔창에서 출력
		System.out.println("");
		
		//System.in //콘솔창에서 (키보드)입력
		int keyInput = 0;
		while(true) {
			keyInput = System.in.read(); // 예외설정 : throws Exception
			System.out.println(keyInput);
			//7 > 55, 13, 10
			//8 > 56, 13, 10
			//a > 97, 13, 10
			
			break;
		}
		
		System.currentTimeMillis();
		//현재 시간을 ms단위로 받는다, 1970년 기준, (GMT), UTC기준(ms단위)
		System.nanoTime();//나노초
		System.out.println(System.currentTimeMillis());
		
//		System.exit(0);//0:정상종료 1:비정상종료
		
		System.out.println("Java Version : "+System.getProperty("java.specification.version"));
		System.out.println("JDK directory : "+System.getProperty("java.home"));
		System.out.println("OS : "+System.getProperty("os.name"));
		System.out.println("UserName : "+System.getProperty("user.name"));
		System.out.println("UserDirectory : "+System.getProperty("user.home"));
		System.out.println("Directory : "+System.getProperty("user.dir"));
		
	}
}
class EqualsTest2 {

	String name;
	EqualsTest2(String name) {
		this.name=name;
	}
}
