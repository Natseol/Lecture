package Object;

class Dataa {
	int x;
}

public class CallClass {

	public static void main(String[] args) {
		
		Dataa d = new Dataa();
		d.x =10;
		System.out.println("메인에서의 x : "+d.x);
		Change(d.x);//d.x를 복사해서 가져왔다, Call by Value : 메서드안에서는 변경되었지만, 원본데이터는 변경이 안됨
		System.out.println("다시 메인에서의 x : "+d.x);
		
		System.out.println();
		
		int num=0;
		Change(d);//매개변수를 참조변수로 선언해서, 주소가 복사되어 원본이 변경
		System.out.println("또 다시 메인에서의 x : "+d.x);
		
		Dataa c = new Dataa();
		
		c.x = 10;
		
		Dataa c2 = copy(c);
		//1. 메서드를 호출하면서 참조변수의 주소가 복사
		//2. 새로운 객체를 생성한 다음에 인스턴스 변수의 값을 복사
		//3. copy메서드 종료->리턴한 temp의 주소값이 참조변수 c2에 저장됨(temp)는 사라짐
		//4. 새로운 객체 c2를 사용할 수 있음
		
		System.out.println("c의 값 : "+c.x);
		System.out.println("c2의 값 : "+c2.x);
		
		
	}//end of main
	
	static void Change(int x) {
		x=100;
		System.out.println("Change메서드의 x : "+x);
	}
	
	static void Change(Dataa d) {
		d.x=100;
		System.out.println("Change메서드의 x : "+d.x);
	}

	static Dataa copy(Dataa d) {
		Dataa temp=new Dataa();
		temp.x=d.x;
		
		return temp;//참조형 리턴
	}
	
}
