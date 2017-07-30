//JAVA program to find sum of Digits of any size of number

import java.util.Scanner;

class SumOfDigits
{
public static void main(String args[])
{
int number,sum=0;
Scanner sc=new Scanner(System.in);
number=sc.nextInt();

//Loop to find size of the number
while(number != 0)
{
sum=sum+number%10;
number=number/10;
}

System.out.println(sum);
}
}