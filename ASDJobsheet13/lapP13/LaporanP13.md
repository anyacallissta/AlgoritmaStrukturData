# LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA <br> DOUBLE LINKED LIST  

<p align="center">
<img src="POLINEMA-LOGO.png" width= "300px"> 
<p align="center"> Anya Callissta Chriswantari <br>TI IH/05 <br>2341720234


## 12.2 Percobaan 1
![percobaan 1](per1_p13.png)

_Gambar 1. Output DoubleLinkedListMain.java_

### 12.2.3 Pertanyaan Percobaan 1
1. Jelaskan perbedaan antara single linked list dengan double linked lists!
    * Single linked list hanya bisa menambahkan data di belakang karena tidak memiliki node previous, sedangkan double linked list bisa menambahkan data sebelum dan setelah data yang ada karena memiliki node previous dan next.
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
``` java
public DoubleLinkedList() {
    head = null;
    size = 0;
}
```
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
``` java
Node newNode = new Node(null, item, head);
```
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?
``` java
Node newNode = new Node(current, item, null);
```
7. Pada method add(), terdapat potongan kode program sebagai berikut, jelaskan maksudnya!
``` java
if (current.prev == null) {
    Node newNode = new Node(null, item, current);
    current.prev = newNode;
    head = newNode;
} 
```

## 12.3 Percobaan 2
![percobaan 2](per2_p13.png)

_Gambar 2. Output DoubleLinkedListMain.java_

### 12.3.3 Pertanyaan Percobaan 2
1. Apakah maksud statement berikut pada method removeFirst()?
``` java
head = head.next;
head.prev = null;
```
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove
``` java
Node tmp = head.next;
head.next = tmp.next;
tmp.next.prev = head;
```
4. Jelaskan fungsi kode program berikut ini pada fungsi remove! 
``` java
current.prev.next = current.next;
current.next.prev = current.prev;
```

## 12.4 Percobaan 3
![percobaan 3](per3_p13.png)

_Gambar 3. Output DoubleLinkedListMain.java_

### 12.4.3 Pertanyaan Percobaan 3
1. Jelaskan method size() pada class DoubleLinkedLists!
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
``` java
public boolean isEmpty() {
    if (size == 0) {
        return true;
    } else {
        return false;
    }
}
```
``` java
public boolean isEmpty() {
    return head == null;
}
```

## 12.5 Tugas
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang telah divaksinasi di menu Hapus Data(2) harus ada)
![tugas 1](tugas1_p13.png) 
![tugas 1](tugas1(2)_p13.png) 
![tugas 1](tugas1(3)_p13.png) 
![tugas 1](tugas1(4)_p13.png) 
![tugas 1](tugas1(5)_p13.png)

_Gambar 4. Output Vaksinasi.java_
2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara descending. Class Film wajib diimplementasikan dalam soal ini
