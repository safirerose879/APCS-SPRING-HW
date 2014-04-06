import java.io.*;
import java.util.*;

public class MyStack{

    private int top;
    private String[]stack;
    private int numelt;
    private int len;

    public MyStack(){
	top = 0;
	stack = new String[10];
	numelt = 0;
	len = stack.length;
    }

    public void push(String s){
	String[]tmp;
        String str = new String(s);
	if (numelt >=10){
	    tmp = new String[len + 1];
	}
	else{
	    tmp = new String[len];
	}
	tmp[top] = str;
	for(int i = 0; i < len-1; i++){
	    tmp[i+1] = stack[i];
	}
	numelt = numelt + 1;
	stack = tmp;
    }

    public String pop(){
	String ret = stack[0];
	for (int i = 0; i < len-1; i++){
	    stack[i] = stack[i+1];
	}
	numelt = numelt - 1;
	return ret;
    }

    public String peek(){
	return stack[0];
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < len; i++){
	    s = s + stack[i] + ", ";
	}
	return s;
    }
}
