public class Student extends Person {
    private double GPA;
    public Student(double GPA){
        super("","");
        this.GPA= GPA;
    }
    public double getGPA(){
        return GPA;
    }
    public String toString(){
        return getFamilyName()+","+getFirstName();
    }
}
