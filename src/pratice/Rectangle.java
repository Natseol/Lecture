package pratice;

public class Rectangle {

	static int width;
	static int height;
	
	static int Area() {
		int area=width*height;
		return area;		
	}
	
	static int Premeter() {
		int premeter=width*2+height*2;
		return premeter;
	}
	
	static void AreaPrint(int area) {
		System.out.println("넓이 : "+area);
	}
	
	static void PremeterPrint(int premeter) {
		System.out.println("둘레 : "+ premeter);
	}
	
}
