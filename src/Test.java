import model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void main(String ...args){

        Student student1 = new Student(1,"hjk", LocalDate.now());
        Student student2 = new Student(2,"and", LocalDate.parse("2000-05-03"));

        //System.out.println(student);

        Long x = 16029301757L; // 11 amka length
        System.out.println(x);

        Student [] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        System.out.println(student2);
    }
}
