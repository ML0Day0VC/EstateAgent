/**
 * @author Max Day
 * Created At: 2023/10/09
 */

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the estate agent's name: "); // ask for agents name
        String agentName = scanner.nextLine();

        double propertyPrice = 0.0;
        boolean vInput = false;

        do {
            System.out.print("Enter Property Price: R"); // entering property price
            String priceInput = scanner.nextLine();
            try {
                propertyPrice = Double.parseDouble(priceInput);
                vInput = true; //if the parse fails then this will never become true and will remain false untill the user enters valid data
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the property price.");
            }
        } while (!vInput);

        new EstateAgentSales(agentName, propertyPrice).printPropertyReport(); //calls constructor
        scanner.close();
    }
}
