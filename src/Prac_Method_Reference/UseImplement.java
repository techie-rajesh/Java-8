package Prac_Method_Reference;

public class UseImplement {

	public static void main(String[] args) {
		
		Implement imp=new Implement();
		Max_Min max=imp::findMax;
		Max_Min min=imp::findMin;
		int[] a= {10,5,12,8,3,2,20};
		System.out.println(max.maxOrMax(a));
		System.out.println(min.maxOrMax(a));
	}

}
