package com.bridgelabz.codes;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.BinarySearchNode;
import java.lang.*;

class BinarySearchTree
{
    public static BinarySearchNode root;
    BinarySearchTree()
    {
        this.root = null;
    }
    public boolean find(int id)
    {
        BinarySearchNode current = new BinarySearchNode(id);
        current = root;         //keep the root value in current 
        while(current != null)
        {
            if(id ==current.data)       //if data found then reurn true
                return true;
            else if(id < current.data)
            {
                current = current.left;     //else go through all left nodes
            }
            else
                current = current.right;    //else go through all left nodes
        }
        return false;
    }
	public void insert(int id){
		BinarySearchNode newNode = new BinarySearchNode(id);        //=create new node at set given id
		if(root==null){
			root = newNode;             //if root is null keep new data in root
			return;
		}
		BinarySearchNode current = root;            //backup for root
		BinarySearchNode parent = null;            
		while(true){
			parent = current;                        //backup for current
			if(id < current.data) 
            {				
				current = current.left;             //travese through left child
				if(current==null)
                {
					parent.left = newNode;         //when current becomes null make is parent and place newly added data
					return;
				}
			}
            else    
            {
				current = current.right;
				if(current==null)
                {
					parent.right = newNode;
					return;
				}
			}
		}
	}
    public void display(BinarySearchNode root)
    {
        if(root != null)
        {
            display(root.left);
            System.out.println(root.data);
            display(root.right);
            //System.out.println(root.data);
        }
    }


    public static void main(String args[]) throws Exception
    {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(8); 
        b.insert(6);
        b.insert(1);
        b.insert(9);
        b.insert(12);
        b.display(b.root);
        System.out.println("check whether given number exist " + b.find(6));
    }
    
}
