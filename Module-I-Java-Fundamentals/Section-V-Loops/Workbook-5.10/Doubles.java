public class Doubles {
    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }

        System.out.println("You rolled doubles!");
    }

    /**
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */
    public static int rollDice() {
        double randomNumber = 1 + Math.random() * 6;
        int integer = (int) randomNumber;
        return integer;
    }
}