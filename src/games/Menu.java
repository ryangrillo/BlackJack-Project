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
		System.out.println("***        Welcome             ***");
		System.out.println("**********************************");
		System.out.println("***                            ***");
		System.out.println("***    1.  Play Black Jack     ***");
		System.out.println("***                            ***");
		System.out.println("***                            ***");
		System.out.println("**********************************");
		System.out.println("**********************************");
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Press 1 to start");
		int choice = kb.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("you chose 1");
			Table t = new Table();
			t.start();
			
			break;
		case 2:
			System.out.println("you chose 2");
			break;
		}
	}
}
