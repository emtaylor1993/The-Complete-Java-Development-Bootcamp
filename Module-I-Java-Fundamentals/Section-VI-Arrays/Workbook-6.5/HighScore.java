public class HighScore {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumber();
            System.out.print(numbers[i] + " ");
        }

        int highScore = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highScore) {
                highScore = numbers[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }

    /**
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    public static int randomNumber() {
        double randomNumber = Math.random() * 50000;
        return (int) randomNumber;
    }
}