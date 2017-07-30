//JAVA program to reverse a number of any variable size

import java.util.Scanner;
import java.lang.Math;

class ReverseTheNumber
{
//start of a class
public static void main(String args[])
{
//start of a main function
int number,number_size=0,reverse_number=0,temp;
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
temp=number;

//loop to find size of number
while(temp != 0)
{
temp=temp/10;
number_size++;
}
number_size=number_size-1;

//loop to reverse number
while(number != 0)
{
temp=number%10;
number=number/10;
reverse_number=reverse_number+temp*(int)Math.pow(10,number_size);
number_size--;
}

System.out.println(reverse_number);
}
}