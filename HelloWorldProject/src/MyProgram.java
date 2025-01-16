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

	String name = x.nextLine();
	System.out.println(n);
	while (!name.equals("END")) {
		if (name.substring(0,3).equals("CAR")) {
			String name = x.nextLine();
			String product = x.nextLine();
			String ogCity = x.nextLine();
			String destination = x.nextLine();
			int weight = x.nextLine();
			int miles = x.nextLine();
			Train first = new Train(carName, contents, origin, dest, weight, miles);
			track0.add(first);
		else {
			String engName = x.nextLine();
			String engDest = x.nextLine();
			Train second = new Train(String car, String fin);
		} 

		}
		//checks if car has more than 700 miles on it
		Train t1 = track1.remove();
		if (name.substring(0,3).equals("CAR")) {
			while (!track0.isEmpty()) {
				if (t1.getMiles() > 700) {
					track1.add(t1);
					t1.setMiles();
				}
			}
		}

		
		if ()

	}





}

