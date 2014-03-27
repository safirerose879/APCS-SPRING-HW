public class MyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    public MyLinkedList() {
	head = new Node("arbitrary");
	tail = head;
    }
    /*    
    public void add(String d) {
	Node tmp = new Node(d);
	// No need to set head to ->	head.setNext(tmp);
	//head = tmp;
	tmp.setNext(head.getNext());
	head.setNext(tmp);
    }
    */
    // The tail node is linked to the last node 
    public void add (E d) {
	Node<E> tmp = new Node<E>(d);
	tmp.setNext(tail.getNext());//the end
	tail.setNext(tmp); 
    }


    public String toString() {
	String s = "";
	Node<E> tmp = head.getNext();
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }


    public E get(int i) {
	Node<E> tmp = head;
	int count = 0;
	while(count<i) {
	    count++;
	    tmp=tmp.getNext();
	}
	return tmp.getData();
    }
   
    

    public E set(int i, E s) {
	int count = 0;
	String answer = "";
	Node<E> tmp = head.getNext();
	while(count<i) {
	    count++;
	    tmp=tmp.getNext();
	}
	tmp.setData(s);
	return tmp.getData();
    }

    public E remove(int i) {
	int count = 0;
      	Node<E> tmp1 = head.getNext();
	Node<E> tmp2 = tmp1.getNext();
	while (count<i-1) {
	    count++;
	    tmp1 = tmp1.getNext();
	    tmp2 = tmp2.getNext();
	}
	E ans = tmp2.getData();
	tmp1.setNext(tmp2.getNext());
	return ans;
    }
	
    public int find(String s) {
	int count = 0;
	Node<E> tmp = head.getNext();
	while (tmp != null) {
	    count++;
	    if (tmp.getData().equals(s)) { 
		return count; 
	    }
	    tmp = tmp.getNext();
	}
	return -1;
    }
    
    public int size() {
	int ans = 0;
	Node<E> tmp = head.getNext();
	while (tmp != null) {
	    ans++;
	    tmp = tmp.getNext(); 
	}
	return ans;
    }
}