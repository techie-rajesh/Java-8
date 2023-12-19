package MethodReferance;

public class ImplementMethods {
	public int findMax(int [] num){
		int max=num[0];
		
		for(int x:num) {
			if(x>max) {
				max=x;
			}
			
		}
		return max;
	}

	public static int findMin(int [] num){
		int min=num[0];
		
		for(int x:num) {
			if(x<min) {
				min=x;
			}
			
		}
		return min;
	}
}
