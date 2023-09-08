package myPack;

public class Pratice {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 5;
		
		int plus = a+b;//더하기
		int minus = a-b;//빼기
		int multiplication = a*b;//곱하기
		int division = a/b;//나누기
		int modulo = a%b ; //나머지
		
			System.out.println(plus);
			System.out.println(minus);
			System.out.println(multiplication);
			System.out.println(division);
			System.out.println(modulo);
		
			System.out.println();
		
			
		int value = 3;
		
		int plusValue = ++value;
			System.out.println(value);
			System.out.println(plusValue);

		value = 3;
	
		int valuePlus = value++;
			System.out.println(value);
			System.out.println(valuePlus);
			
			System.out.println();
	
		int number1 = 5;
		int number2 = 9;
		int result = number1++ - 2 + ++number1 - --number2;
		
		System.out.println(result);
		System.out.println(number1);
		System.out.println(number2);
		
		System.out.println();
			
		System.out.println(6>3);
		System.out.println(6<3);
		System.out.println(6>=3);
		System.out.println(6<=3);
		System.out.println(6==3);
		System.out.println(6!=3);
	
		System.out.println();
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		System.out.println(str1==str2);
		
		System.out.println();		
			
		int resultAnd = 13 & 7;
		
		System.out.println(resultAnd);
		System.out.println();
		
		int resultOr = 13 | 7;
		
		System.out.println(resultOr);
		System.out.println();
		
		int resultLeft = 11 << 2;
		
		System.out.println(resultLeft);
		System.out.println();
				
		int resultRight = 11 >> 2;
		
		System.out.println(resultRight);
		System.out.println();
		
		int playerHp = 200;
		int heal = 20;
		
		playerHp += heal;
		
		System.out.println(playerHp);
		System.out.println();
		
		int value1 = 7;
		int value2 = 4;
		int res = (value1>value2)?value1:value2;
		
		System.out.println(res);
		System.out.println();
		
		int num1 = 79;
		int num2 = 48;
		int num3 = 30;
		boolean isCheck = (num1-num2>num3)?true:false;
		
		System.out.println(isCheck);
		System.out.println();
		
		int number = 21;
		String sRes = (number%2==0)?"짝수":"홀수";
		System.out.println(sRes);
		System.out.println();
		
		int comparison1 = 3;
		int comparison2 = 6;
		System.out.println(comparison1 > 5 || comparison2 > 5);
		
				
		
		
			
				
		
		
		
	}
}
