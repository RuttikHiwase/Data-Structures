package Stack;

public class StackWithArray {
	private static int arr[];
	private static int top;
	
	public StackWithArray(int size) {
		arr=new int[size];
		top=-1;
		
	}
	public static void push(int val)
	{
		if(isFull()) {
			throw new RuntimeException("The Stck is Full");
		}
		
		top++;
		arr[top]=val;
	}
	public static void  pop()
	{
		 top--;
	}
	
	public static int peek() {
		return arr[top];
	}
	public static boolean isEmpty() {
		return top ==-1;
	}
	public static boolean isFull() {
		return top==arr.length;
	}
	public static int[] display() {
		return arr;
	}
	
	

}
