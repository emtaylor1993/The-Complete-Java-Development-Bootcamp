public class Exams {
    public static void main(String[] args) {
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        String[] students = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};

        for (int index = 0; index < students.length; index++) {
            System.out.println(students[index] + ", you will take seat " + index);
        }
    }
}