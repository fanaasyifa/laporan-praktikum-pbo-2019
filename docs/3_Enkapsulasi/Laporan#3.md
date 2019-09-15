# Laporan Praktikum #3 - Enkapsulasi

## Kompetensi

Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep: 
1. Konstruktor 
2. Akses Modifier 
3. Atribut/method pada class 
4. Intansiasi atribut/method  
5. Setter dan getter 
6. Memahami notasi pada UML Class Diagram  

## Ringkasan Materi

## Percobaan

### Percobaan 1

pada percobaan ini yaitu Enakpsulasi, dalam percobaan ini membuat class Motor yang memiliki atribut kecepatan, dan kontakOn, dan memiliki method printStatus() untuk menampilkan satus motor.

#### class Motor1841720155Fana

![M1](img/M1.PNG)

Contoh link kode program : [Motor1841720155Fana](../../src/3_Enkapsulasi/Motor1841720155Fana.java)

#### class main MotorDemo1841720155Fana

![MD2](img/MD2.PNG)

Contoh link kode program : [MotorDemo1841720155Fana](../../src/1_Enkapsulasi/MotorDemo1841720155Fana.java)

### Percobaan 2

(berisi penjelasan percobaan 2. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

#### class SepedaGunung1841720155Fana

![C3](img/C3.PNG)

Contoh link kode program : [SepedaGunung1841720155Fana](../../src/1_Pengantar_Konsep_PBO/SepedaGunung1841720155Fana.java)

#### class main

![C4](img/C4.PNG)

![C4.1](img/C4.1.PNG)

Contoh link kode program : [SepedaDemo1841720155Fana](../../src/1_Pengantar_Konsep_PBO/SepedaDemo1841720155Fana.java)


## Pertanyaan

1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek! 

jawab : 

A. OBJECT 

suatu rangkaian dalam program yang terdiri dari state dan behaviour.

B.CLASS

blueprint atau prototype dari objek.

C. ENKAPSULASI

Disebut juga dengan information-hiding. Dalam berinteraksi dengan objek, seringkali kita tidak perlu mengetahui 
kompleksitas yang ada didalamnya. 

D. INHERITANCE

Disebut juga pewarisan. Inheritance memungkinkan kita untuk mengorganisir struktur program dengan natural. 
Inheritance juga memungkinkan kita untuk memperluas fungsionalitas program tanpa harus mengubah banyak bagian program. 

E. POLIMORFISME

Polimorfisme juga meniru sifat objek di dunia nyata, dimana sebuah objek dapat memiliki bentuk,
atau menjelma menjadi bentuk-bentuk lain.

2. Apa yang dimaksud dengan object dan apa bedanya dengan class? 

jawab : 

object merupakan bentuk representasi dari sebuah kelas, membungkus data dan fungsi bersama menjadi suatu unit atau 
entitas dalam sebuah program komputer.
Sedangkan  Kelas Merupakan kumpulan atas definisi data dan fungsi-fungsi dalam suatu unit untuk suatu tujuan tertentu 
dimana didalamnya terdapat kumpulan atribut dan method

3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural! 

jawab : 

Kelebihan PBO adalah program dapat lebih fleksibel dan modular, jika ada perubahan fitur, maka dapat dipastikan 
keseluruhan program tidak akan terganggu.

4. Pada class Sepeda, terdapat state/atribut apa saja?  

jawab : 

Kecepatan,gear,merek

5. Tambahkan atribut warna pada class Sepeda.

jawab :

![C5](img/C5.PNG)

Contoh link kode program : [Sepeda1841720155Fana](../../src/1_Pengantar_Konsep_PBO/Sepeda1841720155Fana.java)

6. Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol? 
 
 jawab :

karena pada class sepeda gunung terdapat Inheritance, dimana  membuat class SepedaGunung yang mana adalah 
turunan/warisan dari class Sepeda. Pada dasarnya class SepedaGunung adalah sama dengan class Sepeda, hanya 
saja pada sepeda gunung terdapat tipe suspensi. Untuk itu kita tidak perlu membuat class Sepeda Gunung dari nol, 
tapi kita wariskan saja class Sepeda ke class SepedaGunung.

## Tugas

(silakan kerjakan tugas di sini beserta `screenshot` hasil kompilasi program. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

#### Mobil

![C6](img/C6.PNG)

Contoh link kode program : [Mobil1841720155Fana](../../src/1_Pengantar_Konsep_PBO/Mobil1841720155Fana.java)

#### class Main

![C7](img/C7.PNG)
![C7.1](img/C7.1.PNG)

Contoh link kode program : [MobilDemo1841720155Fana](../../src/1_Pengantar_Konsep_PBO/MobilDemo1841720155Fana.java)

#### Mobil Jeep

![C8](img/C8.PNG)

Contoh link kode program : [MobilJeep1841720155Fana](../../src/1_Pengantar_Konsep_PBO/MobilJeep1841720155Fana.java)

#### Mobil Sport

![C9](img/C9.PNG)

Contoh link kode program : [MobilSport1841720155Fana](../../src/1_Pengantar_Konsep_PBO/MobilSport1841720155Fana.java)

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
