import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {

    private Stack<Object> stack = new Stack<Object>();


    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public void push(Object data){
        stack.push(data);
    }


    public Object pop(){

        if(isEmpty()){
            throw new EmptyStackException();
        } else {
            return stack.pop();
        }
    }

    public Object peek(){

        if(isEmpty()){
            throw new EmptyStackException();
        } else {
           return stack.peek();
        }
    }
}
