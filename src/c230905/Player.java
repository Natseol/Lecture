package c230905;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Item> inventory;
	private int defense;
	private int attack;
	
	public Player(int defense, int attack) {
		inventory=new ArrayList<>();
		this.defense=defense;
		this.attack=attack;		
	}
	
	public void additem(Item item) {
		inventory.add(item);
	}
	public void listInventory() {
		System.out.println(" -인벤목록 -");
		for (Item item : inventory) {
			System.out.println(item.getName()+"(장착 여부:"+(item.isEquiped() ?"장착":"해제"+")"));
		}
	}
	public void equipItem(int index) {
		if(index>=0&&index<inventory.size()) {
			Item item=inventory.get(index);
			if(!item.isEquiped()) {
				item.equip();
				defense+=item.getDefense();
				attack+=item.getAttack();
				System.out.println("방어력+"+defense);
				System.out.println("공격력+"+attack);
			}
			else {
				System.out.println(item.getName()+" 이미 장착");
			}				
		}
		else {
			System.out.println("범위를 벗어남");
		}
	}
	
	public void unequipItem(int index) {
		if(index>=0&&index<inventory.size()) {
			Item item=inventory.get(index);
			if(item.isEquiped()) {
				item.unequip();
			}
			else {
				System.out.println(item.getName()+" 이미 없음");
			}
		}
		else {
			System.out.println("범위를 벗어남");
		}		
	}
}
