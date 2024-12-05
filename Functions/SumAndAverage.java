public class SumAndAverage {
    
    // Method to calculate the sum and average of three numbers
    public static double[] sumAndAverage(double num1, double num2, double num3) {
        // Calculate the sum
        double totalSum = num1 + num2 + num3;
        
        // Calculate the average
        double average = totalSum / 3;
        
        // Return the sum and average as an array
        return new double[]{totalSum, average};
    }

    public static void main(String[] args) {
        // Example input: Three numbers
        double number1 = 10;
        double number2 = 20;
        double number3 = 30;
        
        // Function call
        double[] result = sumAndAverage(number1, number2, number3);
        
        // Output the result
        System.out.println("Sum: " + result[0]);
        System.out.println("Average: " + result[1]);
    }
}

