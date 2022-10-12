import java.util.Scanner;

public class Day2 {

    private static final int MAX_ALLOWED_ATTEMPTS = 3;

    public static void main(String[] args) {
        int attempts = 1;
        //test
        String[] stringInputs = {"", "", ""};
        int[] numberInputs = {0, 0, 0};

        while (attempts <= MAX_ALLOWED_ATTEMPTS) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Give an element: " + ". This is " + attempts + ". attempt.");
            String userInput = scanner.nextLine();

            int number = 0;
            String input = "";
            boolean itIsNotANumber = false;

            try {
                number = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                itIsNotANumber = true;
            }

            if (!itIsNotANumber) {
                numberInputs[attempts-1] = number;
            } else {
                stringInputs[attempts-1] = userInput;
            }

            attempts++;
        }

        // after looping print all the arrays

        String strings = "";
        int numbers = 0;
        StringBuilder stringB = new StringBuilder();

        for (String s : stringInputs) {
            // strings = strings + s, the same as: strings += s  -->   immutable
            stringB.append(s);  // mutable
        }
        for (int i : numberInputs) {
            numbers += i;
        }

        System.out.println(stringB);
        System.out.println(numbers);
    }
}