package com.bridgelabz.codes;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.HashNode;
import java.io.File;
class HashingFunction
{
    Utility u = new Utility();
    File file = new File("list.txt");
    HashNode tmp, tmp2, head, entry;
    int key , value ,tablesize;
    HashNode []table;

    public HashingFunction(int size)
    {
        tablesize = size;
        table = new HashNode[tablesize];
        for(int i = 0; i<tablesize; i++)
        {
            table[i] = null;
        }
    }
    public void addValue(int value)
    {
        key = value % tablesize;
        if(table[key] == null)
        {
            table[key] = new HashNode();
            table[key].setData(key);
            head = table[key];   
        }
        head = table[key];
        tmp = head;
        entry = new HashNode();
        entry.setData(value);
       while(tmp.getNext() != null)
       {
            tmp = tmp.getNext();
       } 
        tmp.setNext(entry);

    }       //end if addvalue
    public void search(int value)
    {
        key = value % tablesize;
        if(table[key] == null)
        {
            System.out.println("value not found");
            addValue(value);
            updateFile();
        }
        else
        {
            head = table[key];
            tmp= head.getNext();
            entry = new HashNode();
            entry.setData(value);
            int count = 0;
            while(tmp != null)
            {
                if(entry.getData() == tmp.getData())
                {
                    System.out.println("value and removed");
                    count++;
                    remove(value);
                    updateFile();
                }
                else
                {
                    tmp = tmp.getNext();
                }
            }
            if(count == 0)
            {
                System.out.println("value not found");
                addValue(value);
                updateFile();
            }

        }
    }       //end of search
    public void remove(int value)
    {
        key = value % tablesize;
        head = table[key];
        tmp = head;
        tmp2 = tmp.getNext();
        while(tmp2!= null)
        {
           if(value == tmp2.getData())
           {
                tmp.setNext(tmp2.getNext());
                break;
           } 
            else
            {
                tmp = tmp2;
                tmp2 = tmp2.getNext(); 
            }
        }
    }       //end of remove
    public void showTable()
    {
        for(int i = 0; i<tablesize; i++)
        {
            tmp = table[i];
            int total = 0;
            if(tmp == null)
            {
                System.out.println("empty");

            }
            else
            {
                tmp = tmp.getNext();
                while (tmp != null)
                {
                    total++;
                    System.out.println(tmp.getData() + "");
                    tmp = tmp.getNext();
                }
            }
        }
    }       //end of showTable
    
    public void updateFile()
    {
        u.clearFile(file);
        String str;
        for(int i=0;i<tablesize;i++)
        {
            entry = table[i];
            tmp = table[i];
            if(tmp == null)
                str = "";
            else
            {
                tmp = tmp.getNext();
                while(tmp != null) 
                {
                    str = Integer.toString(tmp.getData());
                    u.writeFile(file,str);
                    tmp = tmp.getNext();
                }
           }
        }
                System.out.println("File is Updated");
    }        	
}
