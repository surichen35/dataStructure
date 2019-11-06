package fighting;
/**
 * @author suriChen
 * */
import java.util.Stack;

public class QueueByStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(stack1.isEmpty()&&stack2.isEmpty())
    		return 0;
    	if(!stack2.isEmpty())
    		return stack2.pop();
    	while(!stack1.isEmpty())
    		stack2.push(stack1.pop());
    	return stack2.pop();
    }
    public static void main(String[] args) {
    	QueueByStack queue = new QueueByStack();
    	int i=4;
    	while(i>=0)
    		queue.push(i--);
    	System.out.println(queue.pop());
	}
}