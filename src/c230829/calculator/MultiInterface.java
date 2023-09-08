package c230829.calculator;

public interface MultiInterface {
	default int multi(int num1, int num2) {
		return num1*num2;
	}	
}
