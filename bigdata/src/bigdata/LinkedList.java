package bigdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Java Program to move last element to front in a given linked list */
class LinkedList
{
    Node head;  // head of list
  
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    void moveToFront()
    {
        /* If linked list is empty or it contains only
           one node then simply return. */
           if(head == null || head.next == null) 
              return;
 
        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;
 
        /* After this loop secLast contains address of 
           second last  node and last contains address of 
           last node in Linked List */
        while (last.next != null)  
        {
           secLast = last;
           last = last.next; 
        }
 
        /* Set the next of second last as null */
        secLast.next = null;
 
        /* Set the next of last as head */
        last.next = head;
 
        /* Change head to point to last node. */
        head = last;
    }                 
 
                     
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
    	
        Node new_node = new Node(new_data);
  
        /* 3. Make next of new Node as head */
        new_node.next = head;
  
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
 
     /* Drier program to test above functions */
    public static void main(String args[]) throws NumberFormatException, IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//TODO
    	LinkedList llist=new LinkedList();
    	int n = Integer.parseInt(br.readLine());
    	String[] strNums;
    	strNums = br.readLine().split(" ");
    	for(int i=n-1; i>=0 ; i--)
    	{
    		int d=Integer.parseInt(strNums[i]);
    		System.out.println(d);
    		llist.push(d);
    		llist.printList();
    	}
        System.out.println("Linked List before moving last to front ");
        llist.printList();
         
        llist.moveToFront();
         
        System.out.println("Linked List after moving last to front ");
        llist.printList();
    }
} 
