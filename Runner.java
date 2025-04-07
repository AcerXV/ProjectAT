import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

    public static void main(String[] args)
    {
        String input;     // To hold input
        int questions = 0;    // Number of questions
        int missed = 0;       // Number of questions missed
        boolean validInput = false;

        // Get the number of questions on the exam
        while (!validInput) {
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            try {
                questions = Integer.parseInt(input);
                if (questions <= 0) {
                    throw new ArithmeticException("Questions must be more than 0.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        validInput = false;

        // Get the number of questions the student missed
        while (!validInput) {
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            try {
                missed = Integer.parseInt(input);
                if (missed < 0 || missed > questions) {
                    throw new IllegalArgumentException("Missed questions must be between 0 and " + questions + ".");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        // Create an Exam object
        Exam exam = new Exam(questions, missed);

        // Display the test results
        String message = "Each question counts " + exam.getPointsEach();
        message += " points.\nThe exam score is " + exam.getScore();
        message += "\nThe exam grade is " + exam.getGrade();
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
