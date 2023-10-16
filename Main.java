
// Lecture one questions 

// Question 1 
/*public class Main 
{public static void main (String[] args)

{ 
    System.out.println("Hello World");
}
}  */

// Question 2 
/*public class Main 
{
    public static void main(String[]args)
    {
        String name = "Saharsh";
        System.out.println("Hello " + name);
    }
}*/

//question 3 
/*import java.util.Scanner; 
public class Main 
{ 
public static void main(String[]args)
{
Scanner scanner = new Scanner(System.in);

System.out.println("Enter length of rectangle");

int length = scanner.nextInt(); 

System.out.println("Enter Height of rectangle"); 

int height = scanner.nextInt(); 

System.out.println("Area of rectangle is " + length * height); 
System.out.println("Perimeter of Rectangle is " +( (2*length) + (2*height)) );



scanner.close();
}

}*/

// Question 4 

/*import java.util.Scanner; 

public class Main 
{ 
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number");

        double numOne = scanner.nextInt();
        
        System.out.println("What is the second number"); 

        double numTwo = scanner.nextInt(); 

        System.out.println("The average of both the numbers is " + ((numOne + numTwo )/2));




       scanner.close(); 
    }


  
}*/

//Question 5 

/*import java.util.Scanner; 

public class Main
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");

        int num1 = scanner.nextInt();

        System.out.println("Enter your second number");

        int num2 = scanner.nextInt();

        System.out.println("Orignal order the numbers were inputed in " + num1 + num2);
        
        System.out.println("Reverse order the numbers were inputed in " + num2 + num1);

        scanner.close();
    }

}*/

//Question 6 

/*import java.util.Scanner; 
public class Main

{
    public static void main(String[]args)
    
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How old are you?");

        int age = scanner.nextInt(); 

        System.out.println("You were born in " + (2023 - age));



       scanner.close();
    }


}*/

// Question 7 

import java.util.Scanner; 
import java.time.LocalDateTime; 
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
public class Main

{
    public static void main(String[]args)
    
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What year were you born in");
        
        int year = scanner.nextInt(); 

        System.out.println("What month were you born in");

        int month = scanner.nextInt(); 

        System.out.println("What day of the month were you born in"); 

        int day = scanner.nextInt(); 

        String dob = day + "-" + month + "-" + year; 

        System.out.println(dob);

     scanner.close(); 
    }
}



// Question 8 

/*import java.util.Scanner; 

public class Main
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in the number of feet"); 

        double feet = scanner.nextDouble(); 

        double miles = feet/5280; 

        System.out.println("Miles: " + miles); 

        scanner.close();
    }
}*/

// Question 9 

/*import java.util.Scanner; 

public class Main

{
    public static void main(String[]args)
    
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much did you put in for deposit");
        
        double depositAmount = scanner.nextDouble(); 

        double intrestAmount = (depositAmount * 0.01) + depositAmount; 
        
        System.out.println("The amount of money after intrest is paid " + intrestAmount);

        scanner.close();



    }
}*/






