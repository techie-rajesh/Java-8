package Stream;

import java.util.stream.IntStream;

public class Limit {

	public static void main(String[] args) {
		IntStream inst= IntStream.range(20, 40);
		//inst.limit(9).forEach(x->System.out.println(x));
		inst.limit(10).forEach(System.out::println);
	}

}
