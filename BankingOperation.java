package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.QuequNode;
class BankingOperation
{
    Utility u = new Utility();
    double number, balance =10000;
    QuequNode front, rear;
    
    public void addNode(int data)
    {
        QuequNode node = new QuequNode();
        if(front == null)
        {
            front = node;
            rear = node;
        }
       else
        {
            rear.setNext(node);
            rear = node;
        }
    }
    public void remove()
    {
        front = rear;
        if(front == null)
            System.out.println("Empty queue");
    }
    public void widraw(int choice)
    {
        System.out.println("Enter the amount you want to widraw");
        double cash = u.InputDouble();
        if(cash<=balance)   
        {
            balance = balance - cash;
            System.out.println("widrawal successful");
        }
        else 
            System.out.println("Not enough balance");
        number++;
        this.remove();
    }
    public void deposit(int choice)
    {
        System.out.println("Enter the amount you want to deposit");
        double cash = u.InputDouble();
        balance = balance + cash;
        System.out.println("Deposited successfully");
        number++;
        this.remove();
    }
    public void getBalance(int choice)
    {
        System.out.println("Balance is" + balance);
    }
    public void operations(int choice)
    {
        System.out.println("Number of operationa are: " + number);
    }

}
