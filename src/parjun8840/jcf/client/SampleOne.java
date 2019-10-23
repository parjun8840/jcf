package parjun8840.jcf.client;

import java.util.function.Function;

public class SampleOne {

	public static void main( String[] args) {
		Function<Integer, Double> f = new Function<Integer, Double> () {

			@Override
			public Double apply(Integer t) {
		
				return t/2.0;
			}
			

	};
	System.out.println(f.apply(5));

}
}