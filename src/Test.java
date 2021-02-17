import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! Would you like to start a conversation? Yes or No");
		String response = scanner.nextLine();
		if (response.equals("No")) {
			System.out.println("Okay... bye I guess.");
		} else if (response.equals("Yes")) {
			System.out.println("Great! What would you like to talk about?");

			String[] convos = new String[3];
			convos[0] = "School";
			convos[1] = "Animals";
			convos[2] = "Cars";

		}

	}
}