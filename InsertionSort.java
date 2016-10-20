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
        int n=u.InputInt();     //enter elements in array
        System.out.println("Enter elements in array");
        int [] arr= u.Array1DIn(n); //scan array

        for(int i=1;i<n;i++)
        { 

            int key=arr[i];     //store 2nd number in key
            int j=i-1;          
            while(j>=0 && arr[j]> key)     // continue till becomes 0 and jth element is greater thaan key
            { 
                arr[j+1]=arr[j];            //place j th element in j+1
                j=j-1;                      //decreament j
            }
            arr[j+1]=key;                   //place key in j+1;
        }
        u.Print1DArrayIn(arr);
    }
}

