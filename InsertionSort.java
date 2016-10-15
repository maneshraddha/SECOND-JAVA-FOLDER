package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;
class InsertionSort
{
    public static void main(String []args)
    {   
        Utility u=new Utility();
        System.out.println("Enter number of elements in array");
        int n=u.InputInt();
        System.out.println("Enter elements in array");
        int [] arr= u.Array1DIn(n);

        for(int i=1;i<n;i++)
        { 

            int key=arr[i]; 
            int j=i-1;
            while(j>=0 && arr[j]> key)
            { 
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        u.Print1DArrayIn(arr);
    }
}

