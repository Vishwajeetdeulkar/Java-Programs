//Program to find harmonic sum 

import java.util.*;

class Harmonic{
public static void main(String args[]){
float n,sum=0.0f;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
n=s.nextFloat();
while(n>0)
{
sum=sum+1/n;
n--;
}
System.out.println(sum);
}
}