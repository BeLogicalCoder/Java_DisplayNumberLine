3. Write a program which accept number from user and print its numbers line.
Input : 4
Output : -4 -3 -2 -1 0 1 2 3 4 

import java.lang.*;
import java.util.*;

class Printn
{
	public void NumberLine(int No)
	{    
	    
		 if(No<0)
		 {
			 No=-No;
		 }
		for(int i=-No;i<=No;i++)
		{
			System.out.print("\t"+i);
		}
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj =new Scanner(System.in);
		
		System.out.println("Enter the Number\n");
		
		int value =sobj.nextInt();
		
		Printn pobj=new Printn();
		pobj.NumberLine(value);
	}
}