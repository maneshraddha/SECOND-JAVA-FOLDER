package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.Node2;
public class Stack
{
    Node top, tmp;
    int count=0;
    public void push(String c)
    {
        tmp = new Node();
        tmp.data = c;
        if(top == null)    
        {
            top = tmp;       //if notihng is there place variable in top
            tmp.next = null; //keep next of tmp as null
        }
        else
        {
            tmp.next = top; //otherwise place top in nect node
            top = tmp;      //and put tmp in top
        }
        count++;
    }

    public void pop()
    {
        Node top1 = top;
        //top1 = new Node();
        //top1 = top;
        if(top1 == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top1 = top1.next;
            top = top1;
        }
        count--;
        
    }
    public void count()
    {
        if(count == 0)
        {
            System.out.println("expression is balanced");

        }
        else
        {
            System.out.println("expression is not balanced");
        }
    }
}
