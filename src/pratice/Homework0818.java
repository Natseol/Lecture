package pratice;

import java.util.Scanner;

public class Homework0818 {

	public static void main(String[] args) {
		
		//1.Rectangle Class 만들기
		//사각형은 가로와 세로 길이를 가지고 있음
		//면적과 둘레를 계산하는 메서드가 포함
		//결과 출력
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("밑변 : ");
//		Rectangle.width=Integer.parseInt(input.nextLine());
//		System.out.print("높이 : ");
//		Rectangle.height=Integer.parseInt(input.nextLine());
//		
//		Rectangle.AreaPrint(Rectangle.Area());
//		Rectangle.PremeterPrint(Rectangle.Premeter());
//		
//		input.close();
		
		//2.Calculator 클래스 만들기
		//사칙연산 메서드 포함. 이거를 활용한 프로그램 만들기
		//사칙연산 메서드는 오버로딩 구현		
		
		//3.Student 클래스 만들기
		//이름, 학번, 나이 등등
		//생성자를 이용하여 객체를 초기화 활 때 필요한 정보를 전달할 수 있도록 한다.
		
		Student No01 = new Student();
		No01.Print();
		Student No02 = new Student("김이름",2,15);
		No02.Print();
		Student No03 = new Student(No02);
		No03.Print();
	}
}
