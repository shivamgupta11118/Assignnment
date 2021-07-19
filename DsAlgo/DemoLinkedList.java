package DsAlgo;



import java.util.Scanner;
public class DemoLinkedList {
	//Node  head;
static class Node{
	 int data;
	 Node next;
	 public Node(int data) {
		 this.data=data;
		 next=null;
	 }
	 
	
}


	public  Node add(Node head,int item) {
		//System.out.println("1");
		Node new_node=new Node(item);
		new_node.next=null;
		if(head==null) {
			head=new_node;
			
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return head;
		
	}
	public static void print(Node head) {
		//System.out.println("1");
		Node current=head;
		//System.out.println(current.data);
		System.out.println("elements");
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
			//System.out.println("1");
		}
	}
	public static void search(Node head,int index) {
		Node curr=head;
		int i=0;
		while(curr!=null ) {
			if(i==index) {
			//System.out.println("1");
			System.out.println(curr.data);}
			i++;
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		Node head=null;
		// TODO Auto-generated method stub
		DemoLinkedList dml=new DemoLinkedList();
		//Scanner sc=new Scanner(System.in);
		head=dml.add(head,1);
		dml.add(head,2);
		dml.add(head,3);
		dml.add(head,4);
		dml.add(head,5);
		dml.add(head,7);
		print(head);
		search(head,2);
	}

}
