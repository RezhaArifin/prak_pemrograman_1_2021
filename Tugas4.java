import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner rezha = new Scanner(System.in);

        System.out.println("Masukan nilai a : ");
        double a = rezha.nextDouble();
        System.out.println("masukan nilai b : ");
        double b = rezha.nextDouble();

        double hasil1= a + b;
        System.out.println("Hasil a + b = " + hasil1);
        double hasil2= a - b;
        System.out.println("Hasil a - b = " + hasil2);
        double hasil3= a / b;
        System.out.println("Hasil a / b = " + hasil3);
        double hasil4= a * b;
        System.out.println("Hasil a * b = " + hasil4);
        double hasil5= a % b;
        System.out.println("Hasil a % b = " + hasil5);
    }
}
