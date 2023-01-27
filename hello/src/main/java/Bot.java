import java.util.Scanner;

/**
 *
 * @author hfeild
 */
public class Bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, issue;
        
        System.out.print("Hi, my name is Bot. What's yours?\n> ");
        name = scanner.nextLine();
        System.out.print("Nice to meet you, "+ name +
                ". What can I help you with today?\n> ");
        issue = scanner.nextLine();
        System.out.println("Sorry, I'm not sure how to help you with that. Maybe ask ChatGPT.");
    }
}
