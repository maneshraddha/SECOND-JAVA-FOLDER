package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.Stack;
public class BalanceParanthesis
{
    public static void main(String args[])
    {
        Stack stack = new Stack();
        Utility u  = new Utility();
        System.out.println("enter the equation");
        String expression = u.InputString();    //take expression from user
        
        for(int i= 0; i < expression.length(); i++) 
        {
            char c = expression.charAt(i);      //take each char from exp
            String str = Character.toString(c); //convert into string
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(str);                //push all opening brackets
            }
            else if(c==')' || c=='}' || c==']')
            {
                stack.pop();        //pop all closing brackets
            }
        }
        stack.count();

    }
}
