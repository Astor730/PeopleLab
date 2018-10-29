public class Runner {
    static String[] firstNames = {"Bobby", "Joe", "Sharkisha", "Sarah", "Devon", "Travon", "Sam"};
    static String[] familyNames = {"Smith", "Brown", "Beaufils", "Islam", "X", "Stamper", "Lin"};
    static double[] GPA = {3.2, 4.0, 2.7, 3.7, 3.9, 3.5, 3.35};
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Computer Science", "Mr");
        Student student1 = new Student (3.2,14,"female");
        Student student2 = new Student (4.0,17,"male");
        Student student3 = new Student(2.7,16,"female");
        Student student4 = new Student(3.7, 17,"male");
        Student[] students = {student1,student2,student3,student4};
        Classroom classRoom = new Classroom(teacher, students);
        System.out.println("The teacher is "+teacher+". The subject is "+teacher.getSubject());
        System.out.println("The class average is " + classRoom.classAverage() + ".");

        System.out.println(Runner.randomstudent());
    }
    public static String randomstudent(){
        String randomFirstname=firstNames[(int)(Math.random()*firstNames.length)];
        String randomFamilyname=familyNames[(int)(Math.random()*familyNames.length)];
        String randomGPA=Double.toString(GPA[(int)(Math.random()*GPA.length)]);
        return(randomFirstname+" "+randomFamilyname+"'s GPA is "+randomGPA);
    }
}