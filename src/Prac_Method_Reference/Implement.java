package Prac_Method_Reference;

public class Implement {
	
	public int findMax(int[] a) {
		int max=a[0];
		for(int m:a) {
			if(m>max)
				max=m;
		}
		return max;
	}
	public int findMin(int[] b) {
		int min=b[0];
		for(int mi:b) {
			if(mi<min)
				min=mi;
		}
		return min;
	}

}
