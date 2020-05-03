package operations;

import model.SchoolYear;
import model.Student;
import model.Teacher;

import java.time.LocalDate;
import java.util.Scanner;

public class Execution {

    private static Student[] students;

    private static Teacher[] teachers;

    private static SchoolYear[] schoolYears;

    private static Scanner scanner;

    public static void main(String ...args){

        run();
    }

    private static void run(){

        initialize();

        boolean execution = true;

        while (execution){

            menu();

            int menuChoice = menuChoice();

            switch (menuChoice){

                case 1:
                    allStudents();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    execution = false;
                    System.out.println("Τερματισμός Προγράμματος");
                    break;
            }
        }
    }

    private static void initialize(){

        students = initStudents(100);
        fillStudentsTable();

        teachers = initTeachers(100);
        fillTeachersTable();

        schoolYears = initSchoolYears(100);
        fillSchoolYearsTable();

        scanner = new Scanner(System.in);
    }

    private static Student[] initStudents(int length){
        return new Student[length];
    }

    private static Teacher[] initTeachers(int length){
        return new Teacher[length];
    }

    private static SchoolYear[] initSchoolYears(int lentgh){
        return new SchoolYear[lentgh];
    }

    private static Student buildStudent(Integer id, String fullName, String dateOfBirth){
        return new Student(id, fullName, LocalDate.parse(dateOfBirth));
    }

    private static Teacher buildTeacher(Integer id, String fullName, Long insuranceNumber){
        return new Teacher(id, fullName, insuranceNumber);
    }

    private static SchoolYear buildSchoolYear(Integer year, Student[] preToddlers, Teacher preToddlersTeacher,
                                              Student[] toddlers, Teacher toddlersTeacher){
        return new SchoolYear(year, preToddlers, preToddlersTeacher, toddlers, toddlersTeacher);
    }

    private static void fillStudentsTable(){

        Student student1 = buildStudent(1, "Chris Stamatopoulos", "2003-04-17");
        students[0] = student1;

        Student student2 = buildStudent(2, "Andreas Patsimas", "2004-02-16");
        students[1] = student2;

        Student student3 = buildStudent(3, "Sotiris Patsimas", "2004-05-08");
        students[2] = student3;

        Student student4 = buildStudent(4, "Chris Bolosis", "2005-07-17");
        students[3] = student4;

        Student student5 = buildStudent(5, "Tasos Bolosis", "2005-09-17");
        students[4] = student5;

        Student student6 = buildStudent(6, "Andriana Bolosi", "2005-02-28");
        students[5] = student6;

        Student student7 = buildStudent(7, "Vasilis Kamarados", "2004-07-12");
        students[6] = student7;

        Student student8 = buildStudent(8, "Michalis Fotis", "2004-09-07");
        students[7] = student8;

        Student student9 = buildStudent(9, "Giorgos Papaloukas", "2003-05-05");
        students[8] = student9;

        Student student10 = buildStudent(10, "Dimitris Bozinakis", "2005-11-30");
        students[9] = student10;

        Student student11 = buildStudent(11, "Kostas Papathanakos", "2005-07-17");
        students[10] = student11;

        Student student12 = buildStudent(12, "Giannis Boutsikakis", "2003-01-20");
        students[11] = student12;

        Student student13 = buildStudent(13, "Andreas Spuridakis", "2004-11-22");
        students[12] = student13;

        Student student14 = buildStudent(14, "Babis Gerles", "2005-10-19");
        students[13] = student14;

        Student student15 = buildStudent(15, "Spyros Milas", "2003-04-13");
        students[14] = student15;

        Student student16 = buildStudent(16, "Christos Vafeiadis", "2003-10-25");
        students[15] = student16;

        Student student17 = buildStudent(17, "Spyros Skafidas", "2005-07-17");
        students[16] = student17;

        Student student18 = buildStudent(18, "Giannis Manis", "2004-06-05");
        students[17] = student18;

        Student student19 = buildStudent(19, "Nektarios Politakos", "2004-03-23");
        students[18] = student19;

        Student student20 = buildStudent(20, "Konstantina Prinianaki", "2005-02-11");
        students[19] = student20;
    }

    private static void fillTeachersTable(){

        Teacher teacher1 = buildTeacher(1, "Petros Hardavelas", 11129201868L);
        teachers[0] = teacher1;

        Teacher teacher2 = buildTeacher(2, "Grigoris Galanis", 16029301757L);
        teachers[1] = teacher2;

        Teacher teacher3 = buildTeacher(3, "Roula Koromila", 18019001549L);
        teachers[2] = teacher3;
    }

    private static void fillSchoolYearsTable(){

        SchoolYear previousSchoolYear = buildSchoolYear(
                2019,
                new Student[]{students[1], students[2], students[6], students[7], students[12], students[17], students[18]},
                teachers[2],
                new Student[]{students[0], students[8], students[11], students[14], students[15]},
                teachers[0] );
        schoolYears[0] = previousSchoolYear;

        Student[] preToddlers = new Student[20];
        preToddlers[0] = students[3];
        preToddlers[1] = students[4];
        preToddlers[2] = students[5];
        preToddlers[3] = students[9];
        preToddlers[4] = students[10];
        preToddlers[5] = students[13];
        preToddlers[6] = students[16];
        preToddlers[7] = students[19];

        Student[] toddlers = new Student[20];
        toddlers[0] = students[1];
        toddlers[1] = students[2];
        toddlers[2] = students[6];
        toddlers[3] = students[7];
        toddlers[4] = students[12];
        toddlers[5] = students[17];
        toddlers[6] = students[18];

        SchoolYear currentSchoolYear = buildSchoolYear(2020, preToddlers, teachers[2], toddlers, teachers[1]);
        schoolYears[1] = currentSchoolYear;
    }

    private static void menu(){

        System.out.println(
                "~~~~~~~~~~ Μενού Επιλογών ~~~~~~~~~~ \n" +
                "1. Εκτύπωση όλων των μαθητών που έχουν φοιτήσει στο σχολείο\n" +
                "2. Εγγραφή νέου μαθητή στην τρέχουσα σχολική χρονιά\n" +
                "3. Διαγραφή μαθητή από την τρέχουσα σχολική χρονιά\n" +
                "4. Αναζήτηση στοιχείων σχολικής χρονιάς\n" +
                "5. Αναζήτηση τάξεων που έχει αναλάβει κάθε δάσκαλος του σχολείου\n" +
                "6. Αναζήτηση στοιχείων δασκάλου μέσω ΑΜΚΑ\n" +
                "7. Έξοδος\n" +
                "    Εισάγετε επιλογή [1-7] :" );
    }

    private static int menuChoice(){

        int choice = 0;

        while (choice < 1 || choice > 7) {
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
                System.out.println("Μη έγκυρη τιμή");
            }
            if (choice < 1 || choice > 7) {
                System.out.println("Εισάγετε επιλογή [1-7] :");
            }
        }

        return choice;
    }

    private static void allStudents(){

        for (int i = 0; i < students.length; i++){
            if(students[i] != null)
                System.out.println(students[i]);
        }

        while (true){

            System.out.println("\nΠιέστε '0' για να πάτε πίσω στο μενού επιλογών");

            String back = scanner.next();

            if(back.equals("0"))
                break;
        }
    }
}
