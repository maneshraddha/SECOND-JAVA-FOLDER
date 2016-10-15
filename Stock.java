package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
import com.bridgelabz.util.Utility;
class StockReport
{
    public void getStockReport(0
    {
        
    }
}
class Stock
{
   public static void main(String []args)
    {
        Utility u = new Utility();
        System.out.println("enter the number of stocks u want");
        int a = u.InputInt();
        int shares = 0, fulltotal=0;
        int []total = new int[a];
        String []str = new String[a];
        for(int i=0; i<a; i++)
        {
            System.out.println("Enter stock name");
            str[i] = u.InputString();
            System.out.println("Enter number of shares");
            shares = u.InputInt();
            System.out.println("Enter the share price");
            int price = u.InputInt();
            total[i] = shares * price;
           
        }
        for(int i=0; i<a; i++)
        {
            fulltotal = total[i]+fulltotal;
        }   
         System.out.println("total of all stock is:" + fulltotal);
         System.out.println("stock names are:");
         u.Print1DStringArrayIn(str);
         System.out.println("total of each is:");
         u.Print1DArrayIn(total);
    }
}
