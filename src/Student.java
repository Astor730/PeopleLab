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
    /**
     * @return the GPA
     */
    public double getGPA(){
        return GPA;
    }
    /**
     * @returnthe age of the student
     */
    public int getage(){
        return age;
    }
    /**
     * @return the grade the studdent is in
     */
    public int getgrade(){
        return grade;
    }
    public String toString(){
        return getFamilyName()+","+getFirstName();
    }
}
