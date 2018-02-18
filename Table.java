//Aram Sargsyan ©

import java.util.Scanner;

public class Assign {
	public static void main(String[] args) {
		Scanner U = new Scanner(System.in);
		
		System.out.println("Enter total number of questions:  ");
		int quest = U.nextInt();
		int[][] grid = new int[10][quest];
		//Creating a 2-dim array with all entries equal to 0
		for(int i = 0;i < 10;i++) {
			for(int j = 0; j < quest;j++) {
				grid[i][j]=0;
			}
		}
		
		while(true) {
			System.out.print("Input Student,question number, grade (enter -1 to break): ");
			int ns = U.nextInt();
			if(ns == -1) break;
			int nq = U.nextInt();
			double g = U.nextDouble();
			if(((int)g)/10 == 10) grid[9][nq-1]+=1; //for the special case when grade is 100
			else grid[((int)g)/10][nq-1]+= 1;
		}
		
		System.out.print("\t");
		for(int k = 1; k <= quest; k++) {
			System.out.print("\t" + "Q" + k); // to print question numbers
		}
		System.out.print("\t Total" );
		System.out.println();
		System.out.print("0.0-9.9\t"); // is done for the esthetic view
		for(int i = 0;i < 10;i++) {
			if(i>=1) {
				if(i == 9) System.out.print("90.0-100.0"); // to include 100
				else System.out.print((double) 10*i + "-"+ (10*i + 9.9 ));
			}
			int rowSum = 0; 
			for(int j = 0; j < quest;j++) {
				System.out.print("\t" + grid[i][j]+ "   ");
				rowSum +=  grid[i][j];
			}
			System.out.print("\t  " + rowSum);
			System.out.println();
		}
	}
}
