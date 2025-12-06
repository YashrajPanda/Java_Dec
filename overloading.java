// method overloading in java : same method name with different parameters

class MathOperations {
    // method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}
public class overloading {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        int sumTwoInts = mathOps.add(10, 20);
        int sumThreeInts = mathOps.add(10, 20, 30);
        double sumTwoDoubles = mathOps.add(10.5, 20.5);

        System.out.println("Sum of two integers: " + sumTwoInts);
        System.out.println("Sum of three integers: " + sumThreeInts);
        System.out.println("Sum of two doubles: " + sumTwoDoubles);
    }
}