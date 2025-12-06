class Address {
    String city;
    int pincode;
}

class Student {
    String name;
    int age;
    Address address;   // Student has an Address object (stored in heap)
}

public class StackHeap {

    // ----------- METHOD-1 (creates its own stack frame) -----------
    public static void printStudent(Student s) {
        // s is stored on stack (reference)
        System.out.println("Inside printStudent() - Name: " + s.name);
    }

    // ----------- METHOD-2 (understand stack frame & primitives) -----------
    public static int addNumbers(int a, int b) {
        int result = a + b;  // result stored on stack
        return result;       // returns value (not reference)
    }

    // ----------- MAIN METHOD (starting point of stack) -----------
    public static void main(String[] args) {

        // ---------------- HEAP ALLOCATION ----------------
        Student st1 = new Student();  // st1 reference in stack, object in heap
        st1.name = "Yash";
        st1.age = 20;

        // st1.address stores reference IN THE HEAP to another object IN THE HEAP
        st1.address = new Address();
        st1.address.city = "Mumbai";
        st1.address.pincode = 400001;

        // ---------------- COPY REFERENCE ----------------
        Student st2 = st1;   // BOTH refer to SAME heap object

        st2.name = "Raj";    // Changes SAME heap object → affects st1

        // ---------------- PRIMITIVE VALUES ----------------
        int x = 10;   // stack
        int y = x;    // copy of value
        x = 50;       // does NOT affect y

        // ---------------- METHOD CALL (new stack frame) ----------------
        printStudent(st1);  // reference copied to new frame

        // ---------------- METHOD WITH PRIMITIVES ----------------
        int sum = addNumbers(5, 7);  // new frame created
        System.out.println("Sum = " + sum);

        // ---------------- NEW OBJECT HEAP TEST ----------------
        st1 = new Student(); // old Student object still in heap
                             // but NO reference → eligible for GC

        st1.name = "Aman";

        System.out.println("New st1 name: " + st1.name);
        System.out.println("st2 name (old object): " + st2.name);

        // st2 still points to old heap object (Raj)
    }
}
