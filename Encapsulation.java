class human{
    private int age;
    private String name; 

    // For private varriables we use methods to access them
    
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation{
    public static void main(String a[]){
        human obj = new human();
        //obj.age = 25; // This will give an error because age is private
        //obj.name = "Yash"; // This will give an error because name is private

        obj.setAge(25);
        obj.setName("Yash");
        
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());

    }
}