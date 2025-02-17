# Laporan Praktikum #9_Abstract_Class_dan_Interface

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class; 
2. Menjelaskan maksud dan tujuan penggunaan Interface; 
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 

## Ringkasan Materi

### Pendahuluan

#### Abstract Class

Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru dapat dimanfaatkan ketika ia di-extend. 
 
Karakteristik: 

a. Dapat memiliki properties dan methods seperti class biasa. 
b. Selalu memiliki methods yang tidak memiliki tubuh (hanya deklarasinya saja), disebut juga abstract method. 
c. Selalu dideklarasikan dengan menggunakan kata kunci abstract class. 
 
Kegunaan: 

Menggambarkan sesuatu yang bersifat umum, yang hanya bisa berfungsi setelah ia dideskripsikan ke dalam bentuk yang lebih spesifik. 

#### Interface 

Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.  

Karakteristik: 

a. Tidak ada apa-apa di dalamnya selain abstract methods. 
b. Di konvensi bahasa pemrograman Java, namanya dianjurkan untuk selalu diawali dengan huruf kapital ‘I’. 
c. Selalu dideklarasikan dengan menggunakan kata kunci interface. 
d. Diimplementasikan dengan menggunakan kata kunci implements. 
 
Kegunaan: 

Bertindak seperti semacam kontrak/syarat yang HARUS dipenuhi bagi suatu class agar class tersebut dapat dianggap sebagai ‘sesuatu yang lain’. 
 
 
## Percobaan

### Percobaan 1  Abstract Class 

#### Hewan 

![hewan](img/hewan.PNG)
[Hewan1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Hewan1841720155Fana.java)

#### Kucing

![kucing1](img/kucing1.PNG)
![kucing2](img/kucing2.PNG)

[Kucing1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Kucing1841720155Fana.java)

#### Ikan

![ikan](img/ikan.PNG)

[Ikan1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Ikan1841720155Fana.java)

#### Orang

![Orang](img/Orang.PNG)

[Orang1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Orang1841720155Fana.java)

#### Program main

![program](img/program.PNG)

[Program1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Program1841720155Fana.java)

#### Pertanyaan

Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!
jawab :
Tidak 
![pertanyaan1](img/pertanyaan1.PNG)

### Percobaan 2 Interface 

#### ICumlaude 

![icumlaude](img/icumlaude.PNG)
[ICumlaude1841720155Fana](../../src/9_Abstract_Class_dan_Interface/ICumlaude1841720155Fana.java)

#### Mahasiswa

![mahasiswa](img/mahasiswa.PNG)

[Mahasiswa1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Mahasiswa1841720155Fana.java)

#### Sarjana

![sarjana1](img/sarjana1.PNG)
![sarjana2](img/sarjana2.PNG)

[Sarjana1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Sarjana1841720155Fana.java)

#### Pascasarjana

![pascasarjana](img/pascasarjana.PNG)

[PascaSarjana1841720155Fana](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720155Fana.java)

#### Rektor

![rektor](img/rektor.PNG)

[Rektor1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Rektor1841720155Fana.java)

#### Program main

![program2](img/program2.PNG)

[Program2_1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Program2_1841720155Fana.java)

#### Pertanyaan

a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

jawab:

Karena dari class Mahasiswa tidak mengimplementasikan interface ICumlaude

b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?  

jawab :

Bisa, karena class Sarjana adalah child dari class Mahasiswa

c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? 

jawab :

Tidak, karena tidak ada abstract method pada interface ICumaloud

d. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 

jawab :

![program2.1](img/program2.1.PNG)
![program2.2](img/program2.2.PNG)

[Program2_1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Program2_1841720155Fana.java)

### Percobaan 3 Multiple Interfaces Implementation 

#### IBerprestasi

![iberprestasi](img/iberprestasi.PNG)
[IBerprestasi1841720155Fana](../../src/9_Abstract_Class_dan_Interface/IBerprestasi1841720155Fana.java)

#### Pascasarjana2

![pascasarjana2](img/pascasarjana2.PNG)

[Pascasarjana2_1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Pascasarjana2_1841720155Fana.java)

#### Rektor

![rektor2](img/rektor2.PNG)

[Rektor1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Rektor1841720155Fana.java)

#### Pascasarjana

![pascasarjana](img/pascasarjana.PNG)

[PascaSarjana1841720155Fana](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720155Fana.java)

#### Program main

![program3eror](img/program3eror.PNG)

Akan terdapat error pada langkah-5, sehingga program tidak dapat dieksekusi. Perbaikilah kode programmnya,

![program3benar](img/program3benar.PNG)

[Program3_1841720155Fana](../../src/9_Abstract_Class_dan_Interface/Program3_1841720155Fana.java)

#### Pertanyaan

1. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 

jawab :

![pertanyaan3](img/pertanyaan3.PNG)

## Kesimpulan

Abstract Class adalah sebuah class yang tidak bisa di-instansiasi (tidak bisa dibuat menjadi objek) dan berperan sebagai 'kerangka dasar' bagi class turunannya. Di dalam abstract class umumnya akan memiliki abstract method.  Interface adalah sebuah tipe referensi pada Java. Interface secara struktur serupa dengan class. Isi dari interface adalah method abstract 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,



***(Fana Asy-syifa)***

