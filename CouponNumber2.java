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
        System.out.println("enter in array");
        int [] arr = u.Array1DIn(n);
        
        for(int i=0; i<n-1; i++)
        {
            int t = arr[i];
            for(int j=0; j<n-1;j++)
            {
                if(arr[j]>k)
                {
                    System.out.println(arr[j] + "can not add number enter another");
                    arr[j]=u.InputInt();
                }
                else if(t == arr[j])
                {
                    break;
                }
                else if(arr[j]==t)
                {
                    System.out.println(arr[j] + "and" + arr[j+1] + "are equal so cant add, enter another");
                    arr[j]=u.InputInt();
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
