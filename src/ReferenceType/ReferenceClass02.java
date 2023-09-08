package ReferenceType;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ReferenceClass02 {

		public static void main(String[] args) {
			
			//jagged Array
			
//			int[][] jaggedArr = new int[3][];
//			
//			jaggedArr[0] = new int[] {1,2,3}; //첫번째 행은 길이 3
//			jaggedArr[1] = new int[] {4,5}; //두번째 행은 길이 2
//			jaggedArr[2] = new int[] {6,7,8,9}; //세번째 행은 길이 4
////			
////			for( int i = 0; i<jaggedArr.length; i++)
////			{
////				for( int j = 0; j<jaggedArr[i].length; j++)
////				{
////					System.out.print(jaggedArr[i][j]+" ");					
////				}
////				System.out.println();
////			}
//			
//			//배열의 크기를 명시하지 않고 배열선언과 초기화
//			int[][] jaggedArr1= {
//					{1,2,3},
//					{4,5},
//					{6,7,8,9}
//			};
//			
//			int[][] grades= {
//					{90,85,73},
//					{59,89,75,61},
//					{35,91,73}
//			};
//			
//			for (int i = 0;i<grades.length; i++)
//			{
//				System.out.println("성적 : "+(i+1));
//				
//				for (int grade : grades[i])
//				{
//					System.out.println(grade+" ");
//				}
//				System.out.println();
//			}
//			
//			int count=1;
//			for (int[] i : grades)
//			{
//				System.out.println(count+"성적");
//				count++;
//				for(int j : i)
//				{
//					System.out.println(j);
//				}
//				System.out.println();
//			}
//			
			//입력으로
			//학생수(입력)
			//과목도(입력)
			
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.print("학생 수를 입력하세요");
//			int studentCount = scanner.nextInt();
//			scanner.nextLine();
//			
//			//학생수에 다른 가변배열 생성
//			int[][] grades = new int[studentCount][];
//			
//			//입력
//			for (int student = 0; student < studentCount; student++)
//			{
//				System.out.print("학생"+(student+1)+"의 과목 수를 입력하세요");
//				int subjectCount=scanner.nextInt();
//				scanner.nextLine();
//				
//				grades[student]=new int[subjectCount];
//				
//				for (int subject = 0; subject< subjectCount; subject++)
//				{
//					System.out.print("학생"+(student+1)+"의 과목"+(subject+1)+"의 성적을 입력하세요");
//					grades[student][subject]=scanner.nextInt();
//					scanner.nextLine();
//				}				
//			}
//			
//			//출력
//			
//			int studentNum=1;
//			for (int[] studentGrades : grades)
//			{
//				System.out.print("학생"+studentNum+"성적");
//				
//				for (int grade : studentGrades)
//				{
//					System.out.print(grade+" ");
//				}
//				System.out.println();
//				studentNum++;
//			}
//			
//			scanner.close();
			
//			int[] numbers = new int[1000000];
//			
//			for (int i = 0; i<numbers.length; i++)
//			{
//				numbers[i]=i;						
//			}
//			
//			long startTime, endTime;
//			int sum=0;
//			
//			startTime=System.currentTimeMillis();
//			for (int i = 0; i<numbers.length; i++)
//			{
//				sum+=numbers[i];						
//			}
//			endTime=System.currentTimeMillis();
//			
//			System.out.println(endTime);
//			
//			int[] a= new int[3];
//			
//			int[]numberArr = {5,7,1,3,10};
//			Arrays.sort(numberArr); //오름차순 정렬
			
			
//			//빙고
//			//체크한것은 #(35)으로 표기 > 형변환
//			//3빙고 종료
//			
//			int[] number = new int[25];
//			
//			int inputNum=0;
//			int bingoCount=0;
//			Scanner scanner = new Scanner(System.in);
//			
//			//배열 초기화			
//			for (int i=0; i<number.length;i++)
//			{
//				number[i] = i+1;				
//			}
//			
//			//셔플
//			for (int i=0; i<number.length;i++)
//			{
//				int k=(int)(Math.random()*25);
//				
//				int temp = number[k];
//				number[k] = number[i];
//				number[i] = temp;
//			}
//			
//			//루프
//			//1. 입력받은 숫자를 특수기호로 바꿈
//			//2. 나머지부분 계산
//			//3. 3줄이 되면 종료
//			while (true)
//			{
//				bingoCount=0;
//				for (int i = 0; i < number.length; i++)
//				{
//					if (number[i]==35)
//					{
//						System.out.print((char)number[i]+"\t");
//					}
//					else
//					{
//						System.out.print(number[i]+"\t");
//					}
//					if((i+1)%5==0)
//					{
//						System.out.print("\n\n"); 
//					}					
//				}//end i for 빙고 출력 
//
//				String inputString = scanner.nextLine();
//				inputNum=Integer.parseInt(inputString);
//				
//				for (int i = 0; i < number.length; i++)
//				{
//					if (number[i] == inputNum)
//					{
//						number[i] = 35;
//					}
//				}
//				
//				if(number[0]==35&&
//						number[6]==35&&
//						number[12]==35&&
//						number[18]==35&&
//						number[24]==35)						
//					{
//						bingoCount++;
//					}
//				
//				if(number[4]==35&&
//						number[8]==35&&
//						number[12]==35&&
//						number[16]==35&&
//						number[20]==35)						
//					{
//						bingoCount++;
//					}
//				
//				for (int i = 0; i < 5; i++)
//				{
//					//가로
//					if(number[i*5]==35&&
//						number[i*5+1]==35&&
//						number[i*5+2]==35&&
//						number[i*5+3]==35&&
//						number[i*5+4]==35)						
//					{
//						bingoCount++;
//					}
//					//세로
//					if(number[i]==35&&
//						number[i+5*1]==35&&
//						number[i+5*2]==35&&
//						number[i+5*3]==35&&
//						number[i+5*4]==35)						
//					{
//						bingoCount++;
//					}					
//				}//end of i for 빙고카운트++
//				
//				System.out.println("빙고 카운트 : "+bingoCount);
//				System.out.println();
//				
//				if (bingoCount >= 3 )
//				{
//					System.out.println(bingoCount+"빙고 완료!! 게임을 종료합니다");
//					break;
//				}
//				
//			}//end of while
//			
//			scanner.close();
			
			//6x6 빙고 만들기
			
//			int[] number = new int[36];
//			
//			int inputNum=0;
//			Scanner scanner = new Scanner(System.in);
//			
//			//배열 초기화			
//			for (int i=0; i<number.length;i++)
//			{
//				number[i] = i+1;				
//			}
//			
//			//셔플
//			for (int i=0; i<number.length;i++)
//			{
//				int k=(int)(Math.random()*36);				
//				int temp = number[k];
//				number[k] = number[i];
//				number[i] = temp;
//			}
//			
//			for (int i = 0; i<number.length;i++)
//			{
//				System.out.printf(number[i]+"\t");
//				if((i+1)%6==0)
//				{
//					System.out.print("\n\n");
//				}
//			}
			
			
			
			
			//퍼즐만들기
			//5x5
			//0을 움직이기
			
			int[][] puzzle = new int[5][5];
			int answer = 0;
			
			Scanner input = new Scanner(System.in);
			int button=0;			
			int row=0;
			int column=0;
			int newRow=0;
			int newColumn=0;
			
			for (int i = 0; i < puzzle.length; i++)
			{
				for (int j = 0; j<puzzle[i].length; j++)
					puzzle[i][j] = i*5+j;				
			}


			for (int i=0; i<5;i++)
			{
				for (int j=0; j<5;j++)
				{
				int k = (int)(Math.random()*5);
				int l = (int)(Math.random()*5);
				int temp = puzzle[i][j];
				puzzle[i][j] = puzzle[k][l];
				puzzle[k][l] = temp;						
				}
				
			}//기존 셔플			
			
//			int count=0;
//			int randomButton=0;
			
//			while (count<=1000)
//			{
//				
//				for (int i =0; i<puzzle.length;i++)
//				{
//					for (int j=0; j<puzzle[i].length;j++)
//					{
//						if (puzzle[i][j]==0)
//						{
//							row= i;
//							newRow = i; 
//							column = j;
//							newColumn = j;
//						}
//					}
//				}//0의 좌표 구하기
//				
//				randomButton=((int)(Math.random()*4)+1)*2;
//				
//				switch (randomButton)
//				{
//				case 2:
//					if (row==4) continue;
//					else newRow++;
//				break;
//				case 4:
//					if (column==0) continue;
//					else newColumn--; 
//				break;
//				case 6:
//					if (column==4) continue;
//					else newColumn++;
//				break;
//				case 8:
//					if (row==0) continue;
//					else newRow--;
//				break;			
//				}//옮길 좌표 구하기
//				
//				puzzle[row][column] = puzzle[newRow][newColumn];				
//				puzzle[newRow][newColumn] = 0;
//
//				count++;
//				
//			}//돌려서 셔플
			
			System.out.println();
			
			for (int[] i : puzzle)
			{
				for (int j : i)
				{
					System.out.print(j+"\t");
				}
				System.out.print("\n\n");
			}
						
			while (true)
			{
								
				for (int i =0; i<puzzle.length;i++)
				{
					for (int j=0; j<puzzle[i].length;j++)
					{
						if (puzzle[i][j]==0)
						{
							row= i;
							newRow = i; 
							column = j;
							newColumn = j;
						}
					}
				}//0의 좌표 구하기
				
//				System.out.print(row+" "+column+"\n");//0의 좌표 출력
//				System.out.print(newRow+" "+newColumn+"\n");//옮길 좌표 출력
				
				button = input.nextInt();
									
				switch (button)
				{
				case 2:
					if (row==4) continue;
					else newRow++;
				break;
				case 4:
					if (column==0) continue;
					else newColumn--; 
				break;
				case 6:
					if (column==4) continue;
					else newColumn++;
				break;
				case 8:
					if (row==0) continue;
					else newRow--;
				break;			
				}//옮길 좌표 구하기
				
//				System.out.print(row+" "+column+"\n");//0의 좌표 출력
//				System.out.print(newRow+" "+newColumn+"\n");//옮길 좌표 출력
				
				puzzle[row][column] = puzzle[newRow][newColumn];				
				puzzle[newRow][newColumn] = 0;
				
				
				for (int[] i : puzzle)
				{
					for (int j : i)
					{
						System.out.print(j+"\t");
					}
					System.out.print("\n\n");
				}
				
				answer=0;
				for (int i = 0; i < puzzle.length; i++)
				{
					for (int j = 0; j<puzzle[i].length; j++)
					{
						if (puzzle[i][j] == i*5+j) {
							answer++;
							}
					}							
				}//종료조건
				
				if (answer==25) {
					System.out.println("clear!!");
					break;					
				}//종료
				
			}//end of while
			
			input.close();			
			
			
		}//end of main
}
