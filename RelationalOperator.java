// Relational Operator in java

class RelationalOperator {

    public static void main(String args[]) {
        int a = 15;
        int b = 10;

        // Greater than
        boolean isGreater = a > b;
        System.out.println("Is a greater than b? " + isGreater);

        // Less than
        boolean isLess = a < b;
        System.out.println("Is a less than b? " + isLess);

        // Greater than or equal to
        boolean isGreaterOrEqual = a >= b;
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);

        // Less than or equal to
        boolean isLessOrEqual = a <= b;
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);

        // Equal to
        boolean isEqual = a == b;
        System.out.println("Is a equal to b? " + isEqual);

        // Not equal to
        boolean isNotEqual = a != b;
        System.out.println("Is a not equal to b? " + isNotEqual);
    }
}