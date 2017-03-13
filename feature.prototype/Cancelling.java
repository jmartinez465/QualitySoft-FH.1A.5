import java.util.Scanner;

public class Cancelling {
	static String name = "unchanged";

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Change your name. Press 'c' and enter to cancel.");
		setName(console.next());
		System.out.println(name);
	}


	public static void setName(String newName) {
		if (newName.equals("c")) {
			return;
		} else {
			name = newName;
		}
		
		
	}
}


