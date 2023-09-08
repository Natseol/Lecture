package pratice;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		/*
		int number = 6;
		
		if (number>=7) {
			System.out.println("A등급");
		}
		else if (number>=4) {
			System.out.println("B등급");
		}
		else {
			System.out.println("C등급");
		}
		
		System.out.println("");
				
		int value = 4;
		
		switch (value) {
			case 1:
				System.out.println("봄");
			break;
			case 2:
				System.out.println("여름");
			break;
			case 3:
				System.out.println("가을");
			break;
			case 4:
				System.out.println("겨울");
			break;
		}
		System.out.println();
		
		Scanner koreanScore = new Scanner(System.in);
		Scanner mathScore = new Scanner(System.in);
		
		
		System.out.println("국어점수");
		int korean = koreanScore.nextInt();
		System.out.println("수학점수");
		int math = mathScore.nextInt();
		
		int sum = korean + math;
		double average = sum / 2;
		String grade = "";
		
		if (average>=90) {
			grade = "A등급";				
		}
		else if (average>=80) {
			grade = "B등급";
		}
		
		else if (average>=70) {
			grade = "C등급";
		}
		else {
			grade = "D등급";
		}
		
		System.out.printf("합계 : %d, 평균 : %.1f, 등급 : %s",sum,average,grade);
		
		koreanScore.close();
		mathScore.close();
		
		*/
		
		int num = 61;
		System.out.printf("%c", num);
		System.out.println();
		
		String a = new String("가");
		String b = new String("가");
		
		System.out.println((a==b)?"true":"false"); 
		

		
	}
}
