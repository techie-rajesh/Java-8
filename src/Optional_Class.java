import java.util.Optional;
public class Optional_Class {

	public static void main(String[] args) {
		String[] name=new String[10];
		//String[] name= {"rajesh","raju","rakkesh","ramesh"};
		int i=1;
		Optional<String> check=Optional.ofNullable(name[i]);
		if(check.isPresent()) {
			System.out.println(name[i].toUpperCase());
		}
		else
		{
			System.out.println("value is null");
		}

	}

}
