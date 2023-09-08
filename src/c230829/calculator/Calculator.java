package c230829.calculator;

public class Calculator implements CalcInterface{
	public int calculate(char operator, int ...nums) {
		switch(operator) {
		case '+':
			return CalcInterface.super.add(nums);
		case '-':
			return CalcInterface.super.subtract(nums);
		case '*':
			return CalcInterface.super.multi(nums);
		case '/':
			return CalcInterface.super.divide(nums);
		default:
			return 0;
		}
	}
	
	public int calculate(String formula) {
		return 0;
	}
}
