package LL;

import java.util.Scanner;

//import singlylist.SinglyList;
//import singlylist.SinglyList.Node;

public class SinglyLinearLinkedList {
	
		static class Node {
			private int data;
			private Node next;
		
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
		
		public SinglyLinearLinkedList() {
			head = null;
		}
		void display() {
			System.out.println("List : ");
			Node trav = head;
			while(trav != null) {
				System.out.println(trav.data);
				trav = trav.next;
			}
			System.out.println("");
		}
		void addFirst(int val) {
			// create new node and init it
			Node newNode = new Node(val);
		
			newNode.next = head;
			
			head = newNode;
		}
		void addLast(int val) {
			
			Node newNode = new Node(val);
	
			if(head == null) {
				head = newNode;
			}
			
			else {
				
				Node trav = head;
				while(trav.next != null)
					trav = trav.next;
				
				trav.next = newNode;
			}
		}
		// ...
		public void addAtPos(int val, int pos) {
			
			if(head == null || pos <= 1)
				addFirst(val);
			// general: add node at given pos
			else {
				// allocate & init new node
				Node newNode = new Node(val);
				// traverse till pos-1 (trav)
				Node trav = head;
				for(int i=1; i < pos-1; i++) {
					// special 3: if pos > length of list, add node at the end.
					if(trav.next == null)
						break;
					trav = trav.next;
				}
				// newnode's next should point to trav's next
				newNode.next = trav.next;
				// trav's next should pointer to new node
				trav.next = newNode;
			}
		}
		public void delFirst() {
			// special 1: if list is empty, throw exception
			if(head == null)
				throw new RuntimeException("List is empty.");
			// general: make head pointing to next node.
			head = head.next;
			// note: the old first node will be garbage collected.
		}
		public void delAll() {
			head = null;
			// all nodes will be garbage collected
		}
		public void delAtPos(int pos) {
			// special 1: if pos = 1, delete first node
			if(pos == 1)
				delFirst();
			// special 2: if list is empty or pos < 1, then throw exception.
			if(head == null || pos < 1)
				throw new RuntimeException("List is empty or Invalid position.");
			// take temp pointer running behind trav.
			Node temp = null, trav = head;
			// traverse till pos (trav)
			for(int i = 1; i < pos; i++) {
				// special 3: if pos is beyond list length, then throw exception.
				if(trav == null)
					throw new RuntimeException("Invalid position.");
				temp = trav;
				trav = trav.next;
			}
			// trav is node to be deleted & temp is node before that
			temp.next = trav.next;
			// trav node will be garbage collected
		}
		
		public void delLast() {
			
			if(head == null)
				throw new RuntimeException("List is empty.");
			
			if(head.next == null)
				head = null;
			else {
				
				Node temp=null, trav=head;
				
				while(trav.next != null) {
					temp = trav;
					trav = trav.next;
				}
				
				temp.next = null;
				
			}
		}
	}

	public class SinglyListMain {
		public static void main(String[] args) {
			int choice, val, pos;
			SinglyLinearLinkedList list = new SinglyLinearLinkedList();
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1: // Display
					list.display();
					break;
				case 2: // Add First
					System.out.print("Enter new element: ");
					val = sc.nextInt();
					list.addFirst(val);
					break;
				case 3: // Add Last
					System.out.print("Enter new element: ");
					val = sc.nextInt();
					list.addLast(val);
					break;
				case 4: // Add At Pos
					System.out.print("Enter new element: ");
					val = sc.nextInt();
					System.out.print("Enter element position: ");
					pos = sc.nextInt();
					list.addAtPos(val, pos);				
					break;
				case 5: // Del First
					try {
						list.delFirst();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 6: // Del Last
					try {
						list.delLast();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 7: // Del At Pos
					System.out.print("Enter element position: ");
					pos = sc.nextInt();
					try {
						list.delAtPos(pos);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 8: // Del All
					list.delAll();
					break;
				}
			} while(choice!=0);
			sc.close();
}}
