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

			if (response2.toLowerCase().equals("school")) {
				System.out.println(
						"Do you REALLY want to talk about school right now? School is stressful. Are you okay?");
				String schoolResponse = scanner.nextLine();
				if (schoolResponse.toLowerCase().equals("yes")) {
					System.out.println("Okay good. Just checking. Keep it up buddy!");
				} else if (schoolResponse.toLowerCase().equals("no")) {
					System.out.println("Aw. I'm sorry. Hope it gets better");
				}

			} else if (response2.toLowerCase().equals("animals")) {
				System.out.println("Aw yay! Do you like dogs?");
				String dog = scanner.nextLine();
				if (dog.toLowerCase().equals("yes")) {
					System.out.println("Amazing. Spectacular. You are a great person.");
				} else if (dog.toLowerCase().equals("no")) {
					System.out.println("Um. No, we can't continue this conversation.");
				}
			} else if (response2.toLowerCase().equals("cars")) {
				System.out.println("I know nothing about cars, give me a random car fact.");
				String carFact = scanner.nextLine();
				System.out.println("Cool! The more you know! :)");
			}
			
			System.out.println("Is there anything else you would like to say?");
			String response3 = scanner.nextLine();
			System.out.println("If you said no, cool. If you said yes, sorry, but I have nothing else to say. Goodbye!");
		}

	}
}