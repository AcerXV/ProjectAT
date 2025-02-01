public class Tests {
    public static void main(String[] args) {
        // Make the variables for the scores
        double score1 = 88.2;
        double score2 = 78.9;
        double score3 = 97.6;

        // Calcualate the average test score
        double average = (score1 + score2 + score3) / 3;

        // Display the results
        System.out.println("Test Score 1: " + score1);
        System.out.println("Test Score 2: " + score2);
        System.out.println("Test Score 3: " + score3);
        System.out.println("The average of 3 test scores is: " + String.format("%.2f", average));
    }
}
