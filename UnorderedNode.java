package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.Node;
class UnorderedNode
{
    Node head=null, tail,tmp, tmp2, node;
    int count=0;
    public void addNode(String d) //add nodes to list
        {
           
            node = new  Node(); 
            node.setData(d);
            if(head == null)
            {
                //if entering 1st eliment then head and tails are same 
                head=node;
                tail=node;
             
            }
            else
            {
                //for next data set new ceated node as next of set
                tail.setNext(node);
                tail=node;
            
            }
            
        }
    public void remove(String d)
    {
      
        tmp=head;  //store head in tmperary variable tmp and do operations with tmp
        tmp2=tmp.getNext();   // set tmp2 as next of tmp
        node = new Node();
        node.setData(d);   //take data from new node "node"
        if(d.equals(tmp.getData()))
        {
            head=head.getNext();   //if new data taken from newly created node then set next of head as head
        }
        else
        {
            while(tmp2 !=null)
            {
                if(d.equals(tmp2.getData()))  // if new data equals second or next data 
                {
                    tmp.setNext(tmp2.getNext()); //then set next of tmp as next of set
                    break;
                }
                else
                {
                    tmp=tmp2;               //else move tmp2 in tmp and comtinue same process
                    tmp2=tmp2.getNext();
                }
            }
        }
    }

    public void search(String d)
    {
        
        tmp = head;   //store head in tmperary variable tmp and do operations with tmp
        while(tmp!=null)  // continue until tmp becomes null
        {
            if(d.equals(tmp.getData())) //if taken data equals elements in node
            {   
                count++;   //increase count variable
                System.out.println("word found ");
                this.remove(d); //call remove function
                 System.out.println("And removing word from list");
                //this.printList(); // call print function
            }
            else
            {
                tmp=tmp.getNext();  //otherwise set tmp ka next as tmp
            }
        }
        if(count == 0)
        {
            System.out.println("word not availabale");  //id count is 0, then addnode and print it
            this.addNode(d);
             System.out.println("adding word in list");
            //this.printList(); 
              
        }
      
    }
    
    public void printList()
    {
        tmp = head;  //store head in tmperary variable tmp and do operations with tmp
       
        if(tmp == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            while(tmp != null)  // continue until tmp becomes null
            {            
                String str= tmp.getData();
                System.out.println(str);
                tmp = tmp.getNext();  //set tmp ka next as tmp
               
            }
        }
    }

    public String[] printList(String []str)
    {
        int i=0;
        int n= str.length;
        tmp = head;  //store head in tmperary variable tmp and do operations with tmp
        if(tmp == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            while(tmp != null && i<n)  // continue until tmp becomes null
            {            
                str[i]= tmp.getData();
                System.out.println(str[i]);
                tmp = tmp.getNext();  //set tmp ka next as tmp
                i++;
            }
        }
        return str;
    }


    public int size()
    {
        tmp = head;
        while(tmp != null)
        {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }  
}

  

