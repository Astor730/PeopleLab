public class Classroom extends Teacher
{

    private Teacher teacher;
    private Student[]students;
    public Classroom (teacher, students)
    {
        super("Math", "Mr.");
        this.teacher=teacher;
        this.students=students;



    }
    public void getSubject(){getSubject();}

}
