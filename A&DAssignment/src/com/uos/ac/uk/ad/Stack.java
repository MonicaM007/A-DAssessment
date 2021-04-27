package com.uos.ac.uk.ad;

public class Stack { 
	/* Stack is a data structure of the public interface.
	 * In the Stack below you can this is based on (LIFO) Last In First Out.
	 * For example - if we have a stack of books, the book that has come in last will be removed first.
	 */
	
	private Node first = null;
	public void enqueue (Node node) {
		System.out.println("enqueuing :"+node);
		node.next = first;
		first = node;
	}
	
	public void dequeue() {
		System.out.println("Dequeuing :"+first);
		first = first.next;
	}
		
   public void print () {
	   Node node = first;
	   while(node != null) {
		   System.out.println("Node Value : "+"|"+node.data+"|");
		   node = node.next;
	  }
   } 
   
public static void main (String[] args) {
	Stack s = new Stack();

	System.out.println("Printing in LIFO way in Stack ");
	s.enqueue(new Node(1));
	s.enqueue(new Node(2));
	s.enqueue(new Node(4));
	s.enqueue(new Node(8));
	
	s.print();
	
	s.dequeue();
	s.dequeue();
	
	s.print();
	
	
	
}

}
    	
    	
    

    
    
