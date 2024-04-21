/**
 * @author Abhinaya
 */
public class dewi2 {
    int size;
    int top;
    dewi data[];

    public dewi2(int size) {
        this.size = size;
        data = new dewi[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(dewi dw) {
        if (!isFull()) {
            top++;
            data[top] = dw;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            dewi dw = data[top];
            System.out.println("Data yang keluar: " + dw.nomorTransaksi + " " + dw.tanggalPembelian + " " +
            dw.namaBarang + " " + dw.hargaBarang + " " + dw.jmlBarang);
            top--;
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas:\n" + data[top].nomorTransaksi + " " +
        data[top].tanggalPembelian + " " + data[top].namaBarang + " " + data[top].hargaBarang +
        " " + data[top].jmlBarang);
    }

    public void print() {
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].nomorTransaksi + " " + data[i].tanggalPembelian + " " +
            data[i].namaBarang + " " + data[i].hargaBarang + " " + data[i].jmlBarang);
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
