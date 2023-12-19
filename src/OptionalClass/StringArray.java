package OptionalClass;

import java.util.Optional;

public class StringArray {
	public static void main(String[]args) {
		
		String [] words=new String[10];
		int i=4;
		Optional<String>check=Optional.ofNullable(words[i]);
		if(check.isPresent()) {
			System.out.println(words[i].toUpperCase());
		}
		else {
			System.out.println("The value is Null");
		}
		// Direct  value passing through the null point exception error so use optionalClass;
		//System.out.println(words[4].toLowerCase());
	}
}
