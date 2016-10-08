package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;
public class Array2D
	{
		public static void main(String args[]) throws IOException
			{
				Utility u =new Utility();
				System.out.print("enter number of row and column");
				int n=u.InputInt();
				int k=u.InputInt();
				int [][]arr1= u.input2DArray(n,k);
				u.Print2DArray(arr1);
			}
	}
