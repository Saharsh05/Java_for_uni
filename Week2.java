// Question 1 
/*import java.util.Scanner; 
public class Week2

{
    public static void main(String[]args)
    
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How old are you?");

        int age = scanner.nextInt(); 


        System.out.println("You were born in " + (2023 - age));

        if ( age>= 18)
        
        {
            System.out.println("you are 18 or older"); 
        }




       scanner.close();
    }


}*/ 

// Question 2 

/*import java.util.Scanner; 

public class Week2

{
    public static void main(String[]args)
    
    
{

    Scanner scanner = new Scanner (System.in); 

    System.out.println("What grade did you get achieve?"); 

    char grade = scanner.next().charAt(0);
    
    switch(grade){ 


        case 'F' : System.out.println("This is a fail"); break; 
        case 'D' : System.out.println("This is a pass"); break;
        case 'C' : System.out.println("This is a 2:2"); break;
        case 'B' : System.out.println("This is a 2:1");break;
        case 'A' : System.out.println("This is a first");break;
        default : System.out.println("This is an invalid grade");break;

                

         }

    scanner.close(); 

}
}*/

//Question 3 

/*public class Week2
{
    public static void main(String[]args)
    {

        int count = 0; 
        while(count<=9)
        {
            System.out.println(count);

        count = count + 1; 
        }
    }
}*/

//Question 4 


/*public class Week2

{
    public static void main(String[]args)
    
    {

        for (int i = 1; i <=12; i++ )
        {

            int result = i * 7;

            System.out.println(i + "x 7 = " + result); 
        }
    }
}*/

// Question 5 
/*import java.util.Scanner; 

public class Week2
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in); 

    System.out.println("Pick a number for their timestable");

    int number = scanner.nextInt(); 

    for(int i = 0; i <=12; i++){

        int result = i * number; 

        System.out.println(i + " x " + number + "= " + result);
    }

    scanner.close();
    }
}*/

// Question 6 
import java.util.Scanner; 

public class Week2
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in); 
        boolean restart  = true; 
    do{
        System.out.println("Pick a number for their timestable");

    int number = scanner.nextInt(); 

    for(int i = 0; i <=12; i++)
    {

        int result = i * number; 

        System.out.println(i + " x " + number + "= " + result);
        
    }
    
System.out.println("Do you want to do another timestable? (yes/no)");

String response = scanner.nextLine(); 

restart = response.equals("yes");

}while( restart );

System.out.println("goodbye/ fuck off");
    scanner.close();

}

}




/*public class Week2

{

static void methodName()
{
System.out.println("This is a new method"); 

}
public static void main(String[]args)

{

    methodName(); 
}
}*/



 