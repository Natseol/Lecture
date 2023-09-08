package c230829.calculator;

public interface CalcInterface extends AddInterface, SubtractInterface, MultiInterface, DivideInterface {
	public default int add(int ...nums) {
		int temp=0;
		for (int num : nums) {
			temp=AddInterface.super.add(temp, num);
		}
		return temp;
	}
	
	public default int subtract(int ...nums) {
		int temp=nums[0];
		for (int i = 1; i < nums.length; i++) {
			temp=SubtractInterface.super.subtract(temp, nums[i]);
		}
		return temp;
	}
	
	public default int multi(int ...nums) {
		int temp=nums[0];
		for (int i = 1; i < nums.length; i++) {
			temp=MultiInterface.super.multi(temp, nums[i]);
		}
		return temp;
	}
	
	public default int divide(int ...nums) {
		int temp=nums[0];
		for (int i = 1; i < nums.length; i++) {
			temp=DivideInterface.super.divide(temp, nums[i]);
		}
		return temp;
	}
}
