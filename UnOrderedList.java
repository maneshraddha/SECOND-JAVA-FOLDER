package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
import java.util.*;
import com.bridgelabz.util.Utility;

class OrderedList
    {
        public static void main(String args[])
            {
                Utility u = new Utility();
                LinkedList<String> ll  = new LinkedList<String>();
                System.out.println("Take input string");
                String s1 = u.InputString();
                String []split  = s1.split(" "); 
                int pos;
                for(int i=0 ; i<split.length ; i++)
                    {
                        ll.add(i, split[i]);
                    }
                System.out.println("list" + ll);
                System.out.println("Enter the word to search");
                String s2= u.InputString();
                for(int i=0;i<split.length;i++)
                    {
                        split[i].compareTo(s2);
                        if(s2.equals(split[i]))
                            {
                                ll.remove(i);
                            }
                        
                    }
               int n=ll.size();
                int k=split.length;
               System.out.println(n);
                 System.out.println(k);
              
                       if(n<k)
                            {
                                   System.out.println("list" + ll);
                            }
                        else
                            {
                                 ll.addLast(s2);
                            }
                   
                //System.out.println("list" + ll);

            }
    }
