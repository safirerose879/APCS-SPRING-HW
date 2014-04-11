import java.io.*;
import java.util.*;

public class MyStack{

    private int top;
    private String[]stack;
    
    public MyStack(){
	top = 0;
	stack = new String[10];
    }

    public void push(String s){
	if (top<stack.length){
            stack[top] = s;
            top++;
        }
        else{
	    stack = Arrays.copyOf(stack,stack.length * 2);
	    push(s);
        }
    }

    public String pop(){
	String tmp = stack[top - 1 ];
	stack[top - 1] = null;
	top--;
	return tmp;
    }

    public String peek(){
	return stack[top-1];
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < top; i++){
	    s = s + stack[i] + ", ";
	}
	return s;
    }
}

