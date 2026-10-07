import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        printTitle("User1");
        
        
        String[] catalog = {
            "Dua Lipa - Levitating",
            "The Weeknd - Blinding Lights",
            "Olivia Rodrigo - Drivers License",
            "Harry Styles - As It Was",
            "Glass Animals - Heat Waves",
            "The Kid LAROI & Justin Bieber - Stay",
            "Miley Cyrus - Flowers",
            "Sabrina Carpenter - Espresso",
            "Billie Eilish - BIRDS OF A FEATHER",
            "Benson Boone - Beautiful Things"
        };

        Scanner in = new Scanner(System.in);

        for (int i = 0 ; i < catalog.length; i++) {
            System.out.println((i + 1) + " " + catalog[i]);
        }

        while (true) {
        System.out.println("Enter song number: (press 0 to quit)");
        int userInput1 = Integer.parseInt(in.nextLine());

        
        if (userInput1 == 0) {
            break;
        } else {
            System.out.println("Playing song: " + catalog[userInput1 - 1]);
        }
        }
    }
        static void printTitle(String name) {
        String title = name + "'s Playlist";
        System.out.println(title);

        for (int i = 0; i < title.length(); i++) {
        System.out.print("-");
        }
        System.out.println();
}
        
}

