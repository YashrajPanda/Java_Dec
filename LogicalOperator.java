// Logical Operator in java

class LogicalOperator {

    public static void main(String args[]) {
        boolean x = true;
        boolean y = false;

        // Logical AND
        boolean andResult = x && y;
        System.out.println("Logical AND (x && y): " + andResult);

        // Logical OR
        boolean orResult = x || y;
        System.out.println("Logical OR (x || y): " + orResult);

        // Logical NOT
        boolean notX = !x;
        System.out.println("Logical NOT (!x): " + notX);

        boolean notY = !y;
        System.out.println("Logical NOT (!y): " + notY);
    }
}