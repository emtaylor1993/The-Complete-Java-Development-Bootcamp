public class LotteryTickets {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = {34, 43, 54, 65, 21, 54};

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    }
    
    /**
     * Function name – printTicketNumbers
     * @param ticket ( int[] )
     * 
     * Inside the function:
     *   1.   print the numbers in one line. 
     *        i.e  1 4 6 3 2 6 
     *   2.   print a new line   
     */
    public static void printTicketNumbers(int[] ticket) {
        for (int index = 0; index < ticket.length; index++) {
            System.out.print(ticket[index] + " ");
        }
        System.out.println();
    }
}