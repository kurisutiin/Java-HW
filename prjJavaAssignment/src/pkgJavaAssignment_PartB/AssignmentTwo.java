package pkgJavaAssignment_PartB;
import java.io.*;
import java.util.ArrayList;

public class AssignmentTwo {

	int x;
	int y;
	String Up = "U";
	String Down = "D";
    String Right = "R";
	String Left = "L";
	static ArrayList<String> answer =  new ArrayList<String>();
	static String choice;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Help Optimus Prime out of the trap.");
		System.out.println("            Round 1                  ");
		System.out.println("==================================");
		System.out.print("     Which way should he go? ");
		
	choice  = br.readLine();
	for(int i = 0; i<10; i++) {
	if(choice.equals("U")) {
		System.out.println("            Round 2                 ");
		System.out.println("==================================");
		System.out.print("     Which way should he go? ");
		answer.add(choice);
		choice  = br.readLine();
	
		if(choice.equals("R")) {
		System.out.println("            Round 3                 ");
		System.out.println("==================================");
		System.out.print("     Which way should he go? ");
		choice  = br.readLine();
		}
		if(choice.equals("L")) {
		
		System.out.println("Mission Completed");
		System.out.println("=======================================");
		System.out.print("Results\n" + answer);
	 }}
	 else{
		 System.out.println("Game Over" + answer);
		 break;
	 }
	
		
	}
	
}
}