# LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA <br> SEARCHING

<p align="center">
<img src="POLINEMA-LOGO.png" width= "300px"> 
<p align="center"> Anya Callissta Chriswantari <br>TI IH/05 <br>2341720234


## 6.2 Percobaan 1

![Percobaan 1](per1_p7.png)
![Percobaan 1](per1_p7%20(2).png)
![Percobaan 1](per1_p7%20(3).png)
![Percobaan 1](per1_p7%20(4).png)

_Gambar 1. Output Buku05.java_

### 6.2.3 Pertanyaan Percobaan 1
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!
    * Break berfungsi untuk menghentikan perulangan setelah kodeBuku yang dicari ditemukan dan variabel posisi diinisialisasi sebagai j
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
    * ![Percobaan 1](no2_per1_p7%20(2).png)
      ![Percobaan 1](no2_per1_p7.png)

      _Gambar 1.1 Output Buku05.java_
      Progam tetap berjalan, karena sequential search tidak memerlukan data yang terurut, setiap elemen akan diperiksa satu per satu secara berurutan sampai elemen yang dicari ditemukan atau sampai semua elemen diperiksa
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti berikut :
``` java
Buku dataBuku = data.FindBuku(cari);
dataBuku.tampilDataBuku(); 
```
* ![Percobaan 1](no3_per1_p7.png)
`
    _Gambar 1.2 Output Method FindBuku Buku05.java_

## 6.3 Percobaan 2

![Percobaan 2](per2_p7.png)

_Gambar 2 Output Buku05.java_

### 6.3.3 Pertanyaan Percobaan 2
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
    * ``` java
         mid = left + (right - left) / 2;
        ```
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
    * ``` java
        if (listBk[mid].kodeBuku > cari) {
            return FIndBinarySearch(cari, left, mid - 1);
        } else {
            return FIndBinarySearch(cari, mid + 1, right);
        }
        ```
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? 
    * ![Percobaan 2](soal3_per2_p7.png)

    _Gambar 2.1 Output Buku05.java_ 
    Pencarian biner memerlukan data yang urut agar dapat membagi rentang pencarian menjadi dua secara efektif
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!
    * ![Percobaan 2](soal4_per2_p7.png)

    _Gambar 2.1 Output Buku05.java_ 
    Hasil tidak sesuai karena data tidak urut secara ascending, harus menambahkan method sorthing
    ``` java
    void bubbleSort() {
            for (int i = 0; i < listBk.length - 1; i++) {
                for (int j = 1; j < listBk.length - i; j++) {
                    if (listBk[j].kodeBuku < listBk[j-1].kodeBuku) {
                        Buku05 tmp = listBk[j];
                        listBk[j] = listBk[j-1];
                        listBk[j-1] = tmp;
                    }
                }
            }
        }
    ```

## 6.4 Percobaan 3

![Percobaan 3](per3_p7.png)

_Gambar 3. Output MergeSorting05.java_

## 6.5 Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Ubah tipe data dari kode Buku yang awalnya int menjadi String
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan sequential search dan binary search.
    * ![latihan praktikum 1](latPrak1_p7.png)
    
    _Gambar 4. Output Buku05.java_
2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Tambahkan method pencarian judul buku menggunakan sequential search dan binary search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga ketika input data acak, maka algoritma searching akan tetap berjalan
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan!
    * ![latihan praktikum 2](tugas2_p7.png)
      ![latihan praktikum 2](tugas2_2_p7.png)
      
    _Gambar 4. Output Buku05.java_