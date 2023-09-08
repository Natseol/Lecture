package Object;

import java.util.Arrays;

public class OverloadingExam {

	//오버로딩
	//1. 메서드 이름이 같아야됨
	//2. 매개변수 갯수 또는 타입이 달라야 한다("매개변수가 다르면" 서로 구별될 수 있기 때문에)
	
	
	//매개변수의 이름만 다를뿐 매개변수의 타입이 같기 때문에 오버로딩이 아니다
//	int add(int a, int b) {
//		return a+b;
//	}	
//	int add(int c, int d) {
//		return c+d;
//	}
	
	//매개변수는 동일하나 순서가 달라서, 호출될 때 매개변수 값에 의해 메서드가 구분된다
//	long add(int a, long b) {
//		return a+b;
//	}	
//	long add(long a, int b) {
//		return a+b;
//	}
	
	int sum(int a, int b) {
		return a+b;
	}
	long sum(long a, long b) {
		return a+b;
	}	
	int sum(int[] arr) {
		int res=0;
		
		for (int i=0; i <arr.length ; i++)
		{
			res+=arr[i];
		}
		return res;
	}
	
	static void PrintArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	static int calculateSum(int[] arr) {
		int sum=0;
		for (int num : arr)
		{
			sum+=num;
		}
		return sum;
	}
	
	//배열의 요소의 최대값 구하기
	static int findMaxValue(int[] arr) {
		int max=arr[0];
		
		for (int num : arr) {
			if (num>max) {
				max = num;
			}
		}
		return max;
	}
	
	//배열의 평균 구하기
	static double Average(double[] arr) {
		double sum = 0;
		for (double value : arr) {
			sum+=value;
		}
		return sum/arr.length;
	}
	
	//짝수가 몇개냐?
	static int EventNumber(int[] arr) {
		int count = 0;
		for (int num : arr)
		{
			if(num%2==0) {
				count++;
			}
		}
		return count;
	}
	
	//특정값이 있는 인덱스를 찾기
	static double findIndexOfvalue(double[] arr, double target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	
		
	
	public static void main(String[] args) {
	
		PrintArray(new int[] {1,2,3,4});
		
		int[] arr = {1,3,4,5,6};
		PrintArray(arr);//매개변수로 전달해서 출력
		
		int sum=calculateSum(arr);
		System.out.println(sum);
		
		
	}//end of main

		
		
	
	
}
