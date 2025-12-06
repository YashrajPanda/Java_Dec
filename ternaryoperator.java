// Ternary Operators in java

public class ternaryoperator{
    public static void main(String a[]){
        int n = 5;
        int result = 0;
        
        // if (n % 2 == 0)
        //     result = 10;
        // else
        //     result = 20;
        // System.out.println("Result is: " + result);

        // Using Ternary Operator
        result = (n % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }
}