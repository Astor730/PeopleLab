public class Classroom extends Teacher
{

    private Teacher teacher;
    private Student[]students;
    public Classroom (Teacher teacher, Student[] students)
    {
        super("Math", "Mr.");
        this.teacher=teacher;
        this.students=students;
    }
    double average = 0;
    public double classAverage()
    {
        double x = 0;
        for (int i = 0; i<students.length; i++)
        {
            x = x+ students[i].getGPA();
        }
        return x/students.length;
    }


    public String getSubject() {return teacher.getSubject();}

}
