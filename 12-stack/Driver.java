import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[]args){
	MyStack m = new MyStack();
	for (int i = 0; i < 10; i++){
	    m.push("hello0");
	    m.push("hello1");
	    m.push("hello2");
	    m.push("hello3");
	    m.push("hello4");
	    m.push("hello5");
	    m.push("hello6");
	    m.push("hello7");
	    m.push("hello8");
	    m.push("hello9");
	    m.push("hello10");
	    m.push("hello11");
	    //m.push("hello0");
	}
	System.out.println(m);
    }
}
