import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aMin = scanner.nextInt();
        int bMax = scanner.nextInt();
        int hActual = scanner.nextInt();

        if (hActual <= bMax && hActual >= aMin) {
            System.out.println("Normal");
        } else if (hActual > bMax) {
            System.out.println("Excess");
        } else if (hActual < aMin) {
            System.out.println("Deficiency");
        }
    }
}