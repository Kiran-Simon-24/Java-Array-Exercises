package arraylist.ex;

import java.util.*;

public class IteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("Apple");
		lis.add("Banana");
		lis.add("Orange");
		lis.add("Mango");
		Iterator<String> itr = lis.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		ListIterator<String> itrp = lis.listIterator(lis.size());
		while(itrp.hasPrevious()) {
			System.out.print(itrp.previous() + " ");
		}
		 
	}

}
