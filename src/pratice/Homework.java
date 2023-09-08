package pratice;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
//		for (int i = 1; i <=5; i++)
//		{
//			for (int j=5; j>=i; j--)
//			{
//				System.out.print(" * ");
//			}	
//			System.out.println();
//		}		
		
//		Scanner inputScan = new Scanner(System.in);
//		int max = 0;
//		int min = 0;
//		int[] inputNumber = new int[5];
//				
//		for (int i=0; i<inputNumber.length;i++)
//		{		
//			System.out.printf("%d번째 숫자를 입력하세요\n",i+1);
//			inputNumber[i] = inputScan.nextInt();
//			
//			for (int j= 0;j<=i;j++)
//			{
//			if (i==0)
//			{
//				max = inputNumber[i];
//				min = inputNumber[i];
//				System.out.println("기본값 변경");
//			}
//			else if (inputNumber[i]>max)
//			{
//				max = inputNumber[i];
//				System.out.println("최대값 변경");
//			}
//			else if (inputNumber[i]<min)
//			{
//				min = inputNumber[i];
//				System.out.println("최소값 변경");
//			}
//			}//j for문 종료
//		}//i for문 종료
//						
//		System.out.println();			
//		System.out.printf("결과(최대값) %d , (최소값) %d\n",max,min);
//		System.out.println();
//
//		inputScan.close();
//		
//		
		//숫자야구
		
		int answer[] = new int[3];		
		int answerNum = 0;
		int answerCom = 0;
		
		while (true)
		{
			answerCom=(int)(Math.random()*10);
			
			if (answerNum==0)
			{	
				answer[answerNum]=answerCom;
			}
			else if(answerNum==1)
			{
				if (answerCom==answer[answerNum-1]) continue;
				answer[answerNum]=answerCom;
			}
			else if(answerNum==2)
			{
				if (answerCom==answer[answerNum-1]||answerCom==answer[answerNum-2]) continue;
				answer[answerNum]=answerCom;
			}
			else
			{
				break;
			}
			answerNum++;
		}//end of while, 3자리 생성
		
		System.out.print("답미리보기 : ");
		for (int i = 0;i<answer.length;i++)
		{
		System.out.print(answer[i]);
		}
		System.out.println();
		System.out.println();
		//답 미리보기
		
		
		int input[] = new int[3];
		int inputNum;
		Scanner numScan = new Scanner(System.in);
		
		int strike;
		int ball;
		
		while (true) // 게임 반복 while
		{

		inputNum = 0;			
		
		while (inputNum<3)  // 숫자 입력 while
		{
			System.out.printf("%d번째 숫자를 입력해주세요\n",inputNum+1);
			input[inputNum] = numScan.nextInt();
			
			if (input[inputNum]>9||input[inputNum]<0) //0~9가 아닐 떄 재입력
				{
				System.out.println("0부터 9까지의 숫자만 입력해주세요");
				continue;
				}
			
			if (inputNum==0) // 중복일때 재입력
			{
				inputNum++;
			}
			else if (inputNum==1)
			{
				if (input[inputNum]==input[inputNum-1])
					{
					System.out.println("중복된 숫자입니다 다시 입력해주세요");
					continue;
					}
				inputNum++;
			}
			else if (inputNum==2)
			{
				if (input[inputNum]==input[inputNum-1]||input[inputNum]==input[inputNum-2])
					{
					System.out.println("중복된 숫자입니다 다시 입력해주세요");
					continue;
					}
				inputNum++;
			}
			else
				break;
			
		}//숫자 입력 while
		
		System.out.println();
		System.out.print("입력하신 숫자는 : ");
		for (int i = 0;i<input.length;i++)
		{
		System.out.print(input[i]);
		}
		System.out.printf(" 입니다\n");
		//입력 미리보기		
				
		strike = 0;
		ball = 0;
		
		for (int i =0; i< input.length;i++)
		{
			for (int j=0; j<answer.length; j++)
			{
				if (input[i]==answer[j])
					{
					if (i==j)
						{
						strike++; 
						}
					else
						ball++;
					}
			}
		}
		
		System.out.printf("스트라이크 : %d, 볼 : %d\n\n",strike,ball);
		
		if (strike == 3)
			{
			System.out.println("정답입니다");
			break;
			}
		}//게임 진행 while		

		numScan.close();
		
		
	}//end of main
}
