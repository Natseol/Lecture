package ControlStamement;

import java.util.Scanner;

public class LoopClass01 {

	public static void main(String[] args) {
	
		//while
//		while (조건식) {
//						
//		}
//		
//		int number = 0;
//		while(true)
//		{
//			
//			//반보적으로 실행시킬 코드
//			//단, 종료조건이 반드시 있어야 된다.
//			//if(조건) break;
//			
//			number++; //1씩증가
//			System.out.println(number);//출력
//			if (number==10) break;//number가 10이면 해당while문 빠져나옴
//			
//		}
//		
//		int count = 10;
//		while(count!=0)
//		{
//			count--;
//			System.out.println(count);
//			
//		}
//		
//		int sum = 0;//합계용 변수
//		int num;
//		Scanner input = new Scanner(System.in);
//		boolean flag = true;
//		while (flag) {
//			System.out.print(">>");
//			
//			String temp = input.nextLine();
//			num=Integer.parseInt(temp);
//			
//			if(num!=0) //입력이 0이 아니라면
//			{
//				sum+=num;// 내가 입력한 정수를 계속해서 더하고				
//			}
//			else //입력이 0이라면
//			{
//				flag = false;//flag=>false
//			}
//			System.out.println("합계 : "+sum);
//			
//		}//end of while
//				
//		input.close();
		
//		System.out.println();
		
		//1. 가위바위보 업그레이드
		//
		//-> 10판만 할 수 있다. 배팅금액이 올인되면 종료
		//-> 플레이어는 소지금 표기
		//-> 배팅금액 표기
		//-> 판수 표기
		//-> 플레이어가 이기면 배팅금액에 *2만큼
		//-> 비겼다면 배팅금액만큼만 소모
		//-> 졌으면 배팅금액의 *2만큼 소모
		
		
//		Scanner inputBat = new Scanner(System.in);
//		Scanner inputRps = new Scanner(System.in);
//		
//		int cash=100;
//		int playerRps;
//		int computerRps = (int)Math.random()*3+1;
//		int win = 0;
//		
//		int count = 1;
//		while (count!=11)
//		{
//						
//		System.out.printf("%d번째 판입니다\n",count);
//		System.out.printf("현재 당신의 소지금 = %d\n",cash);
//		System.out.println("배팅금액을 적어주세요");
//		int bat = inputBat.nextInt();
//		cash -= bat;
//		System.out.println("가위바위보를 합니다");
//		System.out.println("1~3 중에 하나를 선택해주세요.(1=가위, 2=바위, 3=보)");
//		playerRps = inputRps.nextInt();
//		
//		switch (playerRps)
//		{
//		case 1:
//			switch (computerRps)
//			{
//			case 1:
//				System.out.println("컴퓨터는 가위입니다. 비겼습니다");
//				win = 0;
//				break;
//			case 2:
//				System.out.println("컴퓨터는 바위입니다. 졌습니다");
//				win = -1;
//				break;
//			case 3:
//				System.out.println("컴퓨터는 바위입니다. 이겼습니다");
//				win = 2;
//				break;	
//			}	
//		break;
//		case 2:
//			switch (computerRps)
//			{
//			case 1:
//				System.out.println("컴퓨터는 가위입니다. 이겼습니다");
//				win = 2;
//				break;
//			case 2:
//				System.out.println("컴퓨터는 바위입니다. 비겼습니다");
//				win = 0;
//				break;
//			case 3:
//				System.out.println("컴퓨터는 바위입니다. 졌습니다");
//				win = -1;
//				break;	
//			}	
//		break;
//		case 3:
//			switch (computerRps)
//			{
//			case 1:
//				System.out.println("컴퓨터는 가위입니다. 졌습니다");
//				win = -1;
//				break;
//			case 2:
//				System.out.println("컴퓨터는 바위입니다. 이겼습니다");
//				win = 2;
//				break;
//			case 3:
//				System.out.println("컴퓨터는 바위입니다. 비겼습니다");
//				win = 0;
//				break;	
//			}
//		break;
//		}//end of switch
//		
//		cash += bat*win;
//		System.out.println();
//		count++;
//		
//		if (cash<=0) {
//			System.out.println("돈을 전부 잃었습니다. 게임을 종료합니다");
//			break;
//		}
//		
//		}//end of while
//		
//		inputBat.close();
//		inputRps.close();
		
		
		
		
		
		//2. 랜덤 숫자 맞추기
		//-> 컴퓨터 랜덤한숫자를 생성한다. (1~100)
		//-> 플레이어는 랜덤한 숫자를 맞춘다.
		//-> 단, 컴퓨터는 플레이어가 낸 숫자에 대해서 범위를 알려준다.
		//-> ex) 50 -> 80
		
//		System.out.println("업다운 게임~~!!");
//		System.out.println("1~100까지의 숫자중에 하나를 맞춰주세요");
//		
//		Scanner scanNum = new Scanner(System.in);
//		int randomNum = (int)(Math.random()*100)+1;
//		while (true)
//		{
//			int inputNum = scanNum.nextInt();
//			
//			if (inputNum>randomNum)
//			{
//				System.out.println("Down!!");
//			}
//			else if (inputNum<randomNum)
//			{
//				System.out.println("Up!!");
//			}
//			else
//			{
//				System.out.println("정답입니다");
//				break;
//			}
//		}
		
		//3. 별짓기
//		
//		for (int i = 1; i <=5; i++)
//		{
//			for (int j=1; j<=6-i; j++)
//			{
//				System.out.print(" * ");
//			}	
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i = 1; i <=5; i++)
//		{
//			for(int j=1; j <=5; j++)
//			{
//				if (5-j>=i)
//				{
//					System.out.print("   ");
//				}
//				else					
//				{
//					System.out.print(" * ");
//				}
//			} //j for문
//			System.out.println();
//		}//i for문
//		
//		System.out.println();
//		
//		for (int i = 1; i <=5; i++)
//		{
//			for(int j=1; j <=5; j++)
//			{
//				if (i>j)
//				{
//					System.out.print("   ");
//				}
//				else					
//				{
//					System.out.print(" * ");
//				}
//			} //j for문
//			System.out.println();
//		}//i for문
//		
//		System.out.println();
//		
//		for (int i = 1; i<=9; i++)
//		{
//			for (int j = 1; j<=9; j++)
//			{
//				if (i+j>=6 &&( (i+j)%2==0 )&&( Math.abs(i-j) <=4 )&&(i+j)<=14 )
//				{
//					System.out.print(" * ");
//				}
//				else
//				{
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
//				
//		if (조건) continue; //반복문에서는 아래 코드를 건너뛰고 반복문의 시작부터 다시 실행
//		
		int menu = 0;
		Scanner foodInput = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("(1)햄버거");
			System.out.println("(2)탕수육");
			System.out.println("(3)육개장");
			System.out.println("오늘 점심에 먹을 메뉴를 골라라. 종료는 0");
			
			String temp = foodInput.nextLine();
			menu = Integer.parseInt(temp);
			
			System.out.println();

			
			if(menu==0) {
				System.out.println("프로그램을 종료한다");
				break;
			}
			else if (!(1<=menu&&menu<=3))
			{	
				System.out.println("메뉴를 잘못선택함. 재입력");
				continue;
			}
			System.out.println("선택한 메뉴는"+menu+"번임");									
		}
		foodInput.close();
//		
//		
		
		
		
	}
}
