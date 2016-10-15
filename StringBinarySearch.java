package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
public class StringBinarySearch
{
    public static void main(String [] args)
    {
        Utility u = new Utility();
        System.out.println("Enter the number strings");
        int n= u.InputInt();
        System.out.println("Enter the strings in array");
        String []str = u.Array1DString(n);
        System.out.println("Enter the string u want");
        String s1= u.InputString();
        String s2 = u.StringbinarySearch(str,s1);
        if(s2==" ")
            System.out.println("number not present");
        else
            System.out.println("number is:" + s2);
    
    }
}
