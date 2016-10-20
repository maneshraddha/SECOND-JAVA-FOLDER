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
        int n=u.InputInt();     //take number
        while(n%2==0)
        {
            System.out.println("2");        //if divisible by 2 then print 2
            n=n/2;
        }
        //take initial value of iy as 3 anf increase i with 2 becouse each will be odd number
        for(int i=3;i<=Math.sqrt(n);i=i+2)
        {
            while(n%i==0)
            {
                System.out.println(i);      //if n is divisible by i then print i
                n=n/i;
            }

        }
        if(n>2)     //finally remaining number print
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
        f.cal();       // call cal method
    }
}
