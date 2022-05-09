package bigdata;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Linked{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d) 
		{
			this.data = d; 
			this.next = null; 
		}
	}
	public void moveLastElementToHead()
	{
		if(head == null || head.next == null) 
           return;
		Node seclast=null;
		Node current=head;
		while(current.next!=null)//TODO
		{
			seclast=current;
			current=current.next;
		}
		seclast.next=null;
		current.next=head;
		head=current;
	}
	public void push(int data)
   	 {
	//TODO
		Node current = new Node(data);
		current.next = head;
        head = current;
     }
	public void printList()
   	{
        		//TODO  
		Node current=head;
	    while(current != null)
	    	{
	    	System.out.print(current.data+" ");
	    	current=current.next;
	    	}
	    System.out.println();
   	}

}

public class Source2 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//TODO
    	Linked l=new Linked();
    	int n = Integer.parseInt (br.readLine());
    	String[] strNums;
    	strNums = br.readLine().split("\\s");
    	
    	
    	for (int i=0; i<n ; i++)
    	{
    		int d=Integer.parseInt(strNums[i]);
    		System.out.println(d);
    		l.push(d);
    		l.printList();
    	}
    	l.printList();
    	l.moveLastElementToHead();
    	l.printList();
    }
}