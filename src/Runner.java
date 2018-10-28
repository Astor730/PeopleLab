public class Runner {
    static String[] firstNames = {"Bobby", "Joe", "Sharkisha", "Sarah","Devon","Travon", "Sam"};
    static String[] familyNames = {"Smith","Brown","Beaufils","Islam","X","Stamper","Lin"};
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("Math","Ms");
        Student student1 = new Student (3.2,14,10);
        Student student2 = new Student (4.0,17,12);
        Student student3 = new Student(2.7,16,11);
        Student student4 = new Student(3.7, 17,11);
        Student[] students = {student1,student2,student3,student4};
        Teacher classRoom = new Classroom(teacher,students);
        Classroom.printClass();
        System.out.println(Classroom.classAverage());
    }
}
