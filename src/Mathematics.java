@FunctionalInterface
public interface Mathematics {
	public int math(int a,int b);
	default public void view()
	{
		System.out.println("Functional interface");
	}

}
