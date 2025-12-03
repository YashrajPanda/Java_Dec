// Arithmetic Operations in java

class ArithmeticOperations {

    public static void main(String args[]) {
        int a = 20;
        int b = 10;

        // // Addition
        // int sum = a + b;
        // System.out.println("Addition: " + sum);

        // // Subtraction
        // int difference = a - b;
        // System.out.println("Subtraction: " + difference);

        // // Multiplication
        // int product = a * b;
        // System.out.println("Multiplication: " + product);

        // // Division
        // int quotient = a / b;
        // System.out.println("Division: " + quotient);

        // // Modulus
        // int remainder = a % b;
        // System.out.println("Modulus: " + remainder);

        // Increment
        // Post increment : Fetch the value of a first and then increments it
        int postIncrement = a++;
        System.out.println("Post Increment: " + postIncrement); 

        // Pre increment : Increments b first and then fetches the value
        int preIncrement = ++b;
        System.out.println("Pre Increment: " + preIncrement);
    }
}