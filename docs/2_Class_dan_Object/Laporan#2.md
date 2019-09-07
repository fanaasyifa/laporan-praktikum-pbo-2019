# Laporan Praktikum #2 - Pengantar Konsep PBO

## Kompetensi

 Mahasiswa dapat memahami deskripsi dari class dan object 

 Mahasiswa memahami implementasi dari class 

 Mahasiswa dapat memahami implementasi dari attribute 

 Mahasiswa dapat memahami implementasi dari method 

 Mahasiswa dapat memahami implementasi dari proses instansiasi

 Mahasiswa dapat memahami implementasi dari try-catch 

 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML 

## Ringkasan Materi


## Percobaan

### Percobaan 1
pada percobaan ini, membuat sebuah class diagram dimana ada sebuah data karyawan dimana tiap karyawan memiliki id,nama,jenis kelamin,jabatan,dan gaji. Dan dapat menampilkan data diri pribadi dan melihat gajinya.
#### class Diagram

![D1](img/D1.PNG)

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!

jawab :
Class Karyawan dan Class KaryawanMain

3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1! 

jawab :
- id : Int 
- Nama : String 
- Jenis kelamin : String
- Jabatan : String 
- Gaji  : Int

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1! 

jawab :
Public void tampilDataDiri() dan  TampilGaji().

### Percobaan 2

Pada percobaan tersebut, membuat sebuah program berdasarkan class diagram , yaitu class diagram Mahasiswa

#### class Mahasiswa1841720155Fana

![Ca1](img/Ca1.PNG)

Contoh link kode program : [Mahasiswa1841720155Fana](../../src/1_Pengantar_Konsep_PBO/Mahasiswa1841720155Fana.java)

#### class main Mahasiswa1841720155Fana

Setelah membuat program class Mahasiswa, selanjutnya membuat class main, yaitu sebuah instance dari class Mahasiswa.


![Ca2](img/Ca2.PNG)

Contoh link kode program : [TestMahasiswa1841720155Fana](../../src/1_Pengantar_Konsep_PBO/TestMahasiswa1841720155Fana.java)

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

jawab :
Pada clas mahasiswa dari  line 2 sampai dengan line 5

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas! 

jawab :
pada class mahasiswa pada line ke 7

9. Berapa banyak objek yang di instansiasi pada program diatas! 

jawab :
satu ,  pada class  testMahasiswa

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ? 

jawab:
menampilkan pada objek

11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” 

jawab :
untuk  menampilkan output yang  dihasilkan

12. Instansiasi 2 objek lagi pada program diatas! 

jawab :

### Percobaan 3

Pada percobaan ini mahasiswa diharapkan membuat pemrograman dengan Class Barang dimana pada pemrograman tersebut memiliki argument/parameter dan memiliki return.

#### class Barang1841720155Fana

![Ca3](img/Ca3.PNG)

Contoh link kode program : [Barang1841720155Fana](../../src/1_Pengantar_Konsep_PBO/Barang1841720155Fana.java)

#### class Main Barang1841720155Fana

![Ca4](img/Ca4.PNG)

Contoh link kode program : [TestBarang1841720155Fana](../../src/1_Pengantar_Konsep_PBO/TestBarang1841720155Fana.java)

7. Apakah fungsi argumen dalam suatu method? 

jawab :
Fungsi  yang  memberi nilai bedasarkan suatu method

8. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!

jawab:
Return adalah kata kunci untuk mengembalikan atau mengelluarkan suatu nilai, method  dengan tipe data void , berarti tidaj memerlukan kata kunci return di dalamnya method dengan tipe data bukan void berarti memerlukan kata return

## Tugas


#### 1.Diagram persewaan vidio game

![D2](img/D2.PNG)

#### 2.class Peminjaman

![Ca5](img/Ca5.PNG)

Contoh link kode program : [Peminjaman1841720155Fana](../../src/1_Pengantar_Konsep_PBO/Peminjaman1841720155Fana.java)

##### class main Peminjaman

![Ca6](img/Ca6.PNG)

Contoh link kode program : [TestPeminjaman1841720155Fana](../../src/1_Pengantar_Konsep_PBO/TestPeminjaman1841720155Fana.java)

#### 3.class Lingkaran

![Ca7](img/Ca7.PNG)

Contoh link kode program : [Lingkaran1841720155Fana](../../src/1_Pengantar_Konsep_PBO/Lingkaran1841720155Fana.java)

##### class Main Lingkaran

![Ca8](img/Ca8.PNG)

Contoh link kode program : [TestLingkaran1841720155Fana](../../src/1_Pengantar_Konsep_PBO/TestLingkaran1841720155Fana.java)

#### 4.class Tugas Barang 

![Ca9](img/Ca9.PNG)

Contoh link kode program : [TugasBarang1841720155Fana](../../src/1_Pengantar_Konsep_PBO/TugasBarang1841720155Fana.java)

##### class Main Tugas Barang

![Ca10](img/Ca10.PNG)

Contoh link kode program : [TestTugasBarang1841720155Fana](../../src/1_Pengantar_Konsep_PBO/TestTugasBarang1841720155Fana.java)

## Kesimpulan

Dari percobaan diatas, kita telah mendemonstrasikan bagaimana paradigma pemrograman berorientasi objek dan 
mengimplementasikannya kedalam program sederhana. Kita juga telah mendemonstrasikan salah satu fitur paling 
penting dari PBO yaitu inheritance, yaitu dalam hal membuat class SepedaGunung.  
Kita ketahui bahwa SepedaGunung pada dasarnya adalah sama dengan Sepeda (memiliki gear, memiliki kecepatan,
dapat menambah kecepatan, dapat mengerem, pindah gigi, dsb) namun ada fitur tambahan yaitu tipe suspensi.
Maka kita tidak perlu membuat class SepedaGunung dari nol, kita extends atau wariskan saja dari class Sepeda,
kemudian kita tinggal tambahkan fitur yang sebelumnya belum ada di class Sepeda. Inilah salah satu kelebihan 
PBO yang tidak ada di pemrograman struktural. 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Fana Asy-syifa)*** 
