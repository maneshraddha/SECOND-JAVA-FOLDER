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
            front = node;           //if front is null put node data in front and rear
            rear = node;
        }
       else
        {
            rear.setNext(node);     //otherwise set node as next of rear and  make it reare
            rear = node;
        }
    }
    public void remove()
    {
        front = rear;               //keep rear in front
        if(front == null)
            System.out.println("Empty queue");
    }
    public void widraw(int choice)
    {
        System.out.println("Enter the amount you want to widraw");
        double cash = u.InputDouble();
        if(cash<=balance)   
        {
            balance = balance - cash;           //widraw cash
            System.out.println("widrawal successful");
        }
        else 
            System.out.println("Not enough balance"); // if not enough bal then NOP
        number++;
        this.remove();      //at the end of process remove from queue
    }
    public void deposit(int choice)
    {
        System.out.println("Enter the amount you want to deposit");
        double cash = u.InputDouble();
        balance = balance + cash;           //deposit amount in account
        System.out.println("Deposited successfully");
        number++;
        this.remove();          //at the end of process remove from queue
    }
    public void getBalance(int choice)
    {
        System.out.println("Balance is" + balance);         // get balance amount
    }
    public void operations(int choice)
    {
        System.out.println("Number of operationa are: " + number);          //show number of operations
    }

}
