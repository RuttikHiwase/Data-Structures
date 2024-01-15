import java.util.Scanner;
public class MyStack {
    private int arr[];
    private int top;
    //---------------------------------

    public MyStack(int size) {
        arr = new int[size];
        top=-1;
    }


    public void  push(int val){
        if(isFull())
            throw new RuntimeException("Stack is Full.");
        top++;
        arr[top]=val;
    }
    public void pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is Empty.");
        top--;

    }
     public int peek(){
         if(isEmpty())
             throw new RuntimeException("Stack is Full.");
         return arr[top];}

     public boolean isEmpty(){
         return top == -1;
         }
         public boolean isFull(){
         return top == arr.length-1;
         }

     }

    public static void main(String[] args) {

    }

}
