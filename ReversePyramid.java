package patterns;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
       
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		length=sc.nextInt();
		for(int i=1;i<=length;i++)
		{
		for(int j=length;j>=i;j--)
		{
		System.out.print(j);
		}
		System.out.println();

		}
	}

}
