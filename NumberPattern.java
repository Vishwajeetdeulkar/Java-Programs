package patterns;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		length=sc.nextInt();
		
		for(int i=1;i<=length;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			System.out.println();
			}
			for(int i=length-1;i>=1;i--) {
				
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			System.out.println();
			}	
	}

}
