import java.util.Scanner;

public class bbm {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Harga per liter untuk masing-masing jenis BBM
    final double HARGA_PERTAMAX = 10.000; // Harga per liter Pertamax
    final double HARGA_PERTALITE = 7.000; // Harga per liter Pertalite
    double hargaPerLiter = 0;
    double diskon = 0;

    // Menampilkan pilihan BBM
    System.out.println("Pilih jenis BBM:");
    System.out.println("1. Pertamax");
    System.out.println("2. Pertalite");

    // Meminta input dari pengguna
    System.out.print("Masukkan pilihan jenis BBM : ");
    int pilihan = scanner.nextInt();

    // Menentukan harga per liter berdasarkan pilihan
    switch (pilihan) {
      case 1:
        hargaPerLiter = HARGA_PERTAMAX;
        System.out.println("Anda memilih Pertamax.");
        break;
      case 2:
        hargaPerLiter = HARGA_PERTALITE;
        System.out.println("Anda memilih Pertalite.");
        break;
      default:
        System.out.println("Pilihan tidak valid.");
        scanner.close();
        return;
    }

    // Meminta jumlah liter yang ingin dibeli
    System.out.print("Masukkan jumlah liter yang ingin dibeli: ");
    double jumlahLiter = scanner.nextDouble();

    // Menghitung total harga sebelum diskon
    double totalHarga = hargaPerLiter * jumlahLiter;

    // Menghitung diskon jika jumlah liter lebih dari 25
    if (jumlahLiter > 15) {
      diskon = 0.10; // Diskon 5%
    }

    // Menghitung total harga setelah diskon
    double totalHargaSetelahDiskon = totalHarga * (1 - diskon);

    // Menampilkan hasil
    System.out.printf("Total harga sebelum diskon: Rp %.2f%n", totalHarga);
    System.out.printf("Diskon: %.0f%%%n", diskon * 100);
    System.out.printf("Total harga setelah diskon: Rp %.2f%n", totalHargaSetelahDiskon);

    scanner.close();

    // refrensi dari ai dan di ubah2

  }
}