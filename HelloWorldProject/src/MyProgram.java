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
	
	Queue <Train> track0 = new LinkedList <>();
	Queue <Train> track1 = new LinkedList <>();
	Stack <Train> trackA = new Stack <>();
	Stack <Train> trackB = new Stack <>();
	Stack <Train> trackC = new Stack <>();
	Stack <Train> trackD = new Stack <>(); 
	int weightA = 0;
	int weightB = 0;
	int weightC = 0;
	try{
		File f = new File("HelloWorldProject/src/data.txt");
		x = new Scanner (f);
	}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	} // end catch

	String name = x.nextLine();
	System.out.println(x);
	while (!name.equals("END")) {
		if (name.substring(0,3).equals("CAR")) {
			 name = x.nextLine();
			String product = x.nextLine();
			String origin = x.nextLine();
			String destination = x.nextLine();
			int weight = x.nextInt();
			int miles = x.nextInt();
			Train first = new Train(name, product, origin, destination, weight, miles);
			track0.add(first);
			name = x.nextLine();
			name = x.nextLine();
		}
		else {
			String name2 = x.nextLine();
			String destination = x.nextLine();
			Train second = new Train( name2,  destination);
			track0.add(second);
			name = x.nextLine();
		} 
	
	}
		//checks if car has more than 700 miles on it
		Train t1 = track1.remove();
		while (!track0.isEmpty()) {
			if (name.substring(0,3).equals("CAR")) {
				if (t1.getMiles() > 700) {
					track1.add(t1);
					t1.setMiles();
				} // end if
			} // end if 

			else if (t1.getDestination().equals("Trenton")) {
				if (t1.getName().substring(0,3).equals("ENG")) {
					trackA.push(track0.remove());
					System.out.println(trackA.peek().getName() + " going to " + trackA.pop().getDestination() + " with: ");
					while (!trackA.isEmpty()) {
						System.out.println(trackA.peek().getName() + " has " + trackA.pop().getProduct());
					} // end while
				else if (t1.getWeight() + weightA <= limitTrackA) {
					trackA.push(track0.remove());
					weightA+= t1.getWeight();
				} // end else if

				else {
					trackA.push = new Train("ENG00000", "Trenton");
					System.out.println(trackA.peek().getName() + " going to " + trackA.pop().getDestination() + " with ");
					while (!trackA.isEmpty()) {
						System.out.println(trackA.peek().getName() + " has " + trackA.pop().getProduct);
					} // end while
			
				} // end if
			} // end trenton

			else if (t1.getDestination().equals("Charlotte")) {
				if (t1.getName().substring(0,3).equals("ENG")) {
					trackB.push(track0.remove());
					System.out.println(trackB.peek().getName() + " going to " + trackB.pop().getDestination() + " with: ");
					while (!trackB.isEmpty()) {
						System.out.println(trackB.peek().getName() + " has " + trackB.pop().getProduct);
					} // end while
				else if (t1.getWeight() + weightB <= limitTrackB) {
					trackB.push(track0.remove());
					weightB+= t1.getWeight();
				} // end else if

				else {
					trackB.push = new Train("ENG00000", "Charlotte");
					System.out.println(trackB.peek().getName() + " going to " + trackB.pop().getDestination() + " with ");
					while (!trackB.isEmpty()) {
						System.out.println(trackB.peek().getName() + " has " + trackB.pop().getProduct);
					} // end while
				}
				} // end if
			} // end charlotte 
		
			else if (t1.getDestination().equals("Baltimore")) {
				if (t1.getName().substring(0,3).equals("ENG")) {
					trackC.push(track0.remove());
					System.out.println(trackC.peek().getName() + " going to " + trackC.pop().getDestination() + " with: ");
					while (!trackC.isEmpty()) {
						System.out.println(trackC.peek().getName() + " has " + trackC.pop().getProduct);
					} // end while
				else if (t1.getWeight() + weightC <= limitTrackC) {
					trackC.push(track0.remove());
					weightC+= t1.getWeight();
				} // end else if

				else {
					trackC.push = new Train("ENG00000", "Baltimore");
					System.out.println(trackC.peek().getName() + " going to " + trackC.pop().getDestination() + " with ");
					while (!trackC.isEmpty()) {
						System.out.println(track.peek().getName() + " has " + trackA.pop().getProduct);
					} // end while
				}
				} // end if
			} // end baltimore		
		
		
		} // end while

		
		

	} // end while




	
}

