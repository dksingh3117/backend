package com.sample.work;

public class Node {
	protected int data;
    protected Node next;
    
    public Node(int d)
    {
        next = null;
        data = d;
    }
    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }
    
    /*  Function to set next to next Node  */
    public void setNext(Node n)
    {
        next = n;
    }  
    
    /*  Function to get next to next node  */
    public Node getNext()
    {
        return next;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }

}
