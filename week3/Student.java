public class Student
{
    private double gpa;
    private String studentID;
    private String name;
    private int age;

    public Student(String name, String studentID, int age)
    {
        this.gpa = 0.0;
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }
    public static void main(String[] args)
    {
        Student nick = new Student("Adolf", "69696969", 420);
        System.out.println(nick);
    }
}

