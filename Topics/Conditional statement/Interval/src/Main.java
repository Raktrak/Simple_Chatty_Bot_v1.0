import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean wholeTrue1 = -15 < a && a <= 12;
        boolean wholeTrue2 = 14 < a && a < 17;
        boolean wholeTrue3 = 19 <= a;
        if (wholeTrue1 || wholeTrue2 || wholeTrue3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}