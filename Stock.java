package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
import com.bridgelabz.util.Utility;
class StockReport
{
    Utility u = new Utility();
    public void getStockReport(int a,String str[], int shares, int total[] ,int fulltotal)
    {
         for(int i=0; i<a; i++)
        {   
            //take  all necessary data
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
            fulltotal = total[i]+fulltotal;         //calculate total of all
        }   
         System.out.println("total of all stock is:" + fulltotal);
         System.out.println("stock names are:");
         u.Print1DStringArrayIn(str);
         System.out.println("total of each is:");
         u.Print1DArrayIn(total);
    }
}
class Stock
{
   public static void main(String []args)
    {
        Utility u = new Utility();
        StockReport st = new StockReport();
        System.out.println("enter the number of stocks u want");
        int a = u.InputInt();       //number of stocks
        int shares = 0, fulltotal=0;
        int []total = new int[a];       //array for total
        String []str = new String[a];       //String array for names
        st.getStockReport(a, str, shares, total, fulltotal);
       
    }
}
