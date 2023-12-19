
public class UseMathematics {

	public static void main(String[] args) {
		Mathematics add=(a,b)->(a+b);
		Addition a=new Addition();
		Mathematics b=a::add;
		System.out.println("Addition of value ="+add.math(10, 20));
		System.out.println("Addition with method ="+b.math(40, 50));
	}

}
