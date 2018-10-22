public class Teacher extends Person
{
    private String subject;
    private String Title;
    public Teacher (String subject, String Title)
    {
        super("Adam","Smith");
        this.subject = subject;
        this.subject = Title;
    }
    public getSubject() {return subject;}
    public toString() {return Title + ". " + familyName();}
}
