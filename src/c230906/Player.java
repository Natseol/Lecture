package c230906;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

enum STATE {
	ATTACK,
	USE_ITEM,
	RUN
}
public class Player extends Unit{

	private Scanner scanner = new Scanner(System.in);
	private LinkedList<Item> inventory= new LinkedList<>();
	private String[] itemNames= {
			"막대기",
			"양파",
			"에어컨실외기",
			"모니터",
			"슬리퍼"
			};
	private int attackPowerModifier=0;		
	
	
	public Player(String name, int health, int attackPower) {
		super(name, health, attackPower);	
		randomItems();
	}
		
	private void randomItems() {
		Random random=new Random();
		
		int numItem=random.nextInt(3)+1;
		
		for (int i = 0; i < numItem ; i++) {
			String itemName=itemNames[i];
			int itemPower=random.nextInt(10)+1;
			
			Item item= new Item(itemName, itemPower);
			inventory.add(item);
		}
	}
	public STATE selectAction() {
		
		System.out.println("1.공격");
		System.out.println("2.아이템 사용");
		System.out.println("3.도망");
		System.out.println("고르시오 : ");
		
		int select = scanner.nextInt();
		switch (select) {
		case 1 :
			return STATE.ATTACK;
		case 2 :
			return STATE.USE_ITEM;
		case 3 :
			return STATE.RUN;
		default :
			return null;			
		}		
	}
	
	public void addItem(Item item) {
		inventory.add(item);
		System.out.println(getName()+"가 "+item.getName()+"를 얻었다");
	}
	
	public void useItem() {
		System.out.println("사용할 아이템을 선택!");
		int index=1;
		for (Item item:inventory) {
			System.out.println(index+". "+item.getName());
			index++;
		}
		int choice=scanner.nextInt();
		if(choice>0&&choice<=inventory.size()) {
			Item selected = inventory.get(choice-1);
			System.out.println(getName()+"가 "+selected.getName()+"를 사용함 공격력:"+selected.getPower()+"증가!!");
			increaseAttackPower(selected.getPower());
			inventory.remove(selected);
		}
		else {
			System.out.println("잘못 고르셨습니다");
		}
	
	}
	
	public void increaseAttackPower(int power) {
		attackPowerModifier+=power;
	}
	
	@Override
	public int attack() {
		return super.attack()+attackPowerModifier;
	}
}
