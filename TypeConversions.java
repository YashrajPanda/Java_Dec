// Type conversions in Java

class TypeConversions {

    public static void main(String[] args) {
        // Implicit Conversion (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion (int to double): " + doubleValue);

        // Explicit Conversion (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Conversion (double to int): " + anotherIntValue);

        // Converting String to Integer
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        System.out.println("String to Integer: " + parsedInt);

        // Converting Integer to String
        int num = 456;
        String strFromInt = Integer.toString(num);
        System.out.println("Integer to String: " + strFromInt);

        // Converting String to Double
        String strDouble = "45.67";
        double parsedDouble = Double.parseDouble(strDouble);
        System.out.println("String to Double: " + parsedDouble);

        // Converting Double to String
        double dblNum = 89.01;
        String strFromDouble = Double.toString(dblNum);
        System.out.println("Double to String: " + strFromDouble);
    }
}