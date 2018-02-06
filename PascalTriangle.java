package patterns;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		 Integer rows, c = 1;
		 System.out.print("Enter number of rows: ");
		 Scanner sc=new Scanner(System.in);
		 rows=sc.nextInt();
		 for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if(k==0 || k==i)
				{
					c=1;
				}
				else
				{
					c = c*(i-k+1)/k;
				}
				System.out.print(c+" ");
			}
			System.out.println();
		}
		 

	}

}
