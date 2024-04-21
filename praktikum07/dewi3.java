/**
 * @author Abhinaya
 */

import java.util.Scanner;
public class dewi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalHarga = 0;

        System.out.println("===================================");
        System.out.println("=====     RIWAYAT BELANJA     =====");
        System.out.println("===================================");
        System.out.print("Masukkan banyak data belanja : ");
        int n = sc.nextInt();
        System.out.println();
        
        dewi2 belanja = new dewi2(n);        

        for (int i = 0; i < n; i++) {
            System.out.println("===================================");
            System.out.print("Nomor Transaksi\t\t: ");
            int nomorTransaksi = sc.nextInt();
            System.out.print("Tanggal Transaksi\t: ");
            sc.nextLine();
            String tanggalTransaksi = sc.nextLine();
            System.out.print("Nama Barang\t\t: ");
            String namaBarang = sc.nextLine();
            System.out.print("Harga Barang\t\t: ");
            double hargaBarang = sc.nextDouble();
            System.out.print("Jumlah Barang\t\t: ");
            double jmlBarang = sc.nextDouble();
            totalHarga = hargaBarang * jmlBarang;
            belanja.push(new dewi(nomorTransaksi, tanggalTransaksi, namaBarang, hargaBarang, jmlBarang));
            System.out.println("Total Harga\t\t: " + totalHarga);
            System.out.println("===================================");
            
            dewi belanja1 = new dewi(nomorTransaksi, tanggalTransaksi, namaBarang, hargaBarang, jmlBarang);
        }

        char pilih;

        do {
            System.out.println("===================================");
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Tampilkan Struk teratas");
            System.out.println("2. Mengambil 5 Struk teratas");
            System.out.println("3. Tampilkan Sisa Struk");
            System.out.println("4. Keluar");
            System.out.println("===================================");

            System.out.print("Masukkan Pilihan : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    belanja.peek();
                    System.out.println("");
                    belanja.print();
                    break;

                case 2:
                    belanja.pop();
                    belanja.pop();
                    belanja.pop();
                    belanja.pop();
                    belanja.pop();
                    break;

                case 3:
                    belanja.print();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            } if (pilihan == 4) {
                pilih = 'n';
            } else {
                System.out.print("Kembali ke Menu utama (y/n)? ");
                pilih = sc.next().charAt(0);
            }
        } while (pilih == 'y');
    }
}
