package ControlStamement;

import java.util.Scanner;

public class LoopClass {

	public static void main(String[] args) {
		
		// 반복문
		// 1. 어떤 작업이 반복적으로 수행하도록 만들 때 사용한다.
		// 2. for, while, do-while
		// 3. for문이나 while문에 속한 코드들은 조건에 따라 한번도 실행되지 않을 수 있다.
		//		do-while은 최소 한번은 수행된다.
		
		//for
		//초기식 : for문이 시작될 때 딱 한번만 실행된다.
		//조건식 : 조건이 false가 될때까지 계속 반복된다.  
		//증감식 : 다음 반복을 위해 다시 이동하는 위치로 매회 반복이 될 때마다 호출된다.
		
		//for (초기값; 조건식; 증감식)
		//{
		//반복시킬 코드 -> 조건식이 true인 동안만
		//}
				
		
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		
		System.out.println();
		
		System.out.println("for 문을 이용한 출력");
		for (int i=0; i<3; i++)
		{
			System.out.println("반복시킨다");
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++)
		{			
			System.out.println(i);			
		}
		
		System.out.println();
		
		int k;// 사용하지 않는 형태
		
		for (k=0;k<5; k++) {// 사용하지 않는 형태
			System.out.printf("k 변수의 데이터 : %d\n",k);// 사용하지 않는 형태
		}// 사용하지 않는 형태
		
		System.out.println();
		
		for ( int i = 10; i>0; i--) {
			System.out.printf("i 변수의 데이터 : %d\n",i);			
		}
		
		System.out.println();
		
		//실습
		//1. 1부터 100까지의 합을 구해라
		//출력 : 1~100까지의 합: ?????
		/*
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum += i;
		}
		System.out.printf("1~100까지의 합 : %d\n", sum);	
		System.out.println();
		
		int dan = 2;
		
		for (int i = 1 ; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		
		System.out.println();
		
		//실습
		//입력을 받는다.
		//ex) 3을 입력하면 3단이 나온다.
		
		Scanner scanMulti = new Scanner(System.in);
		int multi = scanMulti.nextInt();
		
		System.out.printf("%d단 출력\n", multi);		
		for (int i = 1; i<=9; i++) {
			System.out.println(multi+" * "+i+" = "+multi*i);			
		}
		
		scanMulti.close();
		System.out.println();
		*/
		
		for (int i=1; i <=10; i++)
		{		
			if(i%2!=0) {//2로 나눈 나머지가 0이 아니라면
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		//중첩for문
		
		for (int i =0; i<3;i++)
		{
			for (int j=0; j<3; j++) 
			{
				System.out.println(i+" , "+j);
			}				
		}
		
		System.out.println(); 
		
		for (int i = 2 ; i<=9;i++)
		{
			for (int j=1 ; j<=9; j++)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		System.out.println();
		
		int num = 5;
		for (int i = 1; i<=num; i++) 
		{
			for (int j = 1; j<=i; j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

		

	}
	
	
}
