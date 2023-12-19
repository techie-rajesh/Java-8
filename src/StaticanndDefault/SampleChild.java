package StaticanndDefault;

public class SampleChild implements Sample {
	
	String name="Nethaji";
	
	public void printString(String word) {
		System.out.println("The String is="+word);
	}
	public String onOff(boolean isOff) {
		if(isOff==true) {
			return "it is device off";
		}
		else {
			return "it is Device On";
		}
		
	}

}
