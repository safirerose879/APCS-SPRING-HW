import java.io.*;
import java.util.*;

public class Node {
    private int data;
    private Node left,right;

    public Node(int d){
	data = d;
	left = null;
	right = null;
    }
    public void setData(int d){
	data = d;
    }
    public int getData(){
	return data;
    }
    public void setLeft(Node n){
	left = n;
    }
    public Node getLeft(){
	return left;
    }
    public void setRight(Node n){
	right = n;
    }
    public Node getRight(){
	return right;
    }
    public String toString(){
	return "" + data;
    }

}
