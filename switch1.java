
import java.util.Scanner;

public class switch1 {

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
            switch(Answer.toLowerCase()) {
                
                case "yes":
                {
                    System.out.println("Did you eat Breakfast?");
                    Answer = tKeyboard.nextLine();
                    switch(Answer.toLowerCase()) {
                       
                        case "yes":
                            System.out.println("Buy Diet Coke.");
                            break;
                       
                        case "no":
                            System.out.println("Buy Coke.");
                            break;
                    }
                    break;
                }               
                case "no":
                    System.out.println("Buy Water.");
                    break;
            }           
            System.out.println("Eat lunch");
            System.out.println("Return tray");
            System.out.println("Leave");
        }
    }
}
