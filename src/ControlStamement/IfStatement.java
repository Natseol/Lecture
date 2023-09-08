package ControlStamement;

import java.util.Scanner;

public class IfStatement {
	
	public static void main(String[] args) {
		
		System.out.println("월요일이다.");
		
		/*
		
		//조건문
		//1. if, 동작조건이 ture면
		
		if (조건식) //  
		{
		//여기를 실행해라, 조건식이 true일때만
		//여러줄 가능
		//실행시킬 코드가 한줄이면 {}를 자동삽입
		
		}
		
		
		//2. if~ else
		
		if (조건식) {
			//참이면 여기를 실행하고
		}
		//단독 사용 불가
		else {
			//거짓이면 여기를 실행한다
		}
		
		
		//3. if~ else if~ else
		// 조건식이 true면 해당하는 결과만 실행하고 종료
		
		if(조건식) {}
		else if(조건식) {} //여러개 가능
		else if(조건식) {}
		else {}
		
		*/
		
		if(10<3) {
			System.out.println("위 조건이 맞으면 여기가 실행");
		}
		else {
			System.out.println("아니면 여기가 실행");
		}
		
		int number = 17;
		
		if(number%2==0) {
			System.out.println(number + "는 짝수");
		}
		else {
			System.out.println(number + "는 홀수");
		}
		
		int height = 150;
		
		if(height>=140) {
			System.out.println("놀이기구 탑승 가능");
		}
		else {
			System.out.println("놀이기구 탑승 불가");
		}
		
		int a = 85;
		if(a>=90) {
			System.out.println("A학점");
		}
		else if(a>=80) {
			System.out.println("B학점");
		}
		else if(a>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
			
		}

		
		int score = 0 ;
		char grade = ' ';
		
		System.out.println("점수를 입력해라");
		Scanner scanner = new Scanner(System.in);
		
		//화면을 통해 입력받은 숫자를 score에 저장한다
		/*
		score = scanner.nextInt();
		*/
		
		if (score>=90) {
			grade = 'A';
		}
		else if (score>=80) {
			grade = 'B';
		}
		else if (score>=70) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		
		System.out.println("너의 학점은 "+grade+"학점이다");
		System.out.println();
			
		
		
		/*
		if (조건식1) { 
			//조건식1이 true일 때 실행될 코드를 기재
			if(조건식2) {
				//조건식 1,2가 모두 true일 때 실행될 코드를 기재
			}
			else
			{
				//조건식 1이 true, 조건식 1이 false일 때 실행될 코드를 기재
			}
		}
		else {
			//조건식 1이 false일 때 실행
			
		}
		*/
		
		//실습
		//90점보다 같거나 크면 A학점
		//90점 이상에서도 98점 이상은 A+
		//94점 미만이면 A-
		
		//B학점도 마찬가지
		//위 조건이 전부 아니면 C
		
		
		
		int exScore = 0;
		String exGrade = new String("");
		
		System.out.println("예시 점수를 입력해라");
		//화면을 통해 입력받은 숫자를 exScore에 저장한다
		exScore = scanner.nextInt();
				
		if (exScore>=90) 
		{
			if (exScore>=97)
			{
				exGrade = "A+학점";
			}
			else if (exScore>=94)
			{
				exGrade = "A학점";
			}
			else
			{
				exGrade = "A-학점";
			}
			
		}
		else if (exScore>=80)
		{
			if (exScore>=87)
			{
				exGrade = "B+학점";
			}
			else if (exScore>=84)
			{
				exGrade = "B학점";
			}
			else
			{
				exGrade = "B-학점";
			}
		}
		else
		{
			exGrade = "C학점";
			
		}
		
		System.out.printf("너의 학점은 %s이다\n",exGrade);
		
		scanner.close();

		
		
		
		
		
		
	}
	
}
