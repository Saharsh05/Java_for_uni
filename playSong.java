import java.util.InputMismatchException;
import java.util.Scanner;


public class playSong
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        mp4 playMp4 = new mp4(); 

       System.out.println("Welcome to the Music Player"); 
       System.out.println(""); 
       System.out.println("Choose from the options below: ");  
      
        int answer = 0;

        do{

        System.out.println("Press 1 if you want to add a song"); 
        System.out.println("Press 2 if you want to remove a song");
        System.out.println("Press 3 if you want to enter in a minimum number off streams");
        System.out.println("Press 4 if you want to print all the songs");
        System.out.println("Press 6 to exit the system"); 
       
        if (scanner.hasNext())
        {
             answer = scanner.nextInt(); 
             
            
             
            
        }else
       {
          
            throw new InputMismatchException("Invalid input. Please enter a number.");
            
        } 
       

        switch(answer)
        {
            case 1:  playMp4.addSong(); 
                String answer5;
                answer5 = "";
                do
                {
                    scanner.nextLine();
                    System.out.println("Do you want to add another song"); 
                    if(scanner.hasNext())  
                    {

                    
                        answer5 =  scanner.nextLine(); 
                    
                        if(answer5.equals("yes"))
                        {
                        playMp4.addSong(); 
                        System.out.println("The song has been added successfully"); 
                          }
                    }
                }while(answer5.equals("yes")); 
                break; 

            case 2: playMp4.removeSong(); 
                    String answer6; 

                    do
                    {
                        scanner.nextLine();
                        System.out.println("Do you want to remove another song?"); 
                        answer6 = scanner.nextLine();

                        if(answer6.equals("yes"))
                        {
                            playMp4.removeSong();
                            System.out.println("This song was removed successfully"); 

                           
                        }
                    }while(answer6.equals("yes")); 
                    break; 
            case 3: 
                    playMp4.givenPlays(scanner);
                    String answer7; 
                
                    do {
                        playMp4.givenPlays(scanner);
                        System.out.println("Do you want to enter in a minimum number of streams again?");
                        answer7 = scanner.nextLine();
                    } while (answer7.equalsIgnoreCase("yes"));

            case 4: playMp4.printSong(); 
            break; 

            case 5: System.out.println("invalid response"); 
            break; 
            case 6: System.out.println("The application has been exited successfully!"); 
        } 
           

    }while(answer != 5 && answer != 6); 

    scanner.close();

    }
}

