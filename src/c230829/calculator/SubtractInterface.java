package c230829.calculator;

public interface SubtractInterface {
	default int subtract(int num1, int num2) {
		return num1-num2;
	}
}
