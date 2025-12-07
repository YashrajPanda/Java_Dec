public class array2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Ritam";
        s1.marks = 95;

        Student s2 = new Student();
        s2.roll = 102;
        s2.name = "Sayandeep";
        s2.marks = 85;

        Student s3 = new Student();
        s3.roll = 103;
        s3.name = "Yash";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < 3; i++) {
            System.out.println(
                students[i].roll + " " +
                students[i].name + " " +
                students[i].marks
            );
        }
    }
}

class Student {
    int roll;
    String name;
    int marks;
}

