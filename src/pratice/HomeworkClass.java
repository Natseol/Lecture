package pratice;

import java.util.Scanner;

class Student1 {
	
	//학생이라는 클래스를 만들어서
	//이름, 나이, 학번, 키, 전화번호가 있고
	//학생정보를 출력하는 메서드를 만들어서 출력해라.
	
	String name;
	int age;
	int studentNumber;
	int height;
	String phoneNumber;	
		
	void Input(String name, int inputAge, int inputStudentNumber, int inputHeight, String inpuPhoneNumber) {
		this.name = name;
		age = inputAge;
		studentNumber = inputStudentNumber;
		height = inputHeight;
		phoneNumber = inpuPhoneNumber;
	}
	
	void InfoPrint() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("학번 : "+studentNumber);
		System.out.println("키 : "+height);
		System.out.println("전화번호 : "+phoneNumber);
	}
	
}

//class StudentAuto {
//	
//	String name;
//	char[] nameArr;
//	int len;
//	
//	void nameIn() { 
//		name = name.trim();
//		len = name.length();
//		nameArr= name.toCharArray();
//
//	}
//	
//	
//	
//	
//}

public class HomeworkClass {
	
	
	
	public static void main(String[] args) {

		Student1 classA02 = new Student1();
		
		classA02.name = "김이름" ;
		classA02.age = 13 ;
		classA02.studentNumber = 2 ;
		classA02.height= 160;
		classA02.phoneNumber = "01012345678";
		
		classA02.InfoPrint();
		
		
		Student1 classA01 = new Student1();
		
		classA01.Input("김일번", 17, 1, 172, "01022223333");
		
		classA01.InfoPrint();
		
//		String name = "가나다";
//		char[] nameArray = name.toCharArray();
//		
//		StudentAuto sAuto = new StudentAuto();		
//		Scanner inputName = new Scanner(System.in);
//		sAuto.name = inputName.nextLine();
//		sAuto.nameIn();
//		
//		for (int i = 0; i < sAuto.len; i++) {
//			
//		
//		System.out.print(sAuto.nameArr[i]+" ");
//		}		
//		
//		inputName.close();
		
		
		
	}//end of main

}
