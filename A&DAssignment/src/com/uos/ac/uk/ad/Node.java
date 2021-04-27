package com.uos.ac.uk.ad;


public class Node {

		//int value;
		int data;
		//int size;
	//	int nums;
		Node next;
		Node first;
		//Node head;
		//Node tail;
		//Node last;
		//Node move;
		Node prev;
		//Node right;
		//Node left;
		//Node Middle;
		
	//constructor method
		Node(int value) {
			this.data = value;
			
		}
		

		@Override
		public String toString() {
			return "Node [value=" + data + ", next=" + next + "]";
		}
	
		public int getData () {
			return this.data;
		}
		
		public void setData (int data) {
			this.data = data;
			
		}
		
		public Node getNext() {
			
			return this.next;
			
		}
		
		public void setNext (Node next) {
			
			this.next = next;
		}


		public Node next() {
			// TODO Auto-generated method stub
			return null;
		}
	    
		}
		


