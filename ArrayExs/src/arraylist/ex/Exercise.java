package arraylist.ex;

import java.util.*;
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Cyne");
		System.out.print(colors + " ");
		System.out.println();
		
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		colors.remove(2);
		System.out.print(colors + " ");
		System.out.println();
		System.out.print(colors.get(1)); //Retreive element
		
		
		}
}
