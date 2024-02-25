package ASDJobsheet2;

public class Buku05 {
    String judul, pengarang;
    int halaman, stok, harga, bayar, total, diskon;

    void tampilInformasi() {
        System.out.println("Judul                   : " + judul);
        System.out.println("Pengarang               : " + pengarang);
        System.out.println("Jumlah halaman          : " + halaman);
        System.out.println("Sisa stok               : " + stok);
        System.out.println("Harga buku              : " + harga);
        System.out.println("Harga total pembelian   : " + total);
        System.out.println("Diskon pembelian        : " + diskon);
        System.out.println("Harga bayar             : " + bayar);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        total = harga * jml;
        return total;
    }

    int hitungDiskon() {
        if (total > 150000) {
            diskon += total * 0.12;
        } else if (total >= 75000 || total <= 150000) {
            diskon  += total * 0.05;
        }
        return diskon;
    }

    int hitungHargaBayar () {
        bayar = total - diskon;
        return bayar;
    }

    public Buku05() {

    }

    public Buku05(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
}
