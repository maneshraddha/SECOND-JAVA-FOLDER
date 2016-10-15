package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
class Cal
	{
		int [] ConvertAscii()
			{
				Utility u = new Utility(); 
 	            System.out.println("Enter the String");
                 String s1=u.InputString();
                 int n=s1.length();
                 int []arr = new int[n];
				 for(int i=0; i<n;i++)
						{
							arr[i]=(int)s1.charAt(i);
							u.GetData();
						}
				return arr;
			}
		void Sort( int []arr)
			{
				char []arr1 = new char[n];

       for(int i=0;i<n;i++)
					{
						System.out.println(arr1[i]);
					}	
			}
		void PrintString()
			{
				for(int i=0;i<n;i++)
					{
						System.out.println(arr1[i]);
					}
			}
	}

class StringBubbleSort
{
 public void main(String[] args)
{ 
  
  Utility u = new Utility(); 
  Cal c = new Cal(); 
 int[] array= c.ConvertAscii();
  c.Sort(array);
  //c.PrintString();
}
 
}
