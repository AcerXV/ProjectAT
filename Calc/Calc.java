public class Calc {
    //instance variables
    private double num1;
    private double num2;

    //constructor
    public Calc() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    //getter method
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //setter method
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //adding numbers method
    public double add() {
        return num1 + num2;
    }

    //subrtact method
    public double subtract() {
        return num1 - num2;
    }

    //multiply numbers
    public double multiply() {
        return num1 * num2;
    }

    //divide numbers
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number if its an error
        }
    }

    public String toString() {
        return "Displaying private data fields using toString():\n" +
                "Num1: " + num1 + "\n" +
                "Num2: " + num2;
    }
}
