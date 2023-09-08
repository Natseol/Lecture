package c230907;

public class Main {

//		Exception e;
	// error => 문제 발생시 해당 문제를 다른 방식으로 처리한다
	// 예외처리
	// 인덱스 버퍼 없을 때, 로그인할 때 아이디, 비번, 틀릴때
	// if else같은 경우
	// Exception : 컴파일, 런타임을 진행하면서 에러가 발생할 확률이 있다
	// Throwable > Exception >
	// ClassNotFoundExciption, InterruptedExceiption, RuntimeExciption
	// ArrayIndexOutOfBoundsExciption, NullPointerException
	
	public static void main(String[] args) {

		try {
			ExceptionTest.test();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			throw new Exception("에외처리중");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.setStackTrace(null);
		}
		
	}
}
