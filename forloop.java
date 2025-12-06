// for loops in java

public class forloop{
    public static void main(String a[]){
        for (int i=0;i<5;i++){
            System.out.println("Hello " + i);
            for (int j=0;j<9;j++){
                System.out.println("     " + (j+8) + "  -  " + (j+9));
            }
        }
    }
}