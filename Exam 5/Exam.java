public class Exam extends Assessment {
    //number of questions on exam
    private int numQuestions;
    //number of questions the student missed
    private int numMissed;
    //points each question is worth
    private double pointsEach;


    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;
        
        //gets the score and set it using setScore method
        int score = (int) Math.round(100 - (missed * pointsEach));
        setScore(score);
    }

   
    public int getPointsEach() {
        return (int) pointsEach;
    }

    //gets the number of missed questions.
    public int getNumMissed() {
        return numMissed;
    }
}
