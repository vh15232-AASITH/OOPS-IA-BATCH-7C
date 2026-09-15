import java.util.Scanner;

public class ProblemC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter species name: ");
        String species = sc.nextLine();

        try {
            if (species.isEmpty()) {
                throw new InvalidSpeciesException("Species name cannot be empty");
            }

            System.out.println("Species: " + species);

        } catch (InvalidSpeciesException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidSpeciesException extends Exception {

    InvalidSpeciesException(String message) {
        super(message);
    }
}
