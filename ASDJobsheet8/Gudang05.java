package ASDJobsheet8;

public class Gudang05 {
    Barang05[] tumpukan;
    int size, top;
    
    public Gudang05(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang05[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang05 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang05 ambilBarang() {
        if (!cekKosong()) {
            Barang05 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang05 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang05 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang05 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang05 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void cariKodeBarang(int cariKode) {
        if (!cekKosong()) {
            boolean found = false;
            for (int j = 0; j < top + 1; j++) {
                if (tumpukan[j].kode == cariKode) {
                    found = true;
                    System.out.println("Barang dengan kode " + cariKode + " ditemukan");
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[j].kode, tumpukan[j].nama, tumpukan[j].kategori);
                    break;
                }
            } 
            
            if (!found) {
                System.out.println("Barang dengan kode " + cariKode + " tidak ditemukan");
            }

        } else {
            System.out.println("Tumpukan kosong");
        }
    }

    public void cariNamaBarang(String cariNama) {
        if (!cekKosong()) {
            boolean found = false;
            for (int j = 0; j < top + 1; j++) { 
                if (tumpukan[j].nama.equalsIgnoreCase(cariNama)) {
                    found = true;
                    System.out.println("Barang dengan nama " + cariNama + " ditemukan");
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[j].kode, tumpukan[j].nama, tumpukan[j].kategori);
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Barang dengan nama " + cariNama + " tidak ditemukan");
            }
        } else {
            System.out.println("Tumpukan kosong");
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi05 stack = new StackKonversi05();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
