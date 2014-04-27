import java.io.*;
import java.util.*;

public class BST{
    private Node root;

    public BST(){
	root = null;
    }
    public Node search(int x){
	Node c = root;
	while (c != null && c.getData() != x){
	    if (root.getData() < x){
		c = c.getRight();
	    }
	    else{
		c = c.getLeft();
	    }
	}
	return c;
    }

    public void insert(int x){
	Node c = root;
	Node n = new Node(x);
	if (c == null){
	    c = new Node (x);
	}
	else{
	    if(x < c.getData()){
		if(c.getLeft() == null){
		    c.setLeft(n);
		}
		else{
		    c = c.getLeft();
		    insert(x);
		}
	    }
	    else{
		if(x > c.getData()){
		    if(c.getRight() == null){
			c.setRight(n);
		    }
		    else{
			c = c.getRight();
			insert(x);
		    }
		}
	    }
	}
    }

    public Node search2(Node c, int x){
	if (c.getData() == x){
	    return c;
	}
	else{
	    if (x > c.getData()){
		return (search2(c.getRight(), x));
	    }
	    else{
		return (search2(c.getLeft(), x));
	    }
	}
    }
}
