package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
 class Leap
	{
		public static void main(String [] args) throws IOException
			{
				BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
				System.out.println("Enter the year");
				int n=Integer.parseInt(br.readLine());
				if(n>999 && n<=9999)
					{
						if(n%4==0)
							{
								System.out.println(n + " is Leap Year");
							}
						else 
							System.out.println(n + " is not Leap Year");
					}
						else 
							System.out.println("Invalid number");
			}
	}