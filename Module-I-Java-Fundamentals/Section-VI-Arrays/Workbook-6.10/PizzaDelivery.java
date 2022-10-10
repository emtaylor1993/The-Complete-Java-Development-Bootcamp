import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pizza toppings do you want?");
        int toppings = scan.nextInt();
        String[] toppingNames = new String[toppings];

        System.out.println("\nGreat, enter each topping!");
        for (int i = 0; i < toppingNames.length; i++) {
            System.out.print(i + ". ");
            toppingNames[i] = scan.next();
        }

        System.out.println("\nThank you! Here are the toppings you ordered.");
        for (int i = 0; i < toppingNames.length; i++) {
            System.out.println(i + ". " + toppingNames[i]);
        }

        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine(); scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    }
}