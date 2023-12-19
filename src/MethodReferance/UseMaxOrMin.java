package MethodReferance;

public class UseMaxOrMin {
	public static void main(String []args) {
		
		ImplementMethods i=new ImplementMethods();
		
		MaxOrMin max=i ::findMax;
		MaxOrMin min=ImplementMethods::findMin;
		
		int [] num= {10,20,40,30,50,55};
		
		System.out.println(max.maxOrMin(num));
		System.out.println(min.maxOrMin(num));
	}

}
