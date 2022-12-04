import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Student student1 = new Student("Lucas", "Leow", 2023,4.61, "Aerospace Engineering" );
    Student student2 = new Student("Jane", "Doe", 2022, 2.8,"Physical Sciences");

    System.out.println(student1.first + " expected Graduation Year: " + student1.performance());
    System.out.println(student2.first + " expected Graduation Year: " + student2.performance());
    }
}
