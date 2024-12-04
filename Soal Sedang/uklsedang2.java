import java.util.Scanner;

public class uklsedang2 {
    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
            double phi = 3.14;
            int r, t = 0;

            System.out.println("Masukkan angka pertama");
            r = scanner.nextInt();

            System.out.println("masukkan angka kedua");
            t = scanner.nextInt();

            double volume = phi * r * r * t;

            System.out.println("volume tabung: " + volume);
        }

    }
}
