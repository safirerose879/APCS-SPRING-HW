public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = new Node("Dummy");
    }
    
    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head);
	head=tmp;
	
    }
    /*    public String toString() {
	String s= "";
       	while(head != null) {
	    //  tmp = new (tmp.getNext());
	    Node tmp = head.getNext();
	    head = tmp;
	    s = " " + tmp;
	}
	return s;
	}*/

    public String toString(){
	String s = "";
	Node temp = head;
	while (temp!=null){
	    s+=temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }

    public void add (int i, String d){
	Node tmp = new Node (d);
        Node tmp2 = head.getNext();
	while (tmp2 != null){
	    tmp2 = tmp2.getNext();
	}
	tmp2.setNext(tmp);
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

    /*remove:
i=0;
tmp = head;
while (i<n-1){
tmp = tmp.getNext();
i = i +1;
}
tmp.setNext(tmp.getNext().getNext());

head->0->1->2->3...

empty list
head=>Dummy(null)
head->dummy->0->1->2->3...


PIGGYBACKING POINTERS
i = 0
tmp = head.getNext();
t2=head;
while(i<n){
t2 = tmp;
tmp = tmp.getNext()
i = i + 1;

//tmp is at event point
//t2 is one before

t2 = tmp.getNext() OR t2.setNext(tmp.getNext()) OR t2.setNext(t2.getNext().getNext());
}
     */

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
    /*
    public int size(){
	return length;
    }
    */
    /*
METHOD 1: use a loop a la toString to calculate the length and return it.***Easier to maintain. (O)n*** 
METHOD 2: make a length instance variable. Add 1 to length in add routines. Subtract 1 from length in remove routines. size() just returns length.
***SLIGHTLY FASTER (O)k (constant) AMORTIZED-calculate use or money over time*** 
     */

}
