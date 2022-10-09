import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String country = scan.next();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String planet = scan.next();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String type = scan.next();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        scan.nextLine();
        String character = scan.next();

        int score = 0;

        if (country.equalsIgnoreCase("c")) {
            score += 5;
        }

        if (planet.equalsIgnoreCase("a")) {
            score += 5;
        }

        if (type.equalsIgnoreCase("d")) {
            score += 5;
        }

        if (character.equalsIgnoreCase("a") || character.equalsIgnoreCase("b")) {
            score += 5;
        }
        
        System.out.println("\nYour final score is: " + score + "/20");

        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score < 15 && score >= 5) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time.");
        }

        scan.close();
    }
}