//package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
class Cal
{
    int[] ConvertAscii()
    {
        Utility u = new Utility(); 
        System.out.println("Enter the String");
        String s1=u.InputString();
        int n=s1.length();
        int []arr = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]=(int)s1.charAt(i);
    
        }
        int t=0;
        for(int i=0;i<n-1;i++)
        { 
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                { 
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        return arr;
    }
    char []Sort(int []arr)
    {
        int n=arr.length;
        char []arr1 = new char[n];

        for(int i=0;i<n;i++)
        {
            //System.out.print(arr[i]);
            arr1[i]=(char)arr[i];
        }
        return arr1;		
    }
    void PrintString(char[] arr1)
    {
        int n=arr1.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]);
        }
    }

}

class BubbleSortString
{
    public static void main(String[] args)
    { 

        Utility u = new Utility(); 
        Cal c= new Cal(); 
        int[]array= c.ConvertAscii();
        char []array1=c.Sort(array);
        c.PrintString(array1);
    }

}

