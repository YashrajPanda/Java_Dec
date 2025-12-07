class Student {
    String name;
    int age;
    int marks;
}

public class advancefor {
    public static void main(String a[]) {

        Student s1 = new Student();
        s1.name = "Ritam";
        s1.age = 21;
        s1.marks = 95;

        Student s2 = new Student();
        s2.name = "Sayandeep";
        s2.age = 22;
        s2.marks = 85;

        Student s3 = new Student();
        s3.name = "Yash";
        s3.age = 20;
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Using advanced for loop to iterate through the array 
        for (Student stu : students) {
            System.out.println(
                stu.name + " : " +
                stu.age + " : " +
                stu.marks
            );
        }
    }
}
