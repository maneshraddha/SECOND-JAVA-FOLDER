package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.UnorderedNode;

public class Linked
{
     public static void main(String []args)
    {
        //create objects for Utility and UnorderedNode
        String tmp;
        Utility u = new Utility();
        UnorderedNode o = new UnorderedNode();
        System.out.println("Take String");
        String str = u.InputString(); //scan the string
        String []words = str.split(" "); // split string if " " in between and put it in array
        u.Print1DStringArrayIn(words); //call printstring function from utility
         for(int i=0;i<words.length;i++)  // create list
        {
            o.addNode(words[i]);
        }
        System.out.println("Enter the string u want");
        String str2 = u.InputString();
        o.search(str2); // scan and search string
        int n = o.size();
        String []str3=new String[n];
        String []str4 = o.printList(str3);
        int a = str4.length;
        System.out.println(a);
        //for oredered list
        for(int i = 0; i<a-1 ; i++)
        {
            for(int j = 0; j<a-1 ; j++)
            {
               if(str4[j].compareTo(str4[j+1]) > 0) 
                {
                    tmp = str4[j];
                    str4[j] = str4[j+1];
                    str4[j+1] = tmp;
                    
                }
            }
        }
          System.out.println("arranging them in order");
        //print orderedlist
        for(int i = 0 ; i<a ; i++)
        {
            System.out.println(str4[i]);
        }
    }
       
}
