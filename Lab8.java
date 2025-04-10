import java.io.*;
import java.text.DecimalFormat;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        // Create formatter
        DecimalFormat formatter = new DecimalFormat("$###0.00");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Write header to file
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String line;
            boolean isFirstLine = true; // Had an error where it tried to convert header to a double
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                
                if (line.trim().isEmpty()) continue;

                // Split line
                String[] parts = line.split("\t|,");
                if (parts.length != 3) continue;

                String empId = parts[0].trim();
                double payRate = Double.parseDouble(parts[1].trim());
                double hoursWorked = Double.parseDouble(parts[2].trim());

                // Calculate weekly pay
                double overtimeHours = Math.max(0, hoursWorked - 40);
                double baseHours = Math.min(40, hoursWorked);
                double weeklyPay = (baseHours * payRate) + (overtimeHours * payRate * 1.5);

                // Format weekly pay
                String formattedPay = formatter.format(weeklyPay);

                // Write result to file
                String outputLine = empId + "," + payRate + "," + hoursWorked + "," + formattedPay;
                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Success. Check 'output.csv'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
