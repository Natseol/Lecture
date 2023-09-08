package c230828.numberPuzzle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 5 * 5
		int width=5;
		int[][] arr = new int[5][5];
		int playerY = 4;
		int playerX = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i*arr.length+j+1;
			}
		}
		arr[playerY][playerX]=0;

		for (int i = 0; i<1000; i++) {
			int temp = ((int)(Math.random()*4+1))*2;
			int[] playerPosition = Main.move(arr, playerY,playerX, temp);
			playerX=playerPosition[0];
			playerY=playerPosition[1];
		}//셔플

		System.out.println("시작");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]==0) {
					System.out.print("-p-\t");
				}
				else {
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println("\n");
		}

		while (true) {
			boolean isEnding = true;
			for (int i=0; i<width;i++) {
				if(isEnding == false) break;
				for (int j = 0; j < width; j++) {
					System.out.print("확인");
					if(i==4&&j==4) break;
					if(arr[i][j] != i*5+j+1) {
						isEnding = false;
					}
				}
			}
			if (isEnding) {
				System.out.println("끝");
				break;
			}
			
			System.out.println("(8:상 2:하 4:좌 6:우)");
			int input = scanner.nextInt();
			int[] playerPosition = Main.move(arr, playerY,playerX, input);
			playerX=playerPosition[0];
			playerY=playerPosition[1];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j]==0) {
						System.out.print("-p-\t");
					}
					else {
						System.out.print(arr[i][j]+"\t");
					}
				}
				System.out.println("\n");
			}
		}
	} //end of main


	static boolean shuffle(int[][] arr, int idx1, int idx2, int direction) {
		// direction => 8:상, 4:좌, 6:우, 2:하
		int temp = arr[idx1][idx2];
		switch (direction) {
		default :
			return false;			
		case 2 :
			if (idx1 == 4) return false;
			arr[idx1][idx2] = arr[idx1+1][idx2];
			arr[idx1+1][idx2] = temp;
			return true;
		case 4 :
			if (idx2 == 0) return false;
			arr[idx1][idx2] = arr[idx1][idx2-1];
			arr[idx1][idx2-1] = temp;
			return true;
		case 6 :
			if (idx2 == 4) return false;
			arr[idx1][idx2] = arr[idx1][idx2+1];
			arr[idx1][idx2+1] = temp;
			return true;
		case 8 :
			if (idx1 == 0) return false;
			arr[idx1][idx2] = arr[idx1-1][idx2];
			arr[idx1-1][idx2] = temp;
			return true;
		}		
	}
	static int[] move(int[][] arr, int playerY, int playerX, int temp) {
		boolean isShuffle = Main.shuffle(arr, playerY,playerX, temp);
		if (isShuffle==true) 
			switch (temp) {
			case 2:
				playerY++;
				break;
			case 4:
				playerX--;
				break;
			case 6:
				playerX++;
				break;
			case 8:
				playerY--;
				break;
			default:
				break;
			}
		return new int[] {playerX, playerY};
	}
}
