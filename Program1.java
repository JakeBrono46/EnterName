import java.util.*;
import java.io.*;

public class Program1 {

	public static void main(String[] args) throws IOException {

		Scanner console = new Scanner(System.in);
		PrintWriter output = new PrintWriter("output.txt");
		
		System.out.print("How many names? ");
		int numName = console.nextInt();
		System.out.println();
		
		for(int i = 0; i < numName; i++) {
			
			System.out.print("Enter Name: ");
			String name = console.next();
			
			output.println(i + 1 + " " + name);
		}
		
		//Print result to file
		
		output.close();
	}

}
