public class EvenOrOdd {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19. 
        for (int i = 0; i <= 19; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }
    }
}