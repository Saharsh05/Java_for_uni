import java.util.Scanner; 
public class Student 
{
    private int ID;
    private String name; 
    private Course enrollCourse;
    
    public Student( int ID, String name) 
    {
        this.ID = ID; 
        this.name = name;  
           
    }
    public String getname()
    {
        return  name;
    }

    public int getID()
    {
        return ID;
    }
    public void setname(String name)
    {
        this.name = name; 
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void enroll(Course enrollCourse)
    {
        this.enrollCourse = enrollCourse; 
    }

    static void print(Scanner scanner)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your name"); 
        String name = scanner1.nextLine(); 
        System.out.println("What is your ID"); 
        int ID = scanner1.nextInt(); 
    
        System.out.println("What is the name of your course");

        String courseName = scanner.nextLine(); 
        
        System.out.println("What is the code of your course"); 

        String courseCode = scanner.nextLine(); 
        Course enrolledCourse = new Course(courseCode, courseName);
        Student detials = new Student(ID, name);

        System.out.println("Student name:" + detials.getname());
        System.out.println("Student ID:" + detials.getID()); 
        
        System.out.println("Your are enrolled in " + enrolledCourse.getcourseName());

        
    }

    public static void main(String[]args)
    {      
        Scanner scanner1 = new Scanner(System.in);
        Student.print(scanner1);
        scanner1.close(); 
    }

    
}
