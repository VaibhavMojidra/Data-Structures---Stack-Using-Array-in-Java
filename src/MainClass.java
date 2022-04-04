import stack.Stack;
import stack.stackexception.EmptyStackException;
import stack.stackexception.StackOverFlowException;

public class MainClass {
	public static void main(String[] args) {
		Stack stack=new Stack(6);
		try {
			stack.push(1);
			stack.push(9);
			stack.push(22);
			stack.push(7);
			stack.displayAll();
			stack.pop();
			stack.displayAll();
			stack.pop();
			stack.pop();
			stack.pop();
//			stack.pop();//Throws exception
			stack.displayAll();// Display empty stack message
			stack.push(1);
			stack.push(11);
			stack.push(31);
			stack.push(41);
			stack.push(43);
			stack.push(9);
			stack.push(10);//Throws exception
			
		} catch (StackOverFlowException e) {
			e.printStackTrace();
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		
	}
}
