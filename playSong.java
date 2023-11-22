import java.util.Scanner;
public class playSong { 
    public static void main(String[]args)
    {
        mp4 playMp4 = new mp4(); 

        Scanner scanner = new Scanner(System.in); 
        String answer;  
       do{
        System.out.println("Do you want to add a song: yes/no"); 

        answer = scanner.nextLine(); 

        if(answer.equals("yes"))
        {
            playMp4.addSong(); 

            System.out.println("your song has been successfully added");
        }
        }while(answer.equals("yes"));  
       
        String answer2; 

        do{
        System.out.println("Do you want to remove a song: yes/no"); 

         answer2 = scanner.nextLine(); 

        if(answer2.equals("yes"))
        {
            playMp4.removeSong(); 

            System.out.println("The song has been successfully removed"); 
        }
        }while(answer2.equals("yes")); 
        
        playMp4.printSong();
        playMp4.givenPlays(); 
        
        System.out.println("Here is the list of your songs: ");
        playMp4.printSong(); 

        scanner.close();
    }
}
