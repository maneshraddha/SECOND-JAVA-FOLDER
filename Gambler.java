package com.bridgelabz.codes;
import java.io.*;
import java.lang.*;
import com.bridgelabz.util.Utility;
class Gambler
{
    public static void main(String args[])
    {
        Utility u = new Utility();
        int stacke, goal, n, bet=0, win=0;
        System.out.println("Enter the Stack");
        stacke = u.InputInt();      //take stake
        System.out.println("Enter the goal");
        goal = u.InputInt();        //take goal
        System.out.println("Enter number of times");
        n = u.InputInt();   //take number of times
        int cash = stacke;
        for(int i=0; i<n; i++)
        {
            while(cash>0 && cash<goal)          //continue till cash becomes zero or goal
            {                   
                bet++;                            //bet incerese
                if(Math.random()<0.5)             //if ant random number less than 0.5 then cash++
                    cash++;
                else
                    cash--;                     //else cash --
            }
            if(cash == goal)
            {
                win++;                          //when goal is equal to cash then win
            }

        }
        float percentage = (win/n)*100;
        float avg = (bet/n)*100;
        System.out.println("percentage is " + percentage);
        System.out.println("avg is " +avg );
    }
}
