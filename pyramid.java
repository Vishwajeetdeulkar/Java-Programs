package patterns;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		int length;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		length=sc.nextInt();
		for(int i=length;i>=1;i--) {
		int count=1;
		for(int j=1;j<=i;j++) {
		System.out.print(count+" ");
		count++;
		}
		System.out.println();
		}
		for(int i=2;i<=length;i++) {
		int count=1;
		for(int j=1;j<=i;j++) {
		System.out.print(count+" ");
		count++;
		}
		System.out.println();
		}
	}

}
