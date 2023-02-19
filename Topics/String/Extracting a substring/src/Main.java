import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String language = scanner.next();
        int zero = scanner.nextInt();
        int two = scanner.nextInt();
        String language1 = language.substring(zero, two + 1);
        System.out.println(language1);
        // start coding here
    }
}