package ScannerRunTime;
	import java.util.Scanner;

import MethodReferance.ImplementMethods;
import MethodReferance.MaxOrMin;

	public class GetArray {
		public static void main(String []args) {
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter Size: ");
			int size=s.nextInt();
			int [] nums=new int[size];
			
			for(int i=0; i<nums.length;i++) {
				System.out.println("Enter values:" );
				int value=s.nextInt();
				
			}
			
			MaxOrMin max=new ImplementMethods()::findMax;
			System.out.println(max.maxOrMin(nums));
			
			
		}

	}



