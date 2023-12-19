package Stream;

import java.util.stream.Stream;

public class AnyMatch {
	public static void main(String[] args) {
		Stream<String> str=Stream.of("Rajesh","manish","nilesh","Rnaga");
		boolean check=str.anyMatch(x->x.contains("Rajesh"));
		System.out.println(check);
	}

}
