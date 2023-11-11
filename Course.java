import java.util.Scanner;
import java.util.ArrayList; 
public class Course 
{
    private String courseCode;
    private String courseName;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private int[] marks = {80, 90, 75, 85}; 
    public Course(String courseCode, String courseName)
    {
        this.courseCode = courseCode;
        this.courseName = courseName; 
        modules.add(new Module("Maths", "CO001" , marks[0]));
        modules.add(new Module("Project management", "CO002", marks[1]));
        modules.add(new Module("IT consultancy", "CO003", marks[2])); 
        modules.add(new Module("Linear Algebra", "CO004", marks[3]));
    }

    public  String getcourseName()
    {
        return courseName; 
    }
    public String getcourseCode()
    {
        return courseCode;
    }

    public void setcourseName(String courseName)
    {
        this.courseName = courseName; 
    }

    public void setcourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }
    public void coursePrint()
    {
        System.out.println("This is what you will be learning on the course:");
        for(Module i : modules)
        {  
            System.out.println("module " + i.getmoduleName() + " code " + i.getmoduleCode() + " marks " + i.getMarks());   
        } 
        
    }
    public static void main(String[]args)
    {
        
       
        Scanner scanner = new Scanner(System.in); 

        System.out.println("What is the name of your course");

        String courseName = scanner.nextLine(); 
        
        System.out.println("What is the code of your course"); 

        String courseCode = scanner.nextLine(); 

        Course course = new Course(courseCode, courseName); 
        
        System.out.println("This is your course name: " + course.getcourseName()); 
        
        System.out.println("This is your course code: "+ course.getcourseCode());
        
        
        course.coursePrint(); 
        Scanner scanner1 = new Scanner(System.in);
        Student.print(scanner1); 
        scanner.close();
    }
}
