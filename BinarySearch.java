package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
 public class BinarySearch
{
	public static void main(String[]args)
		{
			Utility u =new  Utility();
            System.out.println("enter the number");
            int n = u.InputInt();
            System.out.println("enter the number in array");
            int []arr = u.Array1DIn(n);
            System.out.println("enter the number you want");
            int a = u.InputInt();
            int ans= u.binarySearch(arr,a);
            if(ans==(-1))
            {
                System.out.println("number not find");
            } 
            else
            {
                System.out.println("Number is" + (ans));
            }              

		}
}
