class Mobile{
    String brand;
    static String model; // Made static so that it is shared across all instances
    int price;

    public void show(){
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
    public static void showInfo(Mobile m1){ // using Mobile m1 we can access instance variables of the passed object
        // brand and price cannot be accessed here as they are instance variables
        // for access the brand write m1.brand
        System.out.println("Brand: " + m1.brand + ", Model: " + model + ", Price: $" + m1.price);
    }
}

public class staticmethod{
    public static void main(String a[]){ // here using static for it access without creating object of the class
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
        
        // pass the m1 object to showInfo method so that it can access instance variables
        Mobile.showInfo(m1); // Calling static method using class name


    }
}

// if we do not use static in main method then we have to create object of staticmethod class to access main method
// public class staticmethod{
//     public void main(String a[]){ // here without static we have to create object of staticmethod class
//         Mobile m1 = new Mobile();
//         m1.brand = "Apple";
//         Mobile.model = "iPhone 13";
//         m1.price = 999;  
