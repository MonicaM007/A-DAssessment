package com.uos.ac.uk.ad;

public class DoubleLinkedList {
	/*A Double Linked List is a data structure that is made of a chain of nodes. 
	 * Each node contains a value and a pointer to the next node in the chain, so the point to each other as well as the next node
	 * The head pointer points to the first node, and the last element of the list points to null (null means 0 - no value)
	 */
	
	
	 Node first; //aka head
	 
	 static  /*public class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}*/
	 
	 class Node {
	        Node next; //added next node 
	        Node prev; // added prev node
	        int index; 
	        int data; //to receive correct data from nodes
	        
	        
	        public Node(int i) {
	            index = i;
	        }
	    }
	 

public void addFirst(int i) {    //new node to see first in list
    Node newNode = new Node(i);
    newNode.next = first;
    newNode.prev = null;
    if(first != null) {
        first.prev = newNode;
    }
    
    first = newNode;
}
public void MoveUp(Node next_node, int d) {//moving in between list
    if(next_node == null) {
        return;
    }
    
    Node newNode = new Node(d);
    newNode.prev = newNode.prev;
    newNode.prev = newNode;
    newNode.next = newNode;
    
    if(newNode.prev != null) {
        newNode.prev.next = newNode;
    }
}

public void MoveDown(Node prev_node, int i) {//moving in between list
    if(prev_node == null) {
        return;
    }
    
    Node new_node = new Node(i);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
    new_node.prev = prev_node;
    
    if(new_node.next != null) {
        new_node.next.prev = new_node;
    }
}

/*Node ParentOfNodeToMoveUp = FindNOdeAtIndex(TempData-5);
Node NodeToMoveUp = FindNOdeAtIndex(TempData);

int TempData = ParentOfNodeToMoveUp.data;
ParentOfNodeToMoveUp.data= NodeToMoveUp.data;
NodeToMoveUp.data = TempData;
}


private Node FindNOdeAtIndex(int index)
{
int currentIndex=1;
Node CurrentNodeToCheck = first; 
while(currentIndex != index)
{
	CurrentNodeToCheck = CurrentNodeToCheck.next;
	currentIndex ++;
}
return CurrentNodeToCheck;
}

public void moveDown(int index) { //move down list//
if(index >=count)
	return;

//if(index == )
	//return;

Node ChildOfNodeToMoveDown = FindNOdeAtIndex(index+1);
Node NodeToMoveDown = FindNOdeAtIndex(index);

int TempData = ChildOfNodeToMoveDown.data;
ChildOfNodeToMoveDown.data= NodeToMoveDown.data;
NodeToMoveDown.data = TempData;
}*/

public void addLast(int i) { //new node to see last in list
    Node new_node = new Node(i);
    new_node.next = null;
    
    if(first == null) {
        new_node.prev = null;
        first = new_node;
        return;
    }
    
    Node currLast = first;
    while(currLast.next != null) {
    	currLast = currLast.next;
    }
    
    currLast.next = new_node;
    new_node.prev = currLast;
}
    
public void print(Node node) {
    Node currLast = null;
    
    System.out.println("Current List"); //printing order of list with <-> to show that it can become a double linked list 
    while(node != null) {
        System.out.print(node.index + " <-> ");
        currLast = node;
        node = node.next;
    }
    System.out.println();
    
    
    //System.out.println("Move Down");
    //while(currLast != null) {
      //  System.out.print(" <-> " + currLast.index);
       // currLast = currLast.prev;
    }

public static void main(String[] args) {
    DoubleLinkedList list = new DoubleLinkedList();
    
    for(int i = 5; i >= 1; i--) {
        list.addFirst(i);
        list.addLast(5);
    }
        System.out.println("Move Up");
        list.MoveUp(list.first.next, 2);
        list.print(list.first);
        System.out.println("MoveDown");
        list.MoveDown(list.first, 3);
        list.print(list.first);
        
        list.print(list.first);
    }
    

	//import com.uos.ac.uk.ad.LinkedList//

		
		
			
			//l.remove();
			//l.removeFirst();
			//l.removeLast();
		
			

			/*System.out.println("-------------");
			System.out.println("Move Up test");


			list.print();*/
			
			
			
			//l.move();
			/*list.moveUp(2);
			list.print();
				
			System.out.println("Move Down test");

			list.moveDown(1);
			list.print();*/
			//System.out.println("-------------");
			//System.out.println("Move Down test");
			
			//l.move();
			//l.moveDown(4);
			//l.print();
			//System.out.println("Moving list Up and Down");
			
			//l.print();
			
			//l.remove();

    
    
    //System.out.println("Move Down");
    //while(currLast != null) {
      //  System.out.print(" <-> " + currLast.index);
       // currLast = currLast.prev;
   

/*public int get() {
Node pointer = first;
while(pointer !=null) {
	System.out.println(pointer.value);
}
int data = pointer.value;
return data;
}*/

public void moveDown(Object object) {
// TODO Auto-generated method stub

}

public void moveUp(Object object) {
// TODO Auto-generated method stub

}

public void prev() {
// TODO Auto-generated method stub

}

public void next() {
// TODO Auto-generated method stub

}

}





