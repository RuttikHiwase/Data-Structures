package Stack;

import java.util.Scanner;
import Stack.StackWithArray;
public class StackMain {
	public static void main(String[] args) {
		
	
	StackWithArray sa=new StackWithArray(6);
	int value=0;
	Scanner sc= new Scanner(System.in);
	int choice;
	do{
		System.out.println("Enter your choice : 0.Exit  1.Push  2.Pop  3.Peek 4.Display  \n");
		choice=sc.nextInt();
		try {
		switch(choice) {
		   
		case 1:
			try {
				System.out.println("Enter the Element to Insert");
				 value=sc.nextInt();
				sa.push(value);
				System.out.println(value +"  is Inserted Successfully ");
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
			   value=sa.peek();		
			   sa.pop();
			  System.out.println("Popped Element :"+ value);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());}
			break;
		case 3 :
			try {
			 value=sa.peek();
			 System.out.println("The Element is : "+ value);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());}
			
			break;
			
		
		}}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}while(choice!=0);
	     sc.close();
		}

}
