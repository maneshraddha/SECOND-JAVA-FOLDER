package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;

public class Pali
{
    public static void main(String args[]) throws IOException
    { 
        Utility u=new Utility();
        String s1=u.InputString();      //take string from user
        String temp=s1;                 //store it in temp
        StringBuffer sb=new StringBuffer(s1);   //create object of stringbuffer and store s1 in that
        sb.reverse();               //reverse sb
        s1=sb.toString();           //convert s1 again in string
    
        if(temp.equalsIgnoreCase(s1))
    
            System.out.println("Given string is palindrome");   //if tmp and s1 are equal then palindrome

        else 
            System.out.println("Not palindrome");   //else not palindrome
    }
