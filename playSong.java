import java.util.Scanner;
/*public class playSong { 
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
}*/

public class playSong
{
    public static void main(String[]args)
    {
        mp4 playMp4 = new mp4(); 

        Scanner scanner = new Scanner(System.in); 
        int answer; 
        int answer2; 
        int answer3; 
        int answer4; 

        do
        {
            System.out.println("Press 1 if you want to add a song"); 
             answer = scanner.nextInt(); 
            System.out.println("Press 2 if you want to remove a song");
             answer2 = scanner.nextInt();  
            System.out.println("Press 3 if you want to enter in a minimum number off streams");
             answer3 = scanner.nextInt();  
            System.out.println("Press 4 if you want to print all the songs");
            answer4 = scanner.nextInt();  

            if(answer == 1)
            {
                playMp4.addSong(); 
                String answer5;

                do
                {
                    System.out.println("Do you want to add another song"); 

                    answer5 =  scanner.nextLine(); 

                    if(answer5.equals("yes"))
                    {
                        playMp4.addSong(); 
                        System.out.println("The song has been added successfully"); 
                    }
                }while(answer5.equals("yes")); 

            }

            if(answer2 == 2)
                {
                    playMp4.removeSong(); 
                    String answer6; 

                    do
                    {
                        System.out.println("Do you want to remove another song?"); 
                        answer6 = scanner.nextLine();

                        if(answer6.equals("yes"))
                        {
                            playMp4.removeSong();

                            System.out.println("The song has been successfully removed"); 
                        }
                    }while(answer6.equals("yes")); 
                }

            if(answer3 == 3)
            {
                playMp4.givenPlays();
            }

            if(answer4 == 4)
            {
                playMp4.printSong();
            }
        }while(answer == 1 || answer2 == 2 || answer3 == 3 || answer4 == 4);

        scanner.close();
    }
    
}
