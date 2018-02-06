package patterns;

import java.util.Scanner;

public class PascalTriangle1 {

	public static void main(String[] args) {
		Integer n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		n=sc.nextInt();
        Integer[][] array=new Integer[n][n];
        for (int i = 0; i < n; i++) {
	    for (int k = 0; k < n-i; k++) {
		System.out.print(" ");
	    }
	    for (int j = 0; j <= i; j++) {
		if (i == j || j == 0)
	           array[i][j] = 1;
	      else 
	           array[i][j] = array[i-1][j-1] + array[i-1][j];
		System.out.print(array[i][j]+" ");
	}
	System.out.println();
}
	}

}
