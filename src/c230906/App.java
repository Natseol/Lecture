package c230906;

public class App {

	public static void main(String[] args) {
		Player player = new Player("아침에 사과",200,90);
		Monster monster = new Monster("김이름",100,50);
		
		boolean isGame = true;
		System.out.println("게임을 시작하지");
		while (isGame) {
			STATE playerSelect = player.selectAction();
			
			switch (playerSelect) {
			case ATTACK :
				System.out.println(player.attack());
				break;
			case USE_ITEM :
				player.useItem();
				break;
			case RUN :
				System.out.println("종료");
				System.exit(1);
			}
		}
	}
}
