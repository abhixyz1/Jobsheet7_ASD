

/**
 * @author Abhinaya
 */

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack20 stk = new Stack20(5);

        Scanner sc = new Scanner(System.in);

        char pilih;

        do {
            System.out.println("===========================");
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("===========================");

            System.out.print("Masukkan Pilihan : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    do {
                        System.out.print("Masukkan Jenis\t: ");
                        String jenis = sc.next();
                        System.out.print("Masukkan Warna\t: ");
                        String warna = sc.next();
                        System.out.print("Masukkan Merk\t: ");
                        String merk = sc.next();
                        System.out.print("Masukkan Ukuran\t: ");
                        String ukuran = sc.next();
                        System.out.print("Masukkan Harga\t: ");
                        double harga = sc.nextDouble();

                        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)?");
                        pilih = sc.next().charAt(0);
                        stk.push(p);
                    } while (pilih == 'y');
                    break;

                case 2:
                stk.pop();
                break;

                case 3:
                stk.peek();
                break;

                case 4:
                stk.print();
                stk.getMax();
                break;

                default:
                System.out.println("Pilihan Tidak Tersedia");
                break;
            } if (pilihan == 5) {
                pilih = 'n';
            } else {
                System.out.print("Kembali ke Menu utama (y/n)?");
                pilih = sc.next().charAt(0);
            }
        } while (pilih == 'y');
    }
}
