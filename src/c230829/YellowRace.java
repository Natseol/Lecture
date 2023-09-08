package c230829;

public non-sealed class YellowRace extends Person {
	int[] skinColor;

	YellowRace() {
		super();
		skinColor = new int[] {235, 235, 235}; //{251,206,177}
	}
	
	int[] getSkinColor() {
		return skinColor;
	}
}
