package ReferenceType;

import java.util.Scanner;

public class ReferenceClass {

	public static void main(String[] args) {
		
		//배열 *중요
		//같은 Type의 여러 variable을 하나의 묶음으로 다루는것
		//서로 다른 타입의 변수들로 구성된 배열은 불가
		
		//배열선언
		
		//1. 타입[] 변수이름;
		//int[] score;		
		//String[] name;
		//2. 타입 변수이름[];
		//int score[];
		//String name[];
		
		//배열을 선언한 다음에는 배열을 생성
		//배열을 선언하는 것은 단지 생성된 배열을 다루는 참조변수를 위한 공간만 만들어지는 것
		//배열을 생성해야만 값을 저장할 수 있는 공간이 만들어진다
		//배열을 생성하기 위해서는 new를 이용해 배열의 타입과 길이를 지정해 줘야함
		
		//타입[] 변수이름; => 배열을 선언(참조변수 선언)
		//변수이름 = new 타입[길이]; => 배열을 생성(실제 데이터가 저장될 공간)
		//int[] score; => int타입의 배열을 다루기 위한 score참조변수 선언
		//score = new int[5]; => int타입의 값 5개를 저장할 수 있는 배열
		
		//아래와 같이 한번에 쓰기 가능
		// int[] score = new int[5];
		// 0~4로 5개의 영역에 저장됨
		// int타입은 요소들이 자동으로 0으로 초기화됨
		// 범위를 벗어나면 안됨. 주의
		
		//생성된 배열의 각 저장 공간을 배열의 요소라고함.
		//인덱스는 배열의 요소마다 붙여진 일종의 순차적인 번호라고 보면 된다.
		//인덱스를 이용하여 각 배열의 요소에 접근한다.
		
//		int[] score = new int[5];		
//				
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
//		System.out.println();
//		
//		score[0] =10;
//		score[1] =20;
//		score[2] =30;
//		score[3] =40;
//		score[4] =50;
//		
//		//가능
//		for (int i=0; i<5;i++)
//		{
//			System.out.printf("score[%d] : %d\n",i,score[i]);
//		}
//		
//		int k =1;
//		int temp = score[k+2]+score[4];
//		System.out.println(temp);
//		
//		for (int i = 0; i<score.length; i++) //score[]의 길이만큼 
//		{
//			System.out.printf("score[%d] : %d\n",i,score[i]);
//		}
//		
//		System.out.println();
//		
//		int number[] = new int[10];
//		
//		for (int i=0; i<number.length; i++)
//		{
//			number[i]=i+1;		
//		}
//		
//		for (int i=0; i<number.length; i++)
//		{			
//			System.out.println(number[i]);
//		}
//		
//		System.out.println();
//		
//		 // 이런 방법도 있다
//		int arr[] = new int[] {10,20,30,40,50};
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		//new 키워드를 빼도 됨		
//		int[] arr1 = {100,50,123,568};
//		for (int i = 0; i < arr1.length; i++)
//		{
//			System.out.println(arr1[i]);
//		}		
		
		//실습
		//4개의 과목이 있다
		//사용자 입력을 받는다.(점수입력)
		//점수를 입력한 데이터를 배열에 저장
		//배열의 저장된 점수의 합과 평균을 구해라
		
//		Scanner inputScan = new Scanner(System.in);
//		int value[] = new int[4];
//		int sum = 0;
//		
//		for (int i=0;i<value.length;i++)
//		{
//			System.out.printf("%d번째 점수를 입력하시오\n", i+1);
//			value[i] = inputScan.nextInt();
//			sum += value[i];			
//		}
//		System.out.printf("합계 : %d\n",sum);
//		System.out.printf("평균 : %.2f \n",sum*0.25);
//		
//		inputScan.close();		
		
		//배열의 복사
		//기본적으로 배열을 한번 생성하면 그 길이를 변경할 수 없음
		//더 많은 공간이 필요하면 큰 배열을 새로 만들어서 기존 배열로부터 복사해야함
		//for문을 이용해서 배열을 복사하는 방법
		
		int[] arr= new int[5];
		
		int[] temp=new int[arr.length*2];//길이가 5*2인 temp가 생성되고 temp의 각 요소는 0으로 초기화
		
		for (int i=0;i< arr.length ; i++)//for문을 이용해서 배열 arr의 모든 요소에 저장된 값을 하나씩 temp에 복사
		{
			temp[i]=arr[i];//arr[i]의 값을 temp[i]에 저장
		}
		
		arr=temp;//참조변수 arr이 새로운 배열을 가르키게 한다.
				//기존 arr[]가 사용하던 heap영역은 gc가 정리
		
//		int[] arr = new int[5];
//		
//		for (int i =0; i <arr.length; i++) {
//			
//			arr[i]=i+1;//arr[0]부터 순차적으로 값을 대입한다.
//		}
//		System.out.println("[변경전]");
//		System.out.println("arr의 길이 : "+arr.length);
//		
//		for (int i =0; i <arr.length; i++) {
//			
//			System.out.println("arr["+i+"] : "+arr[i]);
//			
//		}
//		
//		int[] temp=new int[arr.length*2];
//		
//		for (int i = 0;i < arr.length; i++)
//		{
//			temp[i]=arr[i];//arr을 temp에 저장
//		}
//		arr=temp;//arr의 주소값을 temp의 주소로 바꿔서 저장
//		
//		System.out.println("[변경후]");
//		System.out.println("arr의 길이 : "+arr.length);
//		
//		for (int i =0; i <arr.length; i++) {
//			
//			System.out.println("arr["+i+"] : "+arr[i]);
//			
//		}
		
		
		//과제
		//1. 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
		//ex) 78,10,5,100,98
		//결과(최대값) 100 , (최소값) ; 5
		
		//2. 숫자야구 게임
		
		
		
		
	}//end of main
}
