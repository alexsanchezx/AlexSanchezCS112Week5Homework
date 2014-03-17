import java.util.Scanner;

public class ThirstyWeek5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Answer = "";
		System.out.println("Hungry");
		System.out.println("Get in line");
		System.out.println("Buy lunch");
		System.out.println("Thirsty?");

		Scanner tKeyboard = new Scanner(System.in);
		Answer = tKeyboard.nextLine();
		{
		if("yes".equalsIgnoreCase(Answer))
		{
			System.out.println("Did you eat Breakfast?");
			Answer = tKeyboard.nextLine();
			if("yes".equalsIgnoreCase(Answer))
			{
			
	System.out.println("Buy Diet Coke");
			}
			else if("no".equalsIgnoreCase(Answer))
			{
			     System.out.println("Buy Coke");
			}
		}
		else if("no".equalsIgnoreCase(Answer)) 
		{
			System.out.println("Buy Water");
		}
		}
		System.out.println("Eat lunch");
		System.out.println("Return tray");
		System.out.println("Leave");
	

	}
}

