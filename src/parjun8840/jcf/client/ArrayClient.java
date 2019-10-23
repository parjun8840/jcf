package parjun8840.jcf.client;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayClient {

	public static void main(String[] args) {
		String[] names = {"George", "Brad", "Angelina", "Lee", "Brandon"};
		//Arrays.sort(names);// We didn't write the logic. It is written in String class implementing comparable. Array has sort method but
		// it is calling compareTo of String class.
		
		//We are now implementing sort logic using comparator at the client side. 
		Arrays.sort(names, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		for (String name: names) {

	System.out.println(name);
	}
	}
}
