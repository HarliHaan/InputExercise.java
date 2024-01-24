import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);

        String age = scanner.next();
        System.out.println(age + " is a good age to be!");

        }
    }