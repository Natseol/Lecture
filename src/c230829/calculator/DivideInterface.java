package c230829.calculator;

public interface DivideInterface {
	public default int divide(int num1, int num2) {
		return num1/num2;
	}	
}
