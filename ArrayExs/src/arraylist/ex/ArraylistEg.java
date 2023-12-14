package arraylist.ex;

import java.util.ArrayList;
import java.util.Collections;
public class ArraylistEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.remove(0);
		System.out.print(a + " ");
		CollectionEg();
	}
	static void CollectionEg() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Audi");
		cars.add("Volvo");
		cars.set(1, "Maazda");
		System.out.println(cars.get(0));
		Collections.sort(cars);
		for(String i : cars) {
			System.out.print(i + " ");
		}
		
	}

}
