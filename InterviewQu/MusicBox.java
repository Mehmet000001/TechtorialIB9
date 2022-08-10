package InterviewQu;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  type of music");
        String typeOfMusic = input.nextLine();
        switch (typeOfMusic) {
            case "classical":
                System.out.println("Please provide name of music: Four seasons, Fur Elise, Finlandia, Vocalise, The Planets");
                String classicalSongs = input.nextLine();
                if (classicalSongs.equalsIgnoreCase("Four seasons") || classicalSongs.equalsIgnoreCase("Fur Elise") ||
                        classicalSongs.equalsIgnoreCase("Finlandia") || classicalSongs.equalsIgnoreCase("Vocalise") ||
                        classicalSongs.equalsIgnoreCase("The Planets")) {
                }
                System.out.println("Please enter $2 for the song");
                int money = input.nextInt();
                if (money >= 2) {
                    System.out.println("Your change is " + (money - 2) + " Enjoy the music");
                } else {
                    System.out.println("You do not have enought money to listen the music" + (2 - money) + "you need");

                }
        }
    }
}
