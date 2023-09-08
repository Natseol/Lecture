package Assignment;

import java.util.Scanner;

import java.util.Random;

public class AssignmentClass {
		
	public static void main(String[] args) {
		
		//숫자야구
		
//		int number[] = new int[10];
//		int comNumber[] = new int[3];
//		int myNumber[] = new int[3];
//				
//		int ballCount;
//		int strikeCount;
//		
//		for (int i = 0; i <number.length; i++)//숫자 초기화
//		{
//			number[i]=i;
//		}
//				
//		//셔플
//		for (int i = 0; i< number.length; i++)
//		{
//		
//			int k =(int)(Math.random()*10);			
//			int temp = number[i];
//			number[i]=number[k];
//			number[k]=temp;					
//		}
//		
//		//난수발생 시킨 데이터 3개를 대입		
//		for (int i=0; i< comNumber.length;i++)
//		{
//			comNumber[i]=number[i];
//		}
//		
//		for (int i=0; i< comNumber.length;i++)
//		{
//			System.out.print(comNumber[i]+" ");
//		}
//		
//		System.out.println("\n");
//		
//		Scanner input = new Scanner(System.in);
//		while (true) {
//			System.out.println("0~9까지 숫자를 입력해라");
//			
//			//입력 3번 받기
//			for  (int i = 0 ; i < myNumber.length; i++)
//			{
//				myNumber[i]=input.nextInt();
//			}
//			
//			ballCount=0;
//			strikeCount=0;
//			
//			//비교
//			for (int i = 0; i< comNumber.length;i++)
//			{
//				for (int j = 0; j< myNumber.length; j++)
//				{
//					if(comNumber[i]==myNumber[j])
//					{
//						if(i==j)
//						{
//							strikeCount++;
//						}
//						else
//						{
//							ballCount++;
//						}
//					}
//				}
//					
//			}//end of for
//			
//			System.out.print(ballCount+" 볼 "+strikeCount+" 스트라이크 \n");
//			
//			if (strikeCount == 3)
//				{
//				System.out.println("끝");
//				break;
//				}			
//			
//		}//end of while
//		
//		input.close();
		
		//이번주 행복을 위한 로또번호 생성기 만들기
		//배열에 랜덤하게 데이터를 저장
		//6개를 추출
		
//		Random random = new Random();		
//				
//		int lotto[] = new int[45];
//		
//		for (int i = 0;i<lotto.length;i++)
//		{
//			lotto[i]=i+1;
//		}//초기화
//		
//		for (int i = 0;i<6;i++)
//		{
//			int number = random.nextInt(45);
//			int temp = lotto[i];
//			lotto[i] = lotto[number];
//			lotto[number] = temp;
//		}//셔플
//			
//		for (int i = 0;i<6;i++)
//		{
//			System.out.print(lotto[i]+" ");
//		}
//		System.out.println();
			
//		for (int i = 0;i<lotto.length;i++)
//		{
//			System.out.println("index"+i+" : "+lotto[i]);
//		}
		
		//행을 학생, 열을 과목이라고 할때
		//학생별 총점과 평균, 과목별 총점과 평균을 구하시오.
		
//		int score[][] = {
//				{70, 84, 90},
//				{86, 88, 98},
//				{67, 72, 81},
//				{75, 89, 82}
//		};//학생들의 점수
//		
//		int student[]=new int[4];
//		int subject[]=new int[3];
//		String subjectName[]= {"국어","영어","수학"};
//		
//		for (int i=0;i<score.length;i++)
//		{
//			for(int j=0;j<score[i].length;j++)
//			{
//				student[i]+=score[i][j];
//				subject[j]+=score[i][j];
//			}
//		}//합계 구하기
//		
//		for (int i=0;i<student.length;i++)
//		{
//			System.out.print((i+1)+"번째 학생의 총점 : "+student[i]+" , ");
//			System.out.printf((i+1)+"번째 학생의 평균 : "+student[i]/3+"\n");			
//		}
//		
//		System.out.println();
//		
//		for (int i=0;i<subject.length;i++)
//		{
//			System.out.print(subjectName[i]+" 과목의 총점 : "+subject[i]+" , ");
//			System.out.print(subjectName[i]+" 과목의 평균 : "+subject[i]/4+"\n");
//		}
		
		int[] number = new int[25];
		
		//셔플용 변수
		int dest, sour, temp;
		int key=0;
		int save=24;//0의 위치
		int move;//0의 움직임
		
		for (int i=24; i>=0;i--)
		{
			number[save-i]=i;			
		}
		
		//셔플
		for (int i = 0; i< 200; i++)
		{
			dest =(int)(Math.random()*24);
			sour =(int)(Math.random()*24);
			
			temp = number[dest];
			number[dest]=number[sour];
			number[sour]=temp;			
		}
		
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			for (int i = 0; i < number.length; i++)
			{
				System.out.print(number[i]+"\t");
				
				if ((i+1)%5==0)
				{
					System.out.print("\n\n\n");
				}
			}
			String inputStr = scanner.nextLine();
			key = Integer.parseInt(inputStr);
				
			switch (key)
			{
				case 4:
					if (save%5==0) break;
					move = number[save];
					number[save] = number[save-1];
					number[save-1]=move;
					
					save--;
				break;
				case 6:
					if((save+1)%5==0) break;
					move = number[save];
					number[save] = number[save+1];
					number[save+1]=move;
					
					save++;
				break;
				case 8:
					if(save<5) break ;
					move = number[save];
					number[save] = number[save-5];
					number[save-5]=move;
					
					save-=5;					
				 break;	
				case 2:
					if(save>=20) break;
					move = number[save];
					number[save] = number[save+5];
					number[save+5]=move;
					
					save+=5;
				break;
					
			}
			

			
		}
		
		
		
		
		
		
	}// end of main

}
