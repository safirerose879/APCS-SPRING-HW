public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = null;
    }
    
    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head);
	head=tmp;
	
    }
    public String toString() {
	String s= "";
       	while(head != null) {
	    //  tmp = new (tmp.getNext());
	    Node tmp = head.getNext();
	    head = tmp;
	    s = " " + tmp;
	}
	return s;
    }
    public void add (int i, String d){
	Node tmp = new Node (d);
    }

}
