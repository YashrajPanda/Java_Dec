// methods in java

class Calculator {
    // method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }

    // method to multiply two numbers
    int multiply(int a, int b) {
        return a * b;
    }

    // method to divide two numbers
    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

public class method{
    public static void main(String a[]){
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        double quotient = calc.divide(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}