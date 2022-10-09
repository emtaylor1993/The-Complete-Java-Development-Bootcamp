import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.next();

        System.out.println("Great, here are the rules:\n");
        System.out.println(" - If you roll a 6, the game stops.");
        System.out.println(" - If you roll a 4, nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
        scan.next();

        int score = 0;
      
        while (true) {
            int number = randomNumber();
            System.out.println("You rolled a " + number + ".");
            
            if (number == 6) {
                System.out.println("End of game.");
                break;
            } else if (number == 4) {
                System.out.println("Zero points. Keep rolling.");
                scan.next();
            } else {
                score++;
                System.out.println("One point. Keep rolling.");
                scan.next();
            }
        }

        System.out.println("\nYour score is: " + score);

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Touch luck. You lose. :(");
        }

        scan.close();
    }
  
    /**
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */ 
    public static int randomNumber() {
        double randomNumber = 1 + Math.random() * 6;
        int integer = (int) randomNumber;
        return integer;
    }
}