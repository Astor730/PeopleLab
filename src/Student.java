public class Student extends Person {
    private double GPA;
    private int age;
    private int grade;
    public Student(double GPA, int age, int grade){
        super("","");
        this.GPA= GPA;
        this.age= age;
        this.grade= grade;
    }
    public double getGPA(){
        return GPA;
    }
    public int getage(){
        return age;
    }
    public int getgrade(){
        return grade;
    }
    public String toString(){
        return getFamilyName()+","+getFirstName();
    }
}
