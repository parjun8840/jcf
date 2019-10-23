import java.util.function.BiFunction;
import java.util.function.Function;

public class SampleTwo {
	//Lambda can be only use in case of Functional interface.

	public static void main(String[] args) {
		/*
	
		Function<Integer, Double> f = new Function<Integer, Double> () {

			@Override
			public Double apply(Integer t) {
		
				return t/2.0;
			}
			

	}; */
		
		/*
		Function<Integer, Double> f = (Integer t) -> {
			return t/2.0;
		};
		*/
		
		
		Function<Integer, Double> f = (t) -> t/2.0;
		System.out.println(f.apply(5));
		
		
		BiFunction< Integer, Integer, Integer> bi = (x,y) -> x+y;
		System.out.println(bi.apply(4, 5));
	

	}

}
