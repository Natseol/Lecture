package c230901;

public class StrBuilderTest {

	public static void strBuilderTest() {
		String str1= "abc";
		str1 = str1 + "defg";

		StringBuilder sb = new StringBuilder();//String의 메모리관리를 위해
		str1.replace("b","z");//메모리를 많이 먹게된다
		
		String str2 = sb.append("글자를 추가함").toString();//append():글자를 추가
		System.out.println(str2);
		
		System.out.println(sb.delete(4, 6).toString());//delete(a,b):a에서 b까지 삭제
		System.out.println(sb.replace(4, 4, "수정").toString());//replace(a,b,""):a에서 b까지 ""로 바꿈
		System.out.println(sb.replace(4, 6, "치환").toString());
		System.out.println(sb.append("글자를 추가함").toString());
		
	}

}
