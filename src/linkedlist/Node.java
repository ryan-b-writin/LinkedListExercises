package linkedlist;

public class Node {
	public Node next = null;
	public int data;
	
	public Node(int d){
		data = d;
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	public void print(){
	Node current = this;
	System.out.println(this.data);
	while(current.next != null){
		current = current.next;
		System.out.println(current.data);
	}
	
	}
}
