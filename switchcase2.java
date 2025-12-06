public class switchcase2 {
    public static void main(String[] a) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("It's a weekend!");
                break;

            default:
                System.out.println("Regular weekday");
        }
    }
}