package myPack;

public class Variable {
	
	public static void main(String[] args) {
		
		//변수
		//프로그래밍에서 가장 기본적인 동작은 데이터를 저장,
		//저장된 데이터 값을 읽어온다.
		
		//데이터를 저장하려면 메모리에 값을 저장할 공간을 생성한다.
		//이름을 부여해야한다.
		
		//사물함이 어려개 있을때 물건을 보관하고 번호를 매겼다면?
		//사물함이 메모리, 사물함의 번호가 변수라고 보면된다.
		
		//단 하나의 값을 저장할 수 있는 메모리 공간임.
		
		// 1,2 > 정수형
		// 2.3 > 실수형
		// a,b > 문자
		// 가나 > 문자열
		
		//변수 선언 방법
		//정수형 변수명; -> int num;
		
		//데이터를 저장하기 위해 생성하는 메모리 공간은
		//목적에 따라 크기와 특징이 다른데 이를 자료형(데이터타입) 이라고 부른다.
		
		//변수를 사용하기 전에 반드시 자료형을 선언
		
		int num =10;
		
		System.out.println("정수형 타입의 변수 num에 저장된 값 : "+num);
		
		//a=1;데이터타입이 명시 되지 않았으므로 Error
		
		//변수 초기화 방법
		//초기화는 변수의 어떠한 값을 대입하는 것이 초기화
		
		//1.변수의 선언과 동시에 초기화
		int number = 5;
		System.out.printf("변수 number에 저장된 값 : %d",number);
		System.out.println();
		
		//2.변수 선언 후 초기화
		int player;
		player = 100;
		System.out.printf("변수 player에 저장된 값 : %d",player);
		System.out.println();
		
		//변수이름을 지을때 반드시 지켜야 하는 사항
		/*
		 1. 대소문자가 구분되며 길이에 제한은 없다.
		 int abc; <> int ABC;
		  
		 2. 특수문자는 언더바_,$도 사용가능
		 int ab_c
		 
		 3. 아라비아 숫자도 가능(맨처음에 오는건 안됨)
		 int a1
		 int 1a 에러
		 
		 4. 예약어를 사용할 수 없다.
		 int int 에러
		 
		 */
		
		/* 
			================================================================
			변수명을 지을때 반드시 지켜야할 것
			1. 영문 소문자로 시작, 풀네임으로 적을것
			int average;
			int name;
			
			2. 영문단어를 2개이상 결합할때는 새로운단어의 첫글자를 대문자로 시작(카멜표기법)
			int maxValue;
			================================================================
		*/
		
		//int 근본없는한글변수 = 100;
		//System.out.println(근본없는한글변수);
		
		/* (기본)자료형의 종류
		
		-분류-		-타입-		-크기(byte)-
		
		정수형		byte			1
					short			2
					int				4
					long			8
		
		실수형		float			4
					double			8
							
		논리형		boolean			1
							
		문자(정수)	char			2
		
		 */
		
		boolean isCheck = false;
		byte flag = 1;
		int count = 10;
		short index = 2;
		long phoneNumber = 123456;
		float temperature = 1.0005f;//float은 변수초기화시 끝에 f를 붙임
		double pi = 3.141592123;
		char grade = 'a';
		
		System.out.println(isCheck);
		System.out.println(flag);
		System.out.println(count);
		System.out.println(index);
		System.out.println(phoneNumber);
		System.out.println(temperature);
		System.out.println(pi);
		System.out.println(grade);
		
		//실수형
		//double이 "정밀도"가 더 높아서 많이 씀
		//정밀도가 낮으면 오차가 발생할 수 있다
		float f1 = 1.0000001f;
		System.out.println("f1에 저장된 값 : "+f1);
		float f2 = 1.00000012f;
		System.out.println("f2에 저장된 값 : "+f2);
		double d1 = 1.000000000000005;
		System.out.println("d1에 저장된 값 : "+d1);
		double d2 = 1.0000000000000055;
		System.out.println("d2에 저장된 값 : "+d2);
		
		//float f1;재선언 불가능 
		f1 = 5.44444f;//재할당은 가능
		
		//상수
		//변수와 마찬가지로 값을 저장할 수 있지만 한번 저장하면 변경 불가능
		//변수 이름은 무조건 대문자로 쓴다
		
		final int MAXSPEED = 10;
		// MAXSPEED = 20;에러, 상수로 선언했기떄문에
		
		final int MOVE;
		// System.out.println(MOVE);초기화를 안해서 에러
		
		//int triangleArea = (20*10)/2;
		//int rectangleArea = 20*10;
		
		//System.out.println(triangleArea);
		//System.out.println(rectangleArea);
		
		//상수로 변경
		//다른값으로 계산할 때도 여러 곳을 수정할 필요없이 상수값만 변경해주면 됨
		final int WIDTH = 20;
		final int HEIGHT = 10;
		int triangleArea = (WIDTH*HEIGHT)/2;
		int rectgleArea = WIDTH*HEIGHT;
		
		//자료형을 이용해
		//본인의 전화번호, 나이, 키, 몸무게 등등을 출력해라
		
		int myPhone = 1049493759;
		//0으로 시작하면 8진수, 0x는 16진수, 0b는 2진수
		int myAge = 36;
		int myHeight = 172;
		int myWeight = 75;
		
		System.out.println("전화번호 : "+myPhone);
		System.out.println("나이 : "+myAge);
		System.out.println("키 : "+myHeight);
		System.out.println("몸무게 : "+myWeight);
		
		//개행
		System.out.printf("\n");
		//탭
		System.out.printf("안녕\t안녕");
		System.out.println();
		
		//참조자료형은 stack에 heap의 주소를 저장하고 heap에서 값이 저장됨
		//heap 메모리에 직접적으로 접근이 불가능
		
		int data = 10;
		System.out.println(Integer.toBinaryString(data));//2진수
		System.out.println(Integer.toOctalString(data));//8진수
		System.out.println(Integer.toHexString(data));//16진수
		
		System.out.println(Integer.parseInt("1010",2));//n진수를 10진수로
		
		
		
		//{}에서 넘어가면 변수 값이 사라짐
		/*{int value = 132;
		
		}
		System.out.println(value);
		*/
	}
	

}
