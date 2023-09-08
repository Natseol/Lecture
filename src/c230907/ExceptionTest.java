package c230907;

public class ExceptionTest {

	public static void test() throws Exception {

		try {//가장 기본적인 예외처리 방법, 어떤 언어든지 있고, 다 똑같음
			int[] arr = new int[] {1};
			System.out.println(arr[1]);
		} catch (Exception e) {//ArrayIndexOutOfBoundsException e
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("무조건 실행");
		
		new ExceptionTest().printLength(null);
	}
	
	public void printLength(String str) {
		int result = str.length();
		System.out.println("길이:"+result);
	}
}
