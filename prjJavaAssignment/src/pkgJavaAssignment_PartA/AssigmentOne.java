package pkgJavaAssignment_PartA;
import java.io.*;
import java.util.*;
public class AssigmentOne {
    
	 static int choice;
	
	//int count = 0;
 
	public static void main(String[] args) throws IOException {
		
		
		Scanner in = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements in the array: ");

	 choice = Integer.parseInt(in.nextLine());
		
	 ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < a1.size(); i++) {
			System.out.print("Enter numbers " + (i+1) + " : ");
			 a1.add(in.nextInt());
		         a1.add(i); 
		}
		System.out.println("Enter the index of the array element you want to access ");
		 choice = Integer.parseInt(in.nextLine());
		for (int i = 0; i < a1.size(); i++) {
			
		        System.out.print(a1 + "\n");
		}
		 
		 
		try {
			
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("OUT OF BOUNDS:" + e.getMessage());
		}
			}
		
		
	}


