package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;
class Triplets
	{ 
		public static void main(String args[])
			{  
 				 int sum=0, count=0;
  				Utility u=new Utility();
  				System.out.println("enter number of integers");
  				int n=u.InputInt();
  				int [] arr=new int[n];
  				for(int i=0;i<n;i++)
   					{
   						 arr[i]=u.InputInt();
  				 	}
  				for(int i=0;i<n;i++)
  					{
						 if ((i+2)>=n)
  							break;
   					 	sum=arr[i]+arr[i+1]+arr[i+2];
                       
     					if(sum==0)
    					 {
       						count++;
     					}
  					}
          		System.out.println("Number of triplets are: " + count);
			}
	}
