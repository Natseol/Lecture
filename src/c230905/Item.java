package c230905;

public class Item {

	private String name;
	private boolean equiped;
	
	private int defense;
	private int attack;
	
	public Item(String name, int defense, int attack) {
		this.name=name;
		equiped=false;
		this.defense=defense;
		this.attack=attack;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isEquiped() {
		return equiped;
	}
	
	public void equip() {
		equiped=true;
		System.out.println(name+" 장착!!");
	}
	public void unequip() {
		equiped=false;
		System.out.println(name+" 해제!!");
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getAttack() {
		return attack;
	}
	
}
