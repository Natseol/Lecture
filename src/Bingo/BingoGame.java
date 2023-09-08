package Bingo;

import java.util.Scanner;

class Input {
	static int InputNumber() {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String input = inputScan.nextLine();
		int num = Integer.parseInt(input);
		return num;		
	}
	
}


class Board {

	int width;
	int bingo[][];
	int special;
	
	void Create() {
		
		bingo = new int[width][width];
		
		for (int i=0;i<bingo.length;i++)
		{
			for (int j=0;j<bingo[i].length;j++)
			{
				bingo [i][j] = (width*i+j)+1;
			}
		}
	}//width*width 배열에 1부터 차례대로 숫자 넣기
	
	int[][] BasicShuffle (int[][] bingo) {	
		
		for (int i=0;i<width;i++)
		{
			for (int j=0;j<width;j++)
			{
				int r1 = (int)(Math.random()*width);
				int r2 = (int)(Math.random()*width);
				
				int temp = bingo[i][j];
				bingo[i][j] = bingo[r1][r2];
				bingo[r1][r2] = temp;				
			}
		}
		return bingo;
	}//빙고 섞기
	
	void Print() {		
		
		int line=0;
		for (int i=0;i<width;i++)
		{
			for (int j=0;j<width;j++)
			{
				if (bingo[i][j]==0) {
				System.out.print((char)special+"\t");
				}
				else {
				System.out.print(bingo[i][j]+"\t");				
				}
				line++;
			}
			if (line%width==0)
			{
				System.out.print("\n\n");
			}
		}		
	}//"width"칸마다 줄을 바꾸는 배열 출력
	
	void Change(int num) {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				if (bingo[i][j] == num) {
					bingo[i][j] = 0;
				}
				
			}
			
		}
	}
	
	
}

class Calculation {
	int bingocount;
	
	void rowCount (int bingo[][]) {
		int count[]=new int[bingo.length];
		
		for (int i=0; i<count.length; i++)
		{
			count[i]=0;
		}
		
		for (int i=0; i<bingo.length; i++)
		{
			for (int j=0; j<bingo.length; j++)
			{				
				count[i]+=bingo[i][j];
			}
		}
		
		for (int i=0;i<count.length;i++) {
			if (count[i]==0)
			{
				bingocount++;
			}
		}		
	}
	
	void columnCount (int bingo[][]) {
		int count[]=new int[bingo.length];
		
		for (int i=0; i<count.length; i++)
		{
			count[i]=0;
		}
		
		for (int i=0; i<bingo.length; i++)
		{
			for (int j=0; j<bingo.length; j++)
			{				
				count[j]+=bingo[i][j];
			}
		}
		
		for (int i=0;i<count.length;i++) {
			if (count[i]==0)
			{
				bingocount++;
			}
		}		
	}
	
	void diagonalLeft (int bingo[][]) {
		int count=0;
		for (int i=0; i<bingo.length; i++)
		{
			for (int j=0; j<bingo.length; j++)
			{				
				if (i==j)
				{
				count+=bingo[i][j];
				}
			}
		}
		if (count==0) {
			bingocount++;
		}
	}
	
	void diagonalRight (int bingo[][]) {
		int count=0;
		for (int i=0; i<bingo.length; i++)
		{
			for (int j=0; j<bingo.length; j++)
			{				
				if ((i+j)==(bingo.length-1))
				{
				count+=bingo[i][j];
				}
			}
		}
		if (count==0) {
			bingocount++;
		}
	}
	
	
}



public class BingoGame {
	
	public static void main(String[] args) {
		
		Board board = new Board();
		Calculation count = new Calculation();
		
		System.out.print("몇 칸 빙고로 만들지 ");
		int width = Input.InputNumber();		
		board.width = width;//빙고 넓이	
		
		board.Create();//빙고판에 1부터 숫자 차례대로 넣기			
		board.bingo=board.BasicShuffle(board.bingo);//셔플하고 반환
		
		System.out.println();
		board.Print();
		
		board.special = 35;//특수문자 아스키코드 입력
				
		while (count.bingocount<3)
		{
		int inputNum = Input.InputNumber();//숫자입력 받기
		board.Change(inputNum);//입력받은 숫자 변환
		board.Print();
				
		count.bingocount=0;//초기화
		count.rowCount(board.bingo);//가로확인 후 count객체의 bingocount의 변수 변경
		count.columnCount(board.bingo);//세로확인 후 count객체의 bingocount의 변수 변경
		count.diagonalLeft(board.bingo);//대각선확인 후 count객체의 bingocount의 변수 변경
		count.diagonalRight(board.bingo);//대각선확인 후 count객체의 bingocount의 변수 변경
		System.out.printf("빙고카운트 : %d\n\n",count.bingocount);		
		}
		
	}//end of main

}
