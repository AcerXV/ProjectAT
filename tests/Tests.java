import java.util.Scanner;

public class Tests {
    private double ave;   //saves the average of test scores
    private int count;    //saves the number of test scores entered
    private int score;    //saves the current test score

    //constructor
    public Tests() {
        ave = 0.0;
        count = 0;
        score = 0;
    }

    //method to get test scores and get the average
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tempScore;

        System.out.println("Enter test scores (-1 to quit):");
        
        while (true) {
            System.out.print("Enter a test score: ");
            tempScore = scanner.nextInt();

            if (tempScore == -1) {
                break;
            }

            sum += tempScore;
            count++;
        }

        scanner.close();

        //avoids dividing by 0
        if (count > 0) {
            ave = (double) sum / count;
        } else {
            ave = Double.NaN; // Not a Number if nothing was entered
        }
    }

    //Getter for average
    public double getAve() {
        return ave;
    }

    //Getter for count
    public int getCount() {
        return count;
    }

    //Getter for score
    public int getScore() {
        return score;
    }

    //Setter for score
    public void setScore(int newScore) {
        this.score = newScore;
    }

    //toString method to show results
    public String toString() {
        return "The average of the " + count + " scores entered is " + String.format("%.2f", ave);
    }
}
