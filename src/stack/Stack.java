package stack;

import stack.stackexception.EmptyStackException;
import stack.stackexception.StackOverFlowException;

public class Stack {
	int maxSize;
	int top;
	int arr[];
	
	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.arr =new int[maxSize];
		top = -1;
	}

	public Stack() {
		super();
		maxSize = 10;
		arr =new int[maxSize];
		top = -1;
	}
	
	public boolean push(int data) throws StackOverFlowException { //O(1)
		if(isFull()) {
			throw new StackOverFlowException("Stack is full. Cannot push new elements");
		}else {
			top++;
			arr[top]=data;
			System.out.println(data+" pushed into Stack.");
			return true;
		}
	}
	
	public boolean pop() throws EmptyStackException { //O(1)
		if(isEmpty()) {
			throw new EmptyStackException("Stack is Empty. No elements to pop.");
		}else {
			int popedElement=arr[top];
			arr[top]=0;
			top--;
			System.out.println(popedElement+" poped out from Stack.");
			return true;
		}
	}
	
	public void peek() throws EmptyStackException { //O(1)
		if(isEmpty()) {
			throw new EmptyStackException("Stack is Empty. No elements to peek.");
		}else {
			System.out.println("Last element in stack: "+arr[top]);
		}
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==maxSize-1;
	}
	
	public void displayAll() { //O(n)
		if(isEmpty()) {
			System.out.println("No element to display");
		}else {
			for(int i=top;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("");
	}
	
	public int count() {
		return top+1;
	}
	
}
