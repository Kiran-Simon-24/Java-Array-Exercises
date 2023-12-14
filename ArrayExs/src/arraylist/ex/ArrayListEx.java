package arraylist.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Orange";
		for (String f : fruits) {
			System.out.print(f + ",");
		}
		System.out.println();
		List<String> fruitList = new ArrayList<String>();

		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("PileApple");
		fruitList.remove("Apple");
		System.out.println(fruitList.get(0));

		System.out.println(fruitList.contains("Sunkist"));
		System.out.print(fruitList + ",");

		List<String> fruit = new ArrayList<String>();

		// adding elements of array into arrayList
		Collections.addAll(fruit, fruits);
		System.out.println(fruit);

	}

}
