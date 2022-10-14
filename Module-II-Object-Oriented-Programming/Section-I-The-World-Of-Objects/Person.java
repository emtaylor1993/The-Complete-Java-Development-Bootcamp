import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    public Person(Person other) {
        this.name = other.name;
        this.nationality = other.nationality;
        this.dateOfBirth = other.dateOfBirth;
        this.passport = Arrays.copyOf(other.passport, other.passport.length);
        this.seatNumber = other.seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     */
    public boolean applyPassport() {
        int randomNumber = (int) Math.random() * 2;
        if (randomNumber == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *  Function name: chooseSeat
     *
     *  Inside the function:
     *    1. Sets this.seat to a random number between 1 -- 11.
     */
    public void chooseSeat() {
        int randomNumber = (int) (1 + Math.random() * 11);
        this.seatNumber = randomNumber;
    }

    public String toString() {
        return "Name: " + this.name + "\n"
        +  "Nationality: " + this.nationality + "\n"
        +  "Date of Birth: " + this.dateOfBirth + "\n"
        +  "Seat Number: " + this.seatNumber + "\n"
        +  "Passport: " + Arrays.toString(this.passport) + "\n";
    }
}
