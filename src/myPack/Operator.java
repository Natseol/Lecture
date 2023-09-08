package myPack;

import java.util.Scanner;

public class Operator {

		public static void main(String[] args) {
		
		/*
		 ========= 연산자 ========================
		 
		 	종류
		 *산술연산자 : + , - , * , / , %(나머지)
		 *증감연산자 : ++ , -- (값이 1씩 증가 또는 감소)
		 *비교연산자 : < , > , <= , >= , ==(같다) , !=(같지 않다)
		 비트연산자 : & , |(or) , ~ , ^		 
		 *논리연산자 : && , || , !
		 *대입연산자 : =
		 *복합대입 연산자 : += , -= , *= , /= ...
		 시프트연산자 : <<(비트를 왼쪽으로) , >>(비트를 오른쪽으로)
		 *삼항연산자 : (true or false) ? a:b (참이면 a, 거짓이면 b, 많아지면 가독성이 낮아진다)
		 
		 */
			
			int a = 10;
			int b = 5;
			int resultPlus = a+b;
				System.out.println("덧셈 결과 : "+resultPlus);
			int resultMinus = a-b;
				System.out.println("뺄셈 결과 : "+resultMinus);
			int resultMultiplication = a*b;
				System.out.println("곱셈 결과 : "+resultMultiplication);	
			int resultDivision = a/b;
				System.out.println("나눗셈 결과 : "+resultDivision);
				
		//증감연산자
		//전위 연산자와 후위 연산자로 나뉨
			int num = 3;
			++num;//전위연산자
			System.out.println("전위 증가 연산 : "+num);
			
			int number = 5;
			number++;//후위연산자
			System.out.println("후위 증가 연산 : "+number);
			//위 결과는 동일
			
			
			int value = 5;
			int preIncrementValue = ++value;//해당변수 +1증가시킴 > 해당 부분계산
			System.out.println("전위 증가 연산 결과 : "+preIncrementValue);
			System.out.println("value의 값 : "+value);
			
			value = 5;
			
			int postIncrementValue = value++;//해당 부분계산 > 해당변수 +1증가
			System.out.println("후위 증가 연산 결과 : "+postIncrementValue);
			System.out.println("value의 값 : "+value);
			
			
			int num1 = 7;
			int num2 = 7;
			int result1;
			int result2;
			
			result1 = --num1 +4;
			result2 = num2-- +4;
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println();
		
			
			int x = 10;
			int y = x-- +5+ --x;
			//문제
			//변수y의 수행되는 연산의 순서를 작성해라.
			// 1. 앞부분 x + 5 = 15
			// 2. x변수 1감소 x = 9
			// 3. x변수 1감소 x = 8
			// 4. 뒷부분 15 + x = 23
			//결과 y = 23 , x = 8
			
			//1. 첫번째 decrement operator는 피연산자의 뒤쪽에 위치하므로 덧셈이 먼저 수행
			//2. 덧셈 연산이 수행된 후에 감소 연산이 수행
			//3. 두번째 decrement operator는 피연산자의 앞쪽에 위치하므로 덧셈 연산보다 먼저 수행
			//4. 감소 연산이 수행된 후에 덧셈 연산이 수행
			//5. 미자막으로 대입연산 수행
			
			char c1 = 'a';
			char c2 = c1;
			char c3 = ' '; //공백으로 초기화
			
			int i = c1+1;
			System.out.println(i);
			c2++;
			System.out.println(c2);
			c3=(char)(c1+1);
			System.out.println(c3);
			char c4 = c2;
			System.out.println((int)c4);	
			System.out.println();
			
			//비교 연산
			//두 피연산자의 값의 크기를 비교하고 참이면 true
			//거짓이면 false를 반환한다.
			
			System.out.println(5<2);
			System.out.println(5>2);
			System.out.println(5<=2);
			System.out.println(5>=2);
			System.out.println(5==2);
			System.out.println(5!=2);
			
			int number1 = 5;
			int number2 = 2;
			int number3 = 5;
			
			//==, !=
			System.out.println(number1==number2);
			
			String str1 = new String("Hello");
			String str2 = new String("Hello");
			
			System.out.println(str1==str2);
			
			//해볼 것
			//국어, 영어, 수학, 과학, 국사 5개 과목의
			//총점과 평균을 구해라.
			
			int korean = 81;
			int english = 82;
			int math = 83;
			int science = 84;
			int history = 84;
			
			int sum = korean+english+math+science+history;
			double average = sum*0.2;
			
			System.out.println(sum);
			System.out.printf("%.2f\n\n",average);
			
			//비트연산자
			//&(AND) , |(OR) , ~(NOT,반전) , ^(XOR,서로다름)
			
			/*
				a	b	&	|	^	
				0	0	0	0	0	
				0	1	0	1	1
				1	0	0	1	1
				1	1	1	1	0
				
					~
				0	1
				1	0
				
			 */
			
			int bitNum1 = 5 ;//0000 0101
			int bitNum2 = 3 ;//0000 0011
			
			int resultAnd = bitNum1 & bitNum2;
			//0000 0101
			//0000 0011
			//---------
			//0000 0001 = 1
			System.out.println("&연산 결과 : "+resultAnd);
			
			int resultOr = bitNum1 | bitNum2;
			//0000 0101
			//0000 0011
			//---------
			//0000 0111 = 2			
			System.out.println("|연산 결과 : "+resultOr);
			
			int leftShift = bitNum1<<2;
			//0000 0101 << 2			
			//0001 0100
			System.out.println("왼쪽 쉬프트2 연산 결과 : "+leftShift);//왼쪽한칸당 *2
			
			int rightShift = leftShift>>1;
			//0001 0100			
			//0000 1010
			System.out.println("오른쪽 쉬프트1 연산 결과 : "+rightShift);//오른쪽한칸당 /2
			//위에서 알 수 있듯이 비트를 왼쪽, 오른쪽 하나씩 옮길때마다 *2, /2만큼 변경되는걸 알 수 있음
			
			
			//대입연산자
			//= , += , -= ...
			
			int playerHp = 100;
			int potion = 50;
			System.out.println("포션 섭취");
			//playerHp = playerHp + potion;
			//playerHp += potion;위의 축약표현
			
			int maxValue = 3;
			maxValue = maxValue+3;
			System.out.println("대입연산 결과 : "+maxValue);
			
			//복합대입 연산자
			int maxValue1 = 5;
			maxValue1+=10;//maxValue1=maxValue1+10
			System.out.println("복합대입연산 결과 : "+maxValue1);
			
			//삼항연산자
			int value2 = (true)?1:2;
			System.out.println(value2);
			
			int number5=10;
			int number6=20;
			int res = (number5>number6)? number5:number6;
			System.out.println("변수 2개 중 큰 수는? "+res);
			
			int number7=30;
			int number8=15;
			boolean isCheck = (number7-number8>10)?true:false;
			System.out.println("두 수의 차이가 10보다 크냐? : "+isCheck);
			
			int number9 = 2;
			String sRes=(number9%2==0)?"짝수" : "홀수";
			System.out.println("홀짝 결과는? : "+sRes);
			
			//논리연산자
			//&&, || , !
			
			//x>3 && x<5 x>3과 x<5 둘다 참일 경우 참
			//x>3 || x<5 x>3과 x<5 둘 중 하나만 참이면 참
			//길어질경우는 ()를 이용하여 구분을 하는 것이 편하다
			
			
			//출력
			//입력
			
			//스캐너 클래스 객체를 생성
			Scanner scanner = new Scanner(System.in);
			//입력받은 내용을 strInput에 저장
			//입력을 하고 입력한 내용이 문자열로 반환
			String strInput = scanner.nextLine();
			
			//parseInt(strInput)=>입력받은 내용을 int타입으로 변환
			//int input = scanner.nextInt(); 이걸 사용해도 가능
			int convertInput = Integer.parseInt(strInput);
			
			//import java.util.Scanner;
			//윗줄에 생김, Scanner를 불러옴
		
			//리소스 관리	
			scanner.close();
			System.out.println(convertInput);

			
			
			
		}
}
