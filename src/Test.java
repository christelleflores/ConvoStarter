import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! Would you like to start a conversation? Yes or No");
		String response = scanner.nextLine();
		if (response.toLowerCase().equals("no")) {
			System.out.println("Okay... bye I guess.");
		} else if (response.toLowerCase().equals("yes")) {
			System.out.println("Great! What would you like to talk about?");
			System.out.println("School");
			System.out.println("Animals");
			System.out.println("Cars");
			
			String response2 = scanner.nextLine();
		}

	}
}