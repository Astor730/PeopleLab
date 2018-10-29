public class Student extends Person {
    private double GPA;
    private int age;
    private String gender;
    public Student(double GPA, int age, String gender){
        super("","");
        this.GPA= GPA;
        this.age= age;
        this.gender=gender;
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
    public String getgender(){
        return gender;
    }
    public String toString(){
        return getFamilyName()+","+getFirstName();
    }
}
