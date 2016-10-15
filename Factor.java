package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;

class Fact
{

    void cal ()
    {
        Utility u= new Utility();
        System.out.println("enter the number");
        int n=u.InputInt();
        while(n%2==0)
        {
            System.out.println("2");
            n=n/2;
        }

        for(int i=3;i<=Math.sqrt(n);i=i+2)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }

        }
        if(n>2)
        {
            System.out.println(n);
        }

    }
}

class Factor
{
    public static void main(String args[]) throws IOException
    {
        Fact f=new Fact();
        f.cal();  
    }
}
