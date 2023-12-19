package StaticanndDefault;

public class UseSample {
	public static void main(String []args) {
		SampleChild s=new SampleChild();
		s.printString("Arravind");
		Sample.printString("Rajavel");
		System.out.println(s.onOff(true));
		
		System.out.println(s.name);
		System.out.println(Sample.name);
	}

}
