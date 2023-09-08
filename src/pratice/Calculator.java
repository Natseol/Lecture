package pratice;

import java.util.Scanner;

public class Calculator {
	
	static double plus(double num1, double num2) {
		return num1+num2;		
	}	
	static double plus(int num1, double num2) {
		return num1+num2;		
	}	
	static double plus(double num1, int num2) {
		return num1+num2;		
	}	
	static double plus(int num1, int num2) {
		return num1+num2;		
	}
	
	static double minus(double num1, double num2) {
		return num1-num2;		
	}
	static double minus(int num1, int num2) {
		return num1-num2;		
	}
	static double minus(int num1, double num2) {
		return num1-num2;		
	}
	static double minus(double num1, int num2) {
		return num1-num2;		
	}
	
	static double multiplication(double num1, double num2) {
		return num1*num2;		
	}
	static double multiplication(int num1, int num2) {
		return num1*num2;		
	}
	static double multiplication(int num1, double num2) {
		return num1*num2;		
	}
	static double multiplication(double num1, int num2) {
		return num1*num2;		
	}
	
	static double division(double num1, double num2) {
		return num1/num2;		
	}
	static double division(int num1, int num2) {
		return num1/num2;		
	}
	static double division(int num1, double num2) {
		return num1/num2;		
	}
	static double division(double num1, int num2) {
		return num1/num2;		
	}

	public static void main(String[] args) {
		
		Scanner inputScan = new Scanner(System.in);
		String input = inputScan.nextLine();
		char[] inputArr = input.toCharArray();
		int signIndex=0;
		double result=0;
		
		for (int i=0;i<inputArr.length;i++)
		{
			if (inputArr[i]==42||inputArr[i]==43||inputArr[i]==45||inputArr[i]==47)
			{
				signIndex=i;
			}
		}		

		String strNum1 = input.substring(0,signIndex);
		double num1 = Double.parseDouble(strNum1);
		String strNum2 = input.substring(signIndex+1,inputArr.length);
		double num2 = Double.parseDouble(strNum2);

		for (int i=0;i<inputArr.length;i++)
		{
			if (inputArr[i]==42)// * => 42
			{
				signIndex=i;
				result = multiplication(num1,num2);
			}
			else if (inputArr[i]==43)// + => 43
			{
				signIndex=i;
				result = plus(num1,num2);
			}
			else if (inputArr[i]==45)// - => 45
			{
				signIndex=i;
				result = minus(num1,num2);
			}
			else if (inputArr[i]==47)// / => 47
			{
				signIndex=i;
				result = division(num1,num2);
			}
		}				
		
		System.out.print(num1+" ");
		System.out.print((char)input.charAt(signIndex));
		System.out.print(" "+num2);
		System.out.print(" = "+result);
				
		
//		String sum = "";
//		for (int i:num)
//		{
//			sum += (char)i;
//		}
//		
//		
//		System.out.println(sum);
//		double change = Double.parseDouble(sum);
//		
//		System.out.println(change);
		
		
		
//		Scanner input = new Scanner(System.in);
//		double num1= input.nextDouble();
//		input.nextLine();
//		String a = input.nextLine();
//		double num2= input.nextDouble();
//		
//		double result = num1 + num2;
//		System.out.printf("%.0f",result);
		
		
	}
}
