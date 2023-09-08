package c230831;

public class EqualsTest {

	String name;
	int num;
	EqualsTest(int num,String name) {
		this.num=num;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof EqualsTest)) return false;//instanceof 타입을 확인하는 연산자
		if (!((EqualsTest)obj).name.equals(name)) return false;//내용이 같은지 확인
		if (((EqualsTest)obj).num !=num) return false;
				
		return true;		
	}
	
	@Override
	public int hashCode() {
		return num+name.hashCode();
	}
	
	@Override
	public String toString() {
		return "이름"+name+"숫자"+num;
	}
	
}
