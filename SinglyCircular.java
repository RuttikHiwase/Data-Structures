package LL;

import LL.SinglyCircular.Node;


	public class SinglyCircular {
		 
		static class Node{
			private Node next;
			private int data;
			 
			public Node() {
				data = 0;
				next = null;
			}
			public Node(int val) {
				data = val;
				next = null;
			}
			
		}
		private Node head;
		public SinglyCircular() {
			head=null;
		}
		
		public boolean isEmpty() {
			return head==null;
		}
	//------------------------------------------------------------------------	
		public void display() {  //DISPLAY
			if(head == null) {
				System.out.println("List is Empty ");
				return ;
			}
			
			Node trav=head;
			do {
				System.out.println(trav.data);
				trav=trav.next;
				
			}while(trav!=head);
		}
		
	//-------------------------------------------------------------------------
		public void addLast(int val) {
			//create new node
			Node newnode=new Node(val);
			//Special case : if list is Empty
			     
			if(isEmpty()) {
				head=newnode;
				newnode.next=head;
			}
			
			else {
				Node trav = head;

				while(trav.next !=head) 
					trav=trav.next;
				
				newnode.next=head;
				trav.next=newnode;
			}
		}
	//----------------------------------------------------------------------------
		
	public void deleteLast() {//Delete Last Element
		Node trav=head;
		//Node newnode=new Node(val);
		if(head==null) 
			throw new RuntimeException("The List is Empty");
		
		else
       while(trav!=head)
       {
    	   trav=trav.next;
       }
       trav.next=head;	
		
	}
  //----------------------------------------------------------------------------
	public void addFirst(int val){
		//Create new Node
		Node newnode=new Node(val);
		if(isEmpty()) {
			head=newnode;
			newnode.next=head;
		}
		else {
			Node trav=head;
			while(trav.next !=head) 
				trav=trav.next;
			
			newnode.next=head;
			
			newnode.next=newnode;
			
			head=newnode;
		}
		
		
	}
	//--------------------------------------------------------------------------
	public void addAtPos(int val,int pos) {
		
		
		if(head==null || pos <=1) 
			addFirst(val);
		
		else {
			Node newnode=new Node(val);
			Node trav=head;
			
			for(int i=1;i<pos-1;i++) {
				if(trav.next == head)
					break;
				
				trav=trav.next;
			}
			newnode.next=trav.next;
			
			trav.next=newnode;
		}
	}
	//-------------------------------------------------------------------------------
	public void delFirst() {//Delete First Node 
		 
		if(isEmpty())
			throw new RuntimeException("The List Empty");
		
		if(head.next ==head)
			head=null;
		else {
			Node trav=head;
			while(trav !=head)
			{
				trav=trav.next;
			}
			head=head.next;
			trav.next=head;
		}
	}
	//---------------------------------------------------------------------------------------
	public void delAtPos(int pos) {//Delete At Position
		if(pos==1)
			delFirst();
		
		if(head==null ||pos  <1 )
			throw new RuntimeException("List is Empty");
		else {
			Node temp=null,trav=head;
			for(int i=1;i<pos;i++) {
				if(trav.next==head) {
					throw new RuntimeException("Invalid Position");
				}
				temp=trav;
				trav=trav.next;
			}
			temp.next=trav.next;
		}
	}
	//----------------------------------------------------------------------------------------
	public void delAll() {//Delete All Elementss
		head.next=null;
		head=null;
	}
	//-----------------------------------------------------------------------------------------
	}


