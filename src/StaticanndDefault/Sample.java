package StaticanndDefault;

public interface Sample {
	static String name="Raja";

	public static void printString(String word) {
		System.out.println("The String is= "+word);
	}
	public default String onOff(boolean isOn) {
		if(isOn==true) {
			return "It  is On";
		}
		else {
			return "It is OFF";
		}
	}

}
