package patterns;

import java.util.Scanner;

public class ReverseAscendingPyramid {

	public static void main(String[] args) {
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		length=sc.nextInt();
		

		for(int i=length;i>0;i--)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
		System.out.println();

		}


}
}
