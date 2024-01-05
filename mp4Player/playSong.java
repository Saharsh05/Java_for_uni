
// trying to improve the code quality thus the change of code

import java.util.InputMismatchException;
import java.util.Scanner;

public class playSong {

    // Constants for menu options
    public static final int addSong = 1;
    public static final int removeSong = 2;
    public static final int enterStreams = 3;
    public static final int printSongs = 4;
    public static final int exit = 6;

    // Main method all code within this will show up on terminal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mp4 playMp4 = new mp4();

        // Welcome messafe and menu options display
        System.out.println("Welcome to the Music Player");
        System.out.println("Choose from the options below:");

        int answer = 0;

        // Loop handling user input. e.g if if statement is true then will be sent to
        // the switch statement to complete user interaction
        do {
            displayMenuOptions();

            try {
                answer = getUserInput(scanner);

                // Handling user input based on the option the user selected
                if (answer >= addSong && answer <= exit) {
                    handleMenu(answer, playMp4, scanner);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }

        } while (answer != exit);

        scanner.close();
    }

    // Method to display menu options
    private static void displayMenuOptions() {
        System.out.println("Press 1 if you want to add a song");
        System.out.println("Press 2 if you want to remove a song");
        System.out.println("Press 3 if you want to enter in a minimum number of streams");
        System.out.println("Press 4 to view playlist");
        System.out.println("Press 6 to exit the system");
    }

    // Method to make sure that the user has inputed in a number
    private static int getUserInput(Scanner scanner) {
        int userInput = 0;

        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
        } else {
            throw new InputMismatchException("Invalid input. Please enter a number.");
        }

        return userInput;
    }

    // Method to handle chosen menu option
    private static void handleMenu(int answer, mp4 playMp4, Scanner scanner) {
        switch (answer) {
            case addSong:
                playMp4.addSong();
                handleAddAnotherSong(playMp4, scanner);
                break;

            case removeSong:
                playMp4.removeSong();
                handleRemoveAnotherSong(playMp4, scanner);
                break;

            case enterStreams:
                playMp4.givenPlays(scanner);
                handleEnterStreamsAgain(playMp4, scanner);
                break;

            case printSongs:
                playMp4.printSong();
                break;

            case exit:
                System.out.println("The application has been exited successfully!");
                break;

            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    // Method to handle adding another song if the user wants to. Added here rather
    // then the switch statement to make code more readable
    private static void handleAddAnotherSong(mp4 playMp4, Scanner scanner) {
        String userResponse;
        do {
            scanner.nextLine();
            System.out.println("Do you want to add another song");
            userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase("yes")) {
                playMp4.addSong();
                System.out.println("The song has been added successfully");
            }
        } while (userResponse.equalsIgnoreCase("yes"));
    }

    // Method to handle the removal od a song upon the users request
    private static void handleRemoveAnotherSong(mp4 playMp4, Scanner scanner) {
        String userResponse;
        do {
            scanner.nextLine();
            System.out.println("Do you want to remove another song?");
            userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase("yes")) {
                playMp4.removeSong();
                System.out.println("This song was removed successfully");
            }
        } while (userResponse.equalsIgnoreCase("yes"));
    }

    // Method to filter through the playlist based on a minimum number of strams
    // again based on the user response
    private static void handleEnterStreamsAgain(mp4 playMp4, Scanner scanner) {
        String userResponse;
        do {
            playMp4.givenPlays(scanner);
            System.out.println("Do you want to enter in a minimum number of streams again?");
            userResponse = scanner.nextLine();
        } while (userResponse.equalsIgnoreCase("yes"));
    }
}
