import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        while (true) {
        System.out.println("Enter song number: ");
        int userInput1 = Integer.parseInt(in.nextLine());

        
        if (userInput1 == 0) {
            break;
        } else {
            System.out.println("Playing song " + userInput1);
        }
        }
        
    }
}
