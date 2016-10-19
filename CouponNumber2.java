package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
class CouponNumber2
{
    public static void main(String args[])
    {
        Utility u = new Utility ();
        System.out.println("enter number of n distinct numbers");
        int n = u.InputInt();
        System.out.println("enter the range from 0");
        int k = u.InputInt();
        int [] arr = new int[k];
        System.out.println("enter the numbers");
        for(int i=0;i<=k;i++)
        { 
                //take ay random number
            for(int z=0;z<n;z++)
            {  
                if(i>n-1)
                    break;
                int a= u.InputInt();
                arr[i] = a; 
                for(int j=0;j<n;j++)
                {
                    if(arr[j+1]==arr[j])
                    {
                        arr[j+1]=0;
                        System.out.println("number can not be added enter another");
                        arr[j+1]= u.InputInt();
                        if(arr[j+1]>k)
                        {
                            System.out.println("number can not be added enter another");
                            arr[j+1]= u.InputInt();
                        }                     
                    }
                }
            }
        }
        System.out.println("--------------------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
