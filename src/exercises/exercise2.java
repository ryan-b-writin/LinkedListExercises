package exercises;

import linkedlist.Node;

public class exercise2 {
	//exercise 2- return the Kth to last element of a singly linked list
	
	

	public static void main(String[] args) {
		Node first = new Node(1);
		first.appendToTail(2);
		first.appendToTail(3);
		first.appendToTail(4);
		first.appendToTail(5);
		first.appendToTail(6);
		first.appendToTail(7);
		first.appendToTail(8);
		first.appendToTail(9);
		first.appendToTail(0);
		
		first.print();

	}

}