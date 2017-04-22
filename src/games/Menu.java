package games;
import java.util.Scanner;
public class Menu {
	
	public void menuDisplay() {
		System.out.println("**********************************");
		System.out.println("***                            ***");
		System.out.println("***  GreenWood Village Hotel   ***");
		System.out.println("***       And Casino           ***");
		System.out.println("***                            ***");
		System.out.println("**********************************");
		System.out.println("***      Select and Option:    ***");
		System.out.println("**********************************");
		System.out.println("***    1.  Play Black Jack     ***");
		System.out.println("***                            ***");
		System.out.println("***    2.  Quit                ***");
		System.out.println("***                            ***");
		System.out.println("**********************************");
		System.out.println("**********************************");
		
	
	//spublic void makeSelection() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Make Selection: 1 or 2: ");
		int choice = kb.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("you chose 1");
			Player one = new Player("PlayerOne");
			Player comp = new Player("Computer");
			System.out.println("Welcome " + one.getName() + " You are playing against " + comp.getName());
		    HandLogic th = new HandLogic();
		    th.Hand();
			
			break;
		case 2:
			System.out.println("you chose 2");
			break;
		}
	}
}
