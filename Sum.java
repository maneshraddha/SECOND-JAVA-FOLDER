package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;
class Sum
{ 
    public static void main(String args[])
    {  
        int sum=0, count=0;
        Utility u=new Utility();
        System.out.println("enter number of integers");
        int n=u.InputInt();     //scan the numbers in array
        int [] arr=new int[n];      //initialize array
        for(int i=0;i<n;i++)
        {
            arr[i]=u.InputInt();        //scan array elements
        }
        for(int i=0;i<n;i++)
        {
            if ((i+2)>=n)
                break;
            sum=arr[i]+arr[i+1]+arr[i+2];

            if(sum==0)
            {
                count++;        //when sum of 3 digits becomes 0 increase the count
            }
        }
        System.out.println("Number of triplets are: " + count);
    }
}
