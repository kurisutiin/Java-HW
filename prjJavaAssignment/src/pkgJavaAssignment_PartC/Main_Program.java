package pkgJavaAssignment_PartC;

import java.util.*;

public class Main_Program  {
	 //Number = new List();	

	ArrayList<Integer> storeEvenNumbers(int N){
		ArrayList<Integer> a1 = new ArrayList();
		 for (int i = 1; i <= N; i++) {
			   if (i % 2 == 0) {
			    a1.add(i);
			   
			   }
			   
			  }
		return a1;
		}
	ArrayList<Integer> printEvenNumbers(int N){
		ArrayList<Integer> a2 = new ArrayList();
		for (int i = 1; i <= N; i++) {
			if (i * 2 ==0) {
			    a2.add(i);
		}
		
		
	}return a2;
	}
	public static void main(String[] args) {
		

	}

}
