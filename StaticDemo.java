class Mobile{
    String brand;
    static String model; // Made static so that it is shared across all instances
    int price;

    public void show(){
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

public class StaticDemo{
    public static void main(String a[]){
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        Mobile.model = "iPhone 13";
        m1.price = 999;
        
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        Mobile.model = "Galaxy S21"; // why Mobile : static variable accessed using class name
        m2.price = 799;

        Mobile m3 = new Mobile();
        m3.brand = "Google";
        Mobile.model = "Pixel 6";
        m3.price = 599;

        
        Mobile.model = "phone"; 

        // System.out.println("Mobile 1: " + m1.brand + " " + m1.model + " $" + m1.price);
        // System.out.println("Mobile 2: " + m2.brand + " " + m2.model + " $" + m2.price);
        // System.out.println("Mobile 3: " + m3.brand + " " + m3.model + " $" + m3.price);

        m1.show();
        m2.show();
        m3.show();
    }
}
