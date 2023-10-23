import java.util.Scanner;

public class NilaiPBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM : ");
        String nim = scanner.nextLine();

        System.out.print("Nilai Tubes: ");
        double nilaitubes = scanner.nextDouble();
        System.out.print("Nilai Quiz : ");
        double nilaiquiz = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaitugas = scanner.nextDouble();
        System.out.print("Nilai UTS  : ");
        double nilaiuts = scanner.nextDouble();
        System.out.print("Nilai UAS  : ");
        double nilaiuas = scanner.nextDouble();

        double totalnilai = (0.3 * nilaitubes) + (0.1 * nilaiquiz) + (0.1 * nilaitugas) + (0.25 * nilaiuts) + (0.25 * nilaiuas);

        System.out.println("Nama  : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + totalnilai);

        scanner.close();

    }
}
