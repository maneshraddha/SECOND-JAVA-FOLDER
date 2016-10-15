package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;

public class Pali
{
    public static void main(String args[]) throws IOException
    { 
        Utility u=new Utility();
        String s1=u.InputString();
        String temp=s1;
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        s1=sb.toString();
    
        if(temp.equalsIgnoreCase(s1))
    
            System.out.println("Given string is palindrome");

        else 
            System.out.println("Not palindrome");
    }
