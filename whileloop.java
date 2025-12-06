// while loops in java

public class whileloop{
    public static void main(String a[]){
        int i = 1;
        // // Print numbers from 1 to 5 using while loop
        // while(i <= 5){
        //     System.out.println("hi " + i);
        //     i++;
        // }
        // System.out.println("Buy " + i);
        while (i<=4){
            System.out.println("Hello " + i);
            int j = 1;
            while (j<=3){
                System.out.println("Hi " + j);
                j++;
            }
            i++;
        }
    }
}