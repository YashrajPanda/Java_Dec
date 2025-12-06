// class and object example

class calculator{
    // attributes
    int num1;
    int num2;

    // method to add two numbers
    void add(){
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}

public class classobject2{
    public static void main(String[] args){
        // creating an object of calculator class
        calculator myCalculator = new calculator();
        // setting attributes
        myCalculator.num1 = 10;
        myCalculator.num2 = 20;
        // calling method
        myCalculator.add();
    }
}