public class Runner {

    public static void main(String[] args) {
        //represents the Tests class object
        Tests testScores = new Tests();

        //to let users input test scores
        testScores.getAverage();

        //Display the results
        System.out.println(testScores.toString());
    }
}
