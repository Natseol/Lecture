package ReferenceType;

public class ReferenceClass01 {

	public static void main(String[] args) {
		
		//1차원 배열
		int[] number = new int[4];
		
		//2차원 배열
		//타입[][] 변수이름; = int[][] score;
		//타입 변수이름[][]; = int score[][];
		//타입[] 변수이름[]; = int[] score[];
		
		//4x3 2차원 배열을 생성
		int [][] score1= new int[4][3];
		
//					3열
//			인덱스	0	1	2
//		4행	0		1	1	1
//			1		1	1	1
//			2		1	1	1
//			3		1	1	1
		
		//2차원 배열 초기화
//		int[][] arr = new int[][] {{1,2,3},{4,5,6}};
//		int[][] arr1 = {{1,2,3},{4,5,6}};
//		
//		int[][] arr2 = 
//		{{1,2,3},
//		{4,5,6}
//		};
//		
//		int[][] score = {
//				{100, 100, 100},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40},
//				{50, 50, 50},
//		};
//		System.out.println("2차원 배열 score의 길이 : "+score.length);
//		System.out.println("2차원 배열 score[0]의 길이 : "+score[0].length);
//		System.out.println("2차원 배열 score[1]의 길이 : "+score[1].length);
//		System.out.println("2차원 배열 score[2]의 길이 : "+score[2].length);
//		System.out.println("2차원 배열 score[3]의 길이 : "+score[3].length);
//		System.out.println("2차원 배열 score[4]의 길이 : "+score[4].length);
//		
//		int[][] num = new int[4][3];
//		
//		for (int i =0; i<num.length; i++)
//		{
//			for(int j =0; j<num[i].length; j++)
//			{
//				num[i][j]=70;//모든 요소를 70으로 초기화
//			}
//		}
		
		int[][] score = {
		//국어 영어 수학
		{100, 100, 100},
		{20, 20, 20},
		{30, 30, 30},
		{40, 40, 40},
		{50, 50, 51},
		};
		
		for (int i =0;i<score.length;i++)
		{
			for (int j = 0; j<score[i].length;j++)
			{
				System.out.printf("점수[%d][%d]=%d\n",i,j,score[i][j]);
			}
			
		}
		
		// 5명의 학생의 세 과목을 더해서 각 학생의 총점과 평균을 계산하고
		// 과목별 총점을 계산해라
		
		int student[]=new int[5];
		int subject[]=new int[3];				
		
		for (int i=0; i< score.length;i++)
		{
			for (int j=0; j<score[i].length;j++)
				{
				student[i] += score[i][j];
				subject[j] += score[i][j];
				}

		}
		
		for (int i=0;i<student.length;i++)
		{
		System.out.print(i+"번 학생 총점 : "+student[i]+" ");
		System.out.printf(i+"번 학생 평균 : %.1f\n",(double)student[i]/3);
		}
				
		System.out.println("국어 총점 : "+subject[0]);
		System.out.println("영어 총점 : "+subject[1]);
		System.out.println("수학 총점 : "+subject[2]);
		
		int[] arr= {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		
		//다른 형태의 for문
		for (int i : arr) {
			System.out.println(i);
		}//배열이나 컬렉션에 저장된 내용을 읽어오는 용도로만 사용
		
		for (int[] i:score)
		{
			for (int j:i)
			{
				System.out.println(j);
			}			
		}
		
			
		
	}//end of main
}
