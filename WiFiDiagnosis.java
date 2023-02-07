import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// String variable to hold user input
		String answer;
		
		// Initial output
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		// First step to diagnosis
		System.out.println("\nFirst Step: Reboot Your Computer");
		System.out.print("Are you able to connect with the internet? (Yes or No)");
		answer = input.next();
		
		// Verify answer
		if (answer.equalsIgnoreCase("no"))
		{
			//Second Step
			System.out.println("\nSecond Step: Reboot Your Router");
			System.out.print("Now are you able to connect with the internet? (Yes or No)");
			answer = input.next();
			// Verify answer
			if (answer.equalsIgnoreCase("no"))
			{
				//Third Step
				System.out.println("\nThird Step: Make Sure The Cables To Your Router Are Plugged In Firmly And Your Router Is Getting Power");
				System.out.print("Now are you able to connect with the internet? (Yes or No)");
				answer = input.next();
				if (answer.equalsIgnoreCase("no"))
				{
					//Fourth Step
					System.out.println("\nFourth Step: Move Your Computer Closer To Your Router");
					System.out.print("Now are you able to connect with the internet? (Yes or No)");
					answer = input.next();
					if (answer.equalsIgnoreCase("no"))
					{
						//Fifth Step
						System.out.println("\nFifth Step: Contact Your ISP");
						System.out.print("Make sure your ISP is hooked up to the router.");
					}
					else if (answer.equalsIgnoreCase("yes"))
					{
						System.out.println("Moving your computer closer to the router seemed to work.");
					}
				}
				else if (answer.equalsIgnoreCase("yes"))
				{
					System.out.println("Checking the router's cables seemed to work.");
				}
				
			}
			else if (answer.equalsIgnoreCase("yes"))
			{
				System.out.println("Rebooting your router seemed to work.");
			}
		}
		else if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your computer seemed to work.");
		}
		
		System.exit(0);
	}
}
