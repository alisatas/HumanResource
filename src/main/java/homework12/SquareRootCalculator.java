package homework12;

public class SquareRootCalculator {

    public static double calculateSquareRoot(double number) throws InvalidInputException, NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        } else if (Double.isNaN(number)) {
            throw new InvalidInputException();
        } else {
            return Math.sqrt(number);
        }
    }

    public static void main(String[] args) {

        try {
            double result1 = calculateSquareRoot(25.0);
            System.out.println("Square root: " + result1);
        } catch (InvalidInputException | NegativeNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            double result2 = calculateSquareRoot(-9.0);
            System.out.println("Square root: " + result2);
        } catch (InvalidInputException | NegativeNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            double result3 = calculateSquareRoot(Double.NaN);
            System.out.println("Square root: " + result3);
        } catch (InvalidInputException | NegativeNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid input: NaN (Not a Number)";
    }
}

class NegativeNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Cannot calculate square root of a negative number";
    }
}
