import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        System.out.println("What is your first name?");
        String firstName = scan.next();

        System.out.println("What is your last name?");
        String lastName = scan.next();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("What is your username?");
        String userName = scan.next();

        System.out.println("What city are you from?");
        scan.nextLine();
        String city = scan.nextLine();

        System.out.println("What country is that from?");
        String country = scan.nextLine();

        System.out.println("Your information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + userName);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
        System.out.println("Thank you for joining JavaGram!");

        scan.close();
    }
}