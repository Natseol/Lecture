package numberPuzzle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		Player player = new Player();
		
		puzzle.setPlayer(player);
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("칸 : n*n");
		int count = scanner.nextInt();		
		
		puzzle.setPuzzle(count, count);		
		puzzle.print();
		
				

		while(true) {
			boolean check = scanner.hasNextInt();
			String input = scanner.nextLine();
			char tmp=0;
			for(int i =0; i<input.length();i++) {
				tmp=input.charAt(0);
			System.out.println(tmp);
				if (check) {
					puzzle.movePlayer(Integer.parseInt(input));
					if (tmp==0)break;
					if (tmp==5) puzzle.shuffle();
				}
				else {
					puzzle.movePlayer(input);
				}
			}			
			puzzle.print();
		}
//		System.out.println("끝");
	}	
}
