package ReferenceType;

import java.util.Scanner;

public class ReferenceClass03 {
	
	public static void main(String[] args) {
		
		//String
		//String 참조변수 = "";
		//String 참조변수 = new String("");
		
//		String str = new String("안녕?");
//		String str1 ="안~녕?";
//		
//		System.out.println(str);
//		System.out.println(str1);
		
//		String str1 = new String("안녕?");
//		
//		String str2 = str1;
//		
//		str1 = "안녕하세요";//문자열의 내용을 변경하면, 기존내용을 변경하는게 아니라 새로운 객체를 만듬
//		
//		System.out.println(str1);
//		System.out.println(str2);
		
//		String str1 = new String("안녕");
//		String str2 = "안녕";
//		String str3 = "안녕";
//		String str4 = new String("안녕");
//		
//		System.out.println(str1==str2);
//		System.out.println(str2==str3);
//		System.out.println(str3==str4);
//		System.out.println(str1==str4);
//		
//		System.out.println();
		
		//new로 생성하면 무조건 새롭게 객체를 생성
		//문자열 리터럴로 생성하면 heap 메모리에 리터럴로 생성된 동일한 문자열을 포함하는 객체는, 그 객체를 공유한다
				
		//String 메서드들
		//1.length : 문자열의 길이. int
		//2.charAt(,숫자) : 문자열에서 특정 index에 위치해있는 문자를 확인할떄. char
//		String text = "Hello, World";
//		int idx=7;
//		char character = text.charAt(idx);
//		System.out.println("character의 idx의 "+idx+" : "+character);
//		
//		//문자열 역순으로 출력하기
//		String word="java";
//		String reverseString="";
//		
//		for (int i = word.length()-1 ; i>=0; i--) // 문자열의 인덱스범위는 (0 ~ 길이-1)
//		{
//			reverseString+=word.charAt(i);
//		}	
//			System.out.println(reverseString);
			
		//3.subString
		//주어진 시작 인덱스부터 문자열의 끝까지 부분 문자열을 반환
//		String text ="Hello, World";
//		int idx = 7;
//		
//		String subText =text.substring(idx);
//		
//		System.out.println(subText);
//		
//		String number="941023-1234567";
//		
//		String birth = number.substring(0,6);	//(startIndex, endIndex:-1만큼)
//												//(0, 6) => 0~5까지 
//		System.out.println(birth);
		
			
			
			
		//4.indexOf( ) : 문자열에서 특정 문자나 특정 문자열을 앞에서 부터 찾아서 위치값을 표시. int
		//문자열에서 특정 문자나 문자열이 처음으로 등장하는 인덱스를 반환
		//찾지 못하면 -1을 리턴한다.
		
//		String text = "Hello, World";
//		
//		char target='W';
//		
//		int index = text.indexOf(target);
//		
//		if(index != -1)
//		{
//			System.out.println("찾았다!!!"+index);			
//		}
//		else
//		{
//			System.out.println("없음!!!");
//		}
		
		//문자열을 찾을 때
//		String text = "Java programming";
//		
//		String target = "programming";
//		int index = text.indexOf(target);
//		
//		if(index != -1)
//		{
//			System.out.println("찾았다!!!"+index);			
//		}
//		else
//		{
//			System.out.println("없음!!!");
//		}
		
		//5.isEmpty: 문자열이 비어있는지, 길이가 0인지
		//비어있으면 true, 아니면 false
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("문자열을 입력하세요");
//		String input = scanner.nextLine();
//		
//		if(input.isEmpty()) {
//			System.out.println("비어있음!!!");
//		}
//		else {
//			System.out.println(input);
//		}
		
//		String[] strArr = {"Hello","","Java","","World",""};
//		
//		int count=0;
//		for (String string : strArr)
//		{
//			if(string.isEmpty()) {
//				count++;
//			}			
//		}
//		System.out.println(count);
		
		//6.split
		//문자열을 특정 구분자를 기준으로 분리한 다음 문자열 "배열"로 반환
		
//		String text = "Hello, World! Java Programming";
//		String[] words=text.split(" ");//공백을 구분자로 사용하여 분리
//		
//		for (String word : words )
//		{
//			System.out.println(word);
//		}
//		
//		String data ="apple,banana;mango|test";
//		String[]items=data.split("[,;|]");
//		
//		for (String item : items)
//		{
//			System.out.println(item);
//		}
		
		//입력받은 문장의 단어가 몇개냐?
		//구분은 공백으로 함
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("입력하세요");
//		String text = input.nextLine();
//		
//		String[] words = text.split(" ");
//		
//		System.out.println(words.length); // 답1
//		
//		int count=0;
//		for (String word : words)
//		{
//			count++;
//		}
//		System.out.println(count); // 답2
//		
//		input.close();
		
		//7.trim
		//문자열의 앞뒤 공백을 제거한다.
		
//		String textString=" Hello, World ";
//		String trimText=textString.trim();
//		
//		System.out.println(textString);
//		System.out.println(trimText);
		
		//toCharArray
		//문자열을 문자배열로 변환
		
		String text = "Hello, World";
		char[] charArray = text.toCharArray();
		
		for (char i : charArray)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//문자열 내에서 대소문자 변환하기
		
		String originalText = "Hello. World";
		
		char[] charArr = originalText.toCharArray();
		
		for (int i = 0; i < charArr.length; i++)		
		{
			if(Character.isUpperCase(charArr[i])) // 대문자인지 확인
			{
				charArr[i] = Character.toLowerCase(charArr[i]);	//소문자로 변환
			}			
		
			else if(Character.isLowerCase(charArr[i]))
			{
				charArr[i] = Character.toUpperCase(charArr[i]);	//소문자로 변환
			}
		}
		
		//문자배열을 문자열로
		String trans = new String(charArr);
		
		System.out.println(originalText);
		System.out.println(trans);
		
		
		
		
		
	}//end of main

}
