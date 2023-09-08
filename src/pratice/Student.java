package pratice;

public class Student {
	
	String name;
	int id;
	int age;

	Student() {
		name = "이름없음";
		id = 0;
		age = 0;
	}
	
	Student(String name,int id,int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	Student(Student ex) {
		this(ex.name,ex.id,ex.age);
	}
	
	void Print() {
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+id);
		System.out.println("나이 : "+age);
	}
}
