package ControlStamement;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		// switch
		
		/*
		switch (변수 또는 표현식) {		//데이터가 들어옴
		case 값1://if				//여기서 비교하고
			//값1에 해당하는 실행할 코드	//실행
			break;					//1.break를 만나면			
		case 값2://else if			//break가 없으면 넘어간다
			//값2에 해당하는 실행할 코드			
			break;
		case 값3://elseif
			//값3에 해당하는 실행할 코드			
			break;
		default://else
			break;
			
		}							//2. 여기로온다
		
		*/
		int a = 8;
		
		switch (a) {
		case 10:
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;	//여기서 탈출
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
			
		}
		
		if(a>=9) {
			System.out.println("A");
		}
		else if (a==8) {
			System.out.println("B"); //여기서 탈출
		}
		else if (a==7) {
			System.out.println("A");
		}
		else {
			System.out.println("D");
		}
		
		int num, result = 0;
		
		final int ONE = 1;
		
		/*
		switch (result) {
			case '1': //ok. 문자리터럴(정수 상수인 49와 동일)
				break;
			case ONE: //ok. 상수
				break;			
			case num://Error 변수 불가
				break;
			case 3.5://Error 실수 불가
				break;
		}
		*/
		
		char seasonCode = 'S';
		
		switch (seasonCode) {
		case 'S':
			System.out.println("봄");
			break;
		case 'U':
			System.out.println("여름");
			break;
		case 'A':
			System.out.println("가을");
			break;
		case 'W':
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 코드임");
			break;
		}
		
		System.out.println();
		
		/*
		 * 
		int inputNum = 0;
		
		
		Scanner scanner  = new Scanner(System.in);
				
		inputNum = scanner.nextInt();
		
		switch (inputNum) {
		case 1:
			System.out.println("너가 입력한 숫자는 : "+inputNum);
			break;
		case 2:
			System.out.println("너가 입력한 숫자는 : "+inputNum);
			break;	
		case 3:
			System.out.println("너가 입력한 숫자는 : "+inputNum);
			break;
		default:
			System.out.println("1~3중에 하나만 눌러라");
			break;
		}
			
		scanner.close();
		*/
		
		int random = (int)(Math.random()*3)+1;
		int player = 0;
		
		System.out.println("가위바위보 게임을 시작합니다");
		System.out.println("1~3중에 하나를 입력해 주세요(1=가위, 2=바위, 3=보)");
		
		Scanner scanPlayer = new Scanner(System.in);
		player = scanPlayer.nextInt();
		
		if (random == 1)
		{
			switch (player) {
			case 1:
				System.out.println("컴퓨터는 가위입니다. 비겼습니다!!");
			break;
			case 2:
				System.out.println("컴퓨터는 가위입니다. 이겼습니다!!");
			break;
			case 3:
				System.out.println("컴퓨터는 가위입니다. 졌습니다!!");
			break;
			default:
				System.out.println("1~3 중에서 하나를 입력하세요");
			break;
			}
		}
		else if (random == 2)
		{
			switch (player) {
			case 1:
				System.out.println("컴퓨터는 바위입니다. 졌습니다!!");
			break;
			case 2:
				System.out.println("컴퓨터는 가위입니다. 비겼습니다!!");
			break;
			case 3:
				System.out.println("컴퓨터는 가위입니다. 이겼습니다!!");
			break;
			default:
				System.out.println("1~3 중에서 하나를 입력하세요");
			break;
			}
		}
		else if (random == 3)
		{
			switch (player) {
			case 1:
				System.out.println("컴퓨터는 보입니다. 이겼습니다!!");
			break;
			case 2:
				System.out.println("컴퓨터는 보입니다. 졌습니다!!");
			break;
			case 3:
				System.out.println("컴퓨터는 보입니다. 비겼습니다!!");
			break;
			default:
				System.out.println("1~3 중에서 하나를 입력하세요");
			break;
			}
		}
		
		scanPlayer.close();
	}

}
