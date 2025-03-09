import java.util.Scanner;

public class Tests {

    //Private data fields
    private double sum = 0.0;
    private int count = 0;

    //Constructor
    public Tests() {
    }

    //get test scores from the user and calculate the sum
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double score;

        //Prompt the user to input scores, unless -1 is entered
        do {
            System.out.print("Enter a test score (enter -1 to quit): ");
            score = scanner.nextDouble();

            //If the score isn't -1 add it to the sum
            if (score != -1) {
                sum += score;
                count++;
            }

        } while (score != -1);

        scanner.close();
    }

    //return the average score as a string
    public String toString() {
        //If no scores were entered
        double average = (count > 0) ? sum / count : Double.NaN;

        return "The average of the " + count + " scores entered is " + String.format("%.2f", average);
    }
}