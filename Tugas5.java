import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner sumar = new Scanner(System.in);
        System.out.print("Masukan Nilai IPK Anda  = ");
        double IPK = sumar.nextDouble();
        System.out.print("Berapa Tahun Anda Studi Di Sini = ");
        int studi = sumar.nextInt();
        if (IPK >= 3.51 && IPK <= 4 && studi <= 4) {
            System.out.print("Selamat Anda Lulus Summa Cumlaude Dengan IPK = " + IPK + " Dengan Studi Selama " + studi + " Tahun");
        
        } else if (IPK >= 3.51 && IPK <= 4 ) {
            System.out.print("Selamat Anda Lulus Cumlaude Dengan IPK = " + IPK);
        
        } else if (IPK >= 3.01 && IPK < 3.51) {
            System.out.print("Selamat Anda Lulus Sangat Memuaskan Dengan IPK = " + IPK);
        
        } else if (IPK >= 2.76 && IPK < 3.01) {
            System.out.print("Selamat Anda Lulus Memuaskan Dengan IPK = " + IPK);
        
        } else if (IPK >= 2.00 && IPK < 2.76) {
            System.out.print("Selamat Anda lulus Cukup Memuaskan Dengan IPK = " + IPK);
        
        } else if (IPK < 2.00) {
            System.out.print("Mohon Maaf Anda Tidak Lulus Dengan IPK = " + IPK);
            System.out.print(" Tetap Semangat Dan Jangan Menyerah !!!");
        
        } else if  ( IPK > 4 || IPK < 0) {
            System.out.print("Nilai IPK Anda Tidak Valid");
        }
    }
}