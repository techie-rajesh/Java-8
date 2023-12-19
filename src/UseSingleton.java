class Singleton {
	private static Singleton s1=null;
	public String name;
	private Singleton() {
		name="Rajesh";
	}
	public static Singleton gets1()
	{
		if(s1==null)
		{
			s1=new Singleton();
		}
		return s1;
	}
}
public class UseSingleton{
	public static void main(String[] args) {
		Singleton x=Singleton.gets1();
		Singleton y=Singleton.gets1();
		Singleton z=Singleton.gets1();
		System.out.println(x.hashCode()+"  "+y.hashCode()+"  "+z.hashCode());
		if((x==y)&&(y==z))
		{
			System.out.println("three Object memory location is same");
		}
		else
		{
			System.out.println("Different memory address");
		}
	}
	
}
