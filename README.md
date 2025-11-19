PERCOBAAN 1

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks
   ke-0? Jelaskan!
   jawab : tidak harus. elemen array bisa diisi pada indeks mana pun selama indeks tersebut valid. namun pengisian berurutan memudahkan membaca dan menghindari kesalahan.

2. Mengapa terdapat null pada daftar penonton?
   jawab : Karena elemen array belum diisi. Secara default, tipe data String bernilai null ketika belum diberikan nilai.

3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
   jawab : sudah

4. Tambahkan kode program sebagai berikut:
   Jelaskan fungsi dari penonton.length dan penonton[0].length!
   Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan
   penonton[3].length memiliki nilai yang sama? Mengapa?
   jawab : fungsi penonton.length dan penonton[0].length
   penonton.length → jumlah baris (row) dalam array.
   penonton[0].length → jumlah kolom pada baris ke-0.
   apakah semua penonton[i].length sama?
   iya, karena array dibuat dengan ukuran 4 baris × 2 kolom, sehingga setiap baris memiliki panjang kolom yang sama, yaitu 2.

5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris
   pada array menggunakan for loop. Compile, run, lalu amati hasilnya. 
   jawab : sudah 

6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris
   pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
   jawab : sudah

7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3
   menggunakan for loop. Compile, run, lalu amati hasilnya.
   jawab : sudah 

8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach
   loop. Compile, run, lalu lakukan amati hasilnya.
   jawab : sudah

9.  Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama
    penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
    jawab : sudah

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for
    loop?
    jawab : 
    foreach (enhanced for loop)
    ✔ lebih sederhana
    ✔ tidak perlu menangani indeks
    ✖ tidak bisa mengakses indeks langsung
    ✖ tidak bisa memodifikasi nilai berdasarkan posisi tertentu

    for (biasa)
   ✔ bisa akses indeks
   ✔ bisa digunakan untuk manipulasi spesifik
   ✖ lebih panjang penulisannya

11. Berapa indeks baris maksimal untuk array penonton?
    jawab : jumlah baris = 4 , indeks maksimal = 3

12. Berapa indeks kolom maksimal untuk array penonton?
    jawab : jumlah kolom = 2 , indeks maksimal = 1

13. Apa fungsi dari String.join()?
    jawab : Untuk menggabungkan beberapa string menjadi satu string dengan delimiter/pemisah tertentu.
    Contoh:
    String.join(", ", data) → menghasilkan "A, B, C"


PERCOBAAN 2

1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai
   dari indeks ke-0? Jelaskan!
   jawab :

2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
    - Menu 1: Input data penonton
    - Menu 2: Tampilkan daftar penonton
    - Menu 3: Exit
   jawab :

3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang
   tidak tersedia
   jawab :

4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang
   dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan
   baris dan kolom kembali
   jawab :

5. Pada menu 2, jika kursi kosong, ganti null dengan ***
   jawab :


PERCOBAAN 3

1. Tambahkan kode program sebagai berikut
   jawab :

2. Apa fungsi dari Arrays.toString()?
   jawab : 

3. Apa nilai default untuk elemen pada array dengan tipe data int?
   jawab :

4. Tambahkan kode program berikut
   jawab :

5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang
   array dapat dimodifikasi setelah diinstansiasi?
   jawab :


PERCOBAAN 4

1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi
   kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah
   yang dinamis.
   jawab :


