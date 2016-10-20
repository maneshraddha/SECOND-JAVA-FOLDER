package com.bridgelabz.codes;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.HashingFunction;
import java.io.*;
class HashingTable
{
    public static void main(String args[])
    {
        Utility u = new Utility();
        System.out.println("enter table size");
        int size = u.InputInt();
        HashingFunction hf = new HashingFunction(size);
        File file = new File("list.txt");
        String str = u.readFile(file);
        String []words = str.split(" ");
        boolean check = true;
        for(int i = 0; i<words.length; i++)
        {
            hf.addValue(Integer.parseInt(words[i]));
        }
        while(check)
        {
            System.out.println("Enter the choice you want 1. for add value 2. for search value 3. for show table 4. for exit");
            int choice = u.InputInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("add value");
                    int value = u.InputInt();
                    hf.addValue(value);
                    break;
                }
                case 2:
                {
                    System.out.println("search value");
                    int search = u.InputInt();
                    hf.search(search);
                    break;
                    
                }
                case 3:
                {
                    System.out.println("search value");
                    hf.showTable();
                    break;
                    
                }
                default:
                {
                    System.out.println("wrong choice");
                    check = false;
                    break;
                }
                
            }
        }
    }
}
