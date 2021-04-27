package com.uos.ac.uk.ad;



public class Queue {
	
	/* A queue is a data structure or a collection in Java that stores elements in a FIFO (First In, First Out) order. 
	 * For example if you have a queue of people in a bank the first person in the queue will be the first out.
	 * The queue collection has two ends i.e. front & back. 
	 * The elements are added at the rear and removed from the front
	 * 
	 */

	private int numElements;

    private Node first;
    private Node last;


    public Queue() {
        numElements = 0;
        first = last = null;
    }


    public void enqueue(Node node) {


            if ( numElements == 0 ) {
                first = last = node;
            } else {
                last.next = node;
                last = node;
            }

            numElements += 1;
       
    }


    public Object dequeue() {


    	System.out.println("Dequeuing :"+first);
            Object item = null;

            if ( numElements > 0 ) {

                first = first.next;

                numElements -= 1;

                if (numElements == 0) {
                    last = null;
                }
            } 

            return item;
        
    }
    
    public void print () {
 	   Node node = first;
 	   while(node != null) {
 		   System.out.println("Node Value : "+"|"+node.data+"|");
 		   node = node.next;
 	  }
    } 
	   public static void main (String[] args) {
			Queue q = new Queue();
		
			
			System.out.println("Printing in FIFO way in Queue ");
			q.enqueue(new Node(1));
	    	q.enqueue(new Node(2));
	    	q.enqueue(new Node(4));
	    	q.enqueue(new Node(8));
	    
	    	q.print();
	    	
	    	q.dequeue();
	    	q.dequeue();
	    	
	    	q.print();
	    	
	    	
	    	
	    	
		}

}
    
    




