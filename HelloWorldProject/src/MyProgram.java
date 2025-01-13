/*
 * TODO: Logan Torma-Kim
 * TODO: 1/13/2025
 * TODO: 3
 * TODO: Program Description _______________________________________________________________________________________________________________________
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) {

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
			String name = x.nextLine();
			System.out.println(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	Queue <Train> track0 = new LinkedList <>();
	Queue <Train> track1 = new LinkedList <>();
	Stack <Train> trackA = new Stack <>();
	Stack <Train> trackB = new Stack <>();
	Stack <Train> trackC = new Stack <>();
	Stack <Train> trackD = new Stack <>(); 

	try {
		File f = new File(HelloWorldProject/src/data.txt);
		x = new scanner (f);
	} // end try
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	} // end catch
}
