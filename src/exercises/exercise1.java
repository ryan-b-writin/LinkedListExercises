package exercises;
import java.util.ArrayList;

import linkedlist.Node;

public class exercise1 {
	//exercise 1- write code to remove duplicates from an unsorted linked list.
	
	

	public static void main(String[] args) {
		Node first = new Node(1);
		first.appendToTail(2);
		first.appendToTail(3);
		first.appendToTail(2);
		first.appendToTail(1);
		first.appendToTail(4);
		
		ArrayList dataArray = new ArrayList<>();
		Node current = first;
		dataArray.add(current.data);
		while(current.next != null){
			current = current.next;
			if(!dataArray.contains(current.data)){
				dataArray.add(current.data);
			}
		}
		
		Object[] array = dataArray.toArray();
		
		Node newNode = new Node((int) array[0]);
		
		for(int i = 1; i < array.length; i ++){
			newNode.appendToTail((int) array[i]);
		}
		
		newNode.print();

	}

}
