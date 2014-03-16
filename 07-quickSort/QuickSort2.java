import java.util.*;
import java.io.*;

public class QuickSort2{
    private Random rnd = new Random();

    public int partition(int[] a, int l, int r) {
	int tmp;
	int pivotIndex = l+rnd.nextInt(r-l);
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r] = a[pivotIndex];
	a[pivotIndex]=tmp;

	int wall=l;
	int rWall = wall;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		wall++;
	    }
	    else if (a[i] == pivot){
		tmp = a[i];
		a[i] = a[rWall];
		a[rWall] = tmp;
		rWall++;
	    }
	}
	tmp = a[wall];
	a[wall]=a[r];
	a[r]=tmp;
	return (wall+rWall)/2;
    }
    
    public void qsort(int[] a, int l, int r) {
	if (r-l <= 1)
	    return;
	else {
	    int pi = partition(a,l,r);
	    if (pi-1>l)
		qsort(a,l,pi-1);
	    if (pi+1<r)
		qsort(a,pi+1,r);

	}
    }
    public void  qsort(int[] a) {
	qsort(a,0,a.length-1);
    }
    

    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	long start,elapsed;

	Random rnd = new Random();
	int[]a = {2,5,6,9,1,3,35,7,7,25,7,14};
	//int[] a = new int[n];
	//	for (int i=0;i<n;i++)
	//  a[i]=rnd.nextInt(100);
	//System.out.println(Arrays.toString(a));
	QuickSort2 q = new QuickSort2();
	System.out.println("Starting");
	start = System.currentTimeMillis();
	q.qsort(a);
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Time: "+elapsed+"\n");
	//int p = q.partition(a,0,a.length-1);
	//System.out.println("a["+p+"] = "+a[p]);	
	//System.out.println(Arrays.toString(a));
    }
    
}  
