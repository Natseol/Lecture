package c230905;

import java.util.Scanner;

enum SELECT{
	INVENTORY,
	EQUIP_ITEM,
	UNEQUIP_ITEM,
	EXIT,
	INVALID
}

public class App {

	public static void main(String[] args) {
		
		Player player = new Player(80,40);
		Item item1=new Item("막대기",5,200);
		Item item2=new Item("돌",75,25);
		
		player.additem(item1);
		player.additem(item2);
		Scanner scanner = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("1.인벤토리");
			System.out.println("2.장착");
			System.out.println("3.해제");
			System.out.println("4.종료");
			System.out.println("메뉴 선택 : ");
		
			choice=scanner.nextInt();
			SELECT userSelect=select(choice);
			switch (userSelect) {
			case INVENTORY:
				player.listInventory();
				break;
			case EQUIP_ITEM:
				System.out.println("장착슬롯:");
				int idx = scanner.nextInt();
				player.equipItem(idx);
				break;
			case UNEQUIP_ITEM:
				System.out.println("해제슬롯:");
				int unidx = scanner.nextInt();
				player.unequipItem(unidx);
				break;
			case EXIT:
				System.exit(1);
				break;
			default :
				player.listInventory();
				break;
			}
		}
	}
	
	private static SELECT select(int select) {
		switch (select) {
		case 1:return SELECT.INVENTORY;
		case 2:return SELECT.EQUIP_ITEM;
		case 3:return SELECT.UNEQUIP_ITEM;
		case 4:return SELECT.EXIT;
		default :return SELECT.INVALID;		
		}
	}
	
	//과제
	//ArrayList활용 -> stack 구현
	//FILO, 비어있을때 예외처리
	//push, pop
	
	
	
	
}
