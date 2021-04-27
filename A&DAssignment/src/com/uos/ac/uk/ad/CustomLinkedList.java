package com.uos.ac.uk.ad;

public class CustomLinkedList {
 static  /*public class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}*/
	
	Node first = null; //AKA head
 int count=0;
 int index=5;
    //Node head;
	Node last;
//public Object addFirst;
public void addFirst(Node node) { //add first to list//
		node.next = first;
		first = node;
		count ++;
	}
	 
	public void addLast(Node node) { //add last to list//
		if (first == null)
			first = node;
		else {
			Node pointer = first;
			while(pointer.next !=null)
				pointer = pointer.next;
			pointer.next = node;}	
		count ++;
		}
	
	public void remove() {
		first = first.next;
		count --;
		}

	public void removeFirst() {
		first = first.next;
		count --;}
	
	public void removeLast() {
		first = first.next;
		count --;}

	public void moveUp(int index ) { //move up list//
		if(index >count)
			return; //this catches the error is index is bigger than nodes count
		
		if (index == 1)
			return; // cant move head
		//Node -> node -> node ->
			
		Node ParentOfNodeToMoveUp = FindNOdeAtIndex(index-1);
		Node NodeToMoveUp = FindNOdeAtIndex(index);
		
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
	}

		//node.prev = node;
		//prev = node;
	
	public void print() {
		Node pointer = first;
		while(pointer !=null) {
			System.out.print(pointer.data+" ->");
			
			pointer = pointer.next;

		}
		System.out.print("\n");
	}

	public int size() {
		int size=0;
		Node pointer = first;
		while(pointer.next !=null) {
			pointer = pointer.next;
			size++;
		}
		return size;
	}   
	
     
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
	
	
	
	
	
