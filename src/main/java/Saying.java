import java.util.Scanner;

public class Saying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                String[] names = {
                        "Be confident in yourself.",
                        "Live a life of purpose.",
                        "Use your time wisely.",
                        "Hone your skills.",
                        "Learn to speak well and listen better.",
                        "Have fun. You’ll accomplish more.",
                        "Give more than you take.",
                        "You create your own opportunities.",
                        "Happiness is a choice.",
                        "You are never as stuck as you think you are."
                };
                System.out.print("Pick a saying (select #1 - #10): ");
                int index = scanner.nextInt();
                index--;
                System.out.println(names[index]);
            } catch (Exception e) {
                System.out.println("Your number was out of range!");
                e.printStackTrace();
            }
            System.out.println("Would you like to see another saying? (y/n)");
            String input = scanner.nextLine();
            if (input == "n") {
                break;
            }
        }
    }
}
