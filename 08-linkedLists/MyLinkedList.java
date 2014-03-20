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
	for(int a = 0; a <= i; i++){
	    Node tmptmp = head.getNext();
	    head = tmptmp;
	    if (a == i-1){
		tmptmp.setNext(head.getNext());
		head.setNext(tmptmp);
	    }
	    if (tmptmp.getNext() == null){
		System.out.println("You're outta bounds");
	    }
	}
    }

    public String get(int i){
	String ret = "";
	for (int a = 0; a < i; i++){
	    Node tmp = head.getNext();
	    head = tmp;
	    if (a == i-1){
		ret = head.getData();
	    }
	    if (tmp.getNext() == null){
		ret = "No good";
	    }
	}
	return ret;
    }

    public String set(int i, String s){
	String ret = "";
        for (int a = 0; a < i; i++){
	    Node tmp = head.getNext();
	    head = tmp;
	    if (a == i-1){
		ret = head.getData();
		head.setData(s);
	    }
	}
	return ret;
    }

    public String remove(int i){
	String ret = "";
	for (int a = 0; a < i; i++){
	    Node tmp = head.getNext();
	    head = tmp;
	    if (a == i-1){
		ret = head.getNext().getData();
		Node tmptmp = head.getNext().getNext();
		head.setNext(tmptmp);
	    }
	}
	return ret;
    }

    public int find(String s){
	int count = 0;
	int fin = 0;
	while (head.getNext() != null){
	    Node tmp = head.getNext();
	    head = tmp;
	    if (head.getData() == s){
		fin = count;
	    }
	    count++;
	}
	return fin;
    }
    public int length(){
	int count = 0;
	while (head.getNext() != null){
	    Node tmp = head.getNext();
	    head = tmp;
	    count++; 
	}
	return count + 1;
    }

}
