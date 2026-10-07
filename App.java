import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        
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
        System.out.println("Enter song number: ");
        int userInput1 = Integer.parseInt(in.nextLine());

        
        if (userInput1 == 0) {
            break;
        } else {
            System.out.println("Playing song: " + catalog[userInput1 - 1]);
        }
        }
    }
        
}

