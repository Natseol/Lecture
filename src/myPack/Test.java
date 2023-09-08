package myPack;

//이것은 주석이다.
//자바에서 모든 코드는 반드시 클래스 안에 존재해야 한다.
public class Test {

	//main 메서드의 선언. 미리 약속된 부분이다. 반드시 항상 있어야 한다
	//entry point. 진입점이다
	// 처음 프로그래밍 할때 가장 많이 실수 하는 것
	// 1. 오타
	// 2. 세미콜론, 중괄호 미스매칭
	public static void main(String[] args) {
		
		// 이것은 출력
		//println 개행한다(줄바꿈)
		//문자 > 2글자 이상부터는 문자열이라고 함. ""로 구분
		System.out.println("지옥으로 온걸 환영한다.");
		//뮨자열에서 + 기호는 문자열을 결합(연결)한다
		System.out.println("출력"+"해라");
		System.out.println(1);//정수
		System.out.println(5.1);//실수
		System.out.println('1');//1이라는 문자가 출력, 단일문자는 ''로 구분
		//6+문자열
		System.out.println(1+5+"오늘날씨 겁나덥네");
		
		//print 줄바꿈을 하지 않는다.
		System.out.print("나는 줄바꿈을 하지 않는다.");
		System.out.print(1234);
		System.out.print("진짜로 줄바꿈을 하지 않는다고!!");
		System.out.println();
		System.out.println("==================");
		//printf
		//%d 지시자, 서식연산자
		
		System.out.printf("정수 : %d ",42);
		System.out.printf("원주율 : %.3f",3.141592);
		
		//%s 문자열(String) %c 단일문자(Character)
		System.out.printf("이름 : %s","거꾸로해도이효리");
		System.out.printf("학점 : %c",'C');
		System.out.println();
		System.out.println();
		
		//출력을 활용해서
		
		System.out.println("===========신상정보==========");
		System.out.printf("이름 : %s","한상윤");
		System.out.println();
		System.out.printf("나이 : %d",36);
		System.out.println();
		System.out.printf("취미 : %s","스노우보드");
		System.out.println();
		System.out.printf("가족관계 : %s","부모님, 누나");
		System.out.println();
		System.out.printf("거주지 : %s","서울 암사");
		System.out.println();
		System.out.println("==========================");
		
		
		
	}
	
}
