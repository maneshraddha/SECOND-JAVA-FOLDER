package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
import java.util.Random; 
class CouponNumber
{
    public static void main(String args[])
    {
        Utility u = new Utility();
        System.out.println("enter the number of N distinct coupan number");
        int n = u.InputInt();   //take numbers user want
        Random r = new Random();        //object of predefined Random class
        int random=0;
        for (int i=0; i<=n;i++)
        {
            random= r.nextInt(100); //take random number from 0 to 100
            System.out.println("random number is :" + random);
        }
    }
}
