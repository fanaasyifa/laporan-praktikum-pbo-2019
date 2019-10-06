# Laporan Praktikum #6 -Inheritance

## Kompetensi

1. Memahami konsep dasar inheritance atau pewarisan.	
2. Mampu membuat suatu subclass dari suatu superclass tertentu.	
3. Mampu mengimplementasikan konsep single dan multilevel inheritance.	
4. Mampu membuat objek dari suatu subclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki 

## Ringkasan Materi

### Pendahuluan
 
Inheritance atau pewarisan sifat merupakan suatu cara untuk menurunkan suatu class yang lebih umum menjadi suatu class yang lebih spesifik. Inheritance adalah salah satu ciri utama suatu bahasa program yang berorientasi pada objek. Inti dari pewarisan adalah sifat reusable dari konsep object oriented. Setiap subclass akan “mewarisi” sifat dari superclass selama bersifat protected ataupun public.
Dalam inheritance terdapat dua istilah yang sering digunakan. Kelas yang menurunkan disebut kelas dasar (base class/super class), sedangkan kelas yang diturunkan disebut kelas turunan (derived class/sub class/child class) . Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-­‐nya. Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class. Berikut adalah contoh deklarasi inheritance.

![Capture](img/Capture.PNG)

Contoh  diatas  memberitahukan  kompiler  Java  bahwa  kita  ingin  meng-­‐extend  class  A  ke  class  B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B.
Karakteristik pada super class akan dimiliki juga oleh subclassnya. Terdapat 3 bentuk pewarisan: single inheritance, multilevel inheritance, dan multiple inheritance. Namun yang akan dibahas pada jobsheet ini adalah single inheritance dan multilevel inheritance.

1.	Single Inheritance
Single inheritance adalah Suatu class yang hanya mempunyai satu parent class. Contoh:

![C2](img/C2.PNG)

Berdasarkan Gambar 1 dapat diketahui bahwa class B merupakan subclass yang mempunyai satu parent yaitu class A sehingga disebut single inheritance.

2.	Multilevel Inheritance
Multilevel inheritance adalah Suatu subclass bisa menjadi superclass bagi class yang lain. Contoh:

![C3](img/C3.PNG)

Berdasarkan Gambar 2 diatas dapat dilihat bahwa class B merupakan subclass dari class A, sehingga dalam hal ini class A adalah superclass dan class B adalah subclass. Kemudian class B yang awalmya merupakan subclass mempunyai subclass lagi yaitu class C sehingga class B menjadi superclass dari class C, begitu juga seterunya jika class C memilki subclass lagi.

Pada class diagram, pewarisan digambarkan dengan sebuah garis tegas, dengan segitiga di ujungnya. Class yang dekat pada segitiga merupakan superclass, sedangkan class yang jauh dari segitiga merupakan subclass. Untuk membentuk sebuah subclass, keyword “extends” digunakan (lihat contoh pada sesi “Implementasi Pewarisan”). Berikut ini adalah contoh class diagram dari pewarisan:

![C4](img/C4.PNG)

Suatu  parent  class  dapat  tidak  mewariskan  sebagian  member-­‐nya  kepada  subclass-­‐nya. Sejauh mana suatu member dapat diwariskan ke  class  lain,  ataupun  suatu  member  dapat  diakses  dari class lain, sangat berhubungan dengan access control (kontrol  pengaksesan).  Di  dalam  java,  kontrol pengaksesan dapat digambarkan dalam tabel berikut ini:

![C5](img/C5.PNG)

Kata kunci super dipakai untuk merujuk pada member dari parent class. Sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri. Format penulisannya adalah sebagai berikut:
•	super.namaAtribut
Merujuk/mengakses atribut dari parent class /superclass
•	super.namaMethod()
Merujuk/memanggil method dari parent class /superclass
•	super()
Merujuk / memanggil konstruktor parent class /superclass Hanya bisa digunakan dibaris pertama dalam kontruktor.
•	super(parameter1, parameter2,dst)
Merujuk / memanggil konstruktor berparamter dari superklas

Ketika mmebuat objek dari subclass, pada saat itu juga objek pada superclass juga akan terbentuk. Dengan katalain, ketika kontruktor subclass dijalankan untuk membuat objek, saat itu juga kontruktor superclass akan berjalan. Jadi di setiap konstruktor subclass, pada baris pertama konstruktor subclass tersebut akan dipanggil konstruktor superclass. Sebelum subclass menjalankan kontruktornya sendiri, subclass akan menjalankan kontruktor superclass terlebih dahulu.


## Percobaan

### Percobaan 1 (Extends)

pada percobaan ini membuat package baru dan membuat class A dan Class B

#### class A1841720155Fana



Contoh link kode program : [Processor1841720155Fana](../../src/4_Relasi_Class/Processor1841720155Fana.java)
#### class Laptop1841720155Fana

![Lp1](img/Lp1.PNG)

Contoh link kode program : [Laptop1841720155Fana](../../src/4_Relasi_Class/Laptop1841720155Fana.java)


#### class main Percobaan1

Kemudian buat class MotorDemo, ketikkan kode berikut ini.

![MainP1](img/MainP1.PNG)

Contoh link kode program : [MainProcessor1841720155Fana](../../src/4_Relasi_Class/MainProcessor1841720155Fana.java)

### Pertanyaan
Pertanyaan Berdasarkan percobaan 
jawablah pertanyaan‑pertanyaan yang terkait: 

1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?

jawab :

jadi fungsi setter dan getter yaitu untu menge-set (memberi nilai) dan menge-get (mendapatkan/melihat nilai) pada suatu variabel atau class dengan contructor default

2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ? 

jawab :

beda pengguna pada default dan berparameter yaitu konstruktor default, untuk memberi nilai menggunakan setter, 
tetapi konstruktor berparameter, kita hanya perlu memberi nilai di parameter pada objek di class main.

3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ? 

jawab:

pada atribut proc, karena inisiasi tipe variabel ditandai dengan nama object.

4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ? 
jawab :

![Per1,4](img/Per1,4.PNG)

yaitu pada constructor, terdapat parameter yang menggunakan object Processor yang telah diinisiasi sebelumnya.

5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?

jawab:

guna dari proc.Info() yaitu, syntax yang digunakan untuk menjalankan method Info() pada class Processor.

6. Pada class MainPercobaan1, terdapat baris kode: Laptop l = new Laptop("Thinkpad", p);. Apakah p tersebut ? 
Dan apakah yang terjadi jika baris kode tersebut diubah menjadi: Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3)); 
Bagaimanakah hasil program saat dijalankan,apakah ada perubahan ? 

jawab :
 
p merupakan object dari class Processor yang tadi telah diinstansiasi, Lalu kode program yang baru hasilnya sama saja, kode program tersebut memiliki perbedaan pada instansiasi dalam bentuk variabel object, bila pada kode program tersebut object tidak perlu diinstansiasi kedalam variabel lain tetapi ter nested atau bisa dibilang melakukan instansiasi objek dialam instansiasi object.
 
### Percobaan 2

pada percobaan ini membuat package baru dan membuat class mobil,Sopir,Pelanggan, dan Mainnya

#### class Mobil1841720155Fana

![M1](img/M1.PNG)


Contoh link kode program : [Mobil1841720155Fana](../../src/4_Relasi_Class/Mobil1841720155Fana.java)

#### class Sopir1841720155Fana

![S1](img/S1.PNG)


Contoh link kode program : [Sopir1841720155Fana](../../src/4_Relasi_Class/Sopir1841720155Fana.java)

#### class Pelanggan1841720155Fana

![Pel1](img/Pel1.PNG)


Contoh link kode program : [Pelanggan1841720155Fana](../../src/4_Relasi_Class/Pelanggan1841720155Fana.java)

#### class main MotorDemo1841720155Fana

![MainP2](img/MainP2.PNG)

Hasil Screen Shot yang ada diatas merupakan perubahan dari class MotorDemo sebelumnya pada percobaan 1,atau bisa dikatakan access modifier.

Contoh link kode program : [MainPercobaan2](../../src/4_Relasi_Class/MainPercobaan2.java)

### Pertanyaan

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ? 

jawab :

![Per2,1](img/Per2,1.PNG)

yaitu pada inisiasi  variabel object di class pelanggan

2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ? 

jawab :
 
karena argumen tersebut digunakan untuk diisi dengan variabel int hari pada class Pelanggan 

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ? 

jawab :

perintah tersebut tersebut digunakan untuk menjumlahkan biaya mobil yang diambil dari harga sopir dikali dengan hari lalu yang dijumlahkan dengan biaya sopir yang diambil dari harga sopir dikali hari.

4. Perhatikan class MainPercobaan2. 
Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ?

jawab : 

sintaks tersebut digunakan untuk memberi atau mengisi nilai dari namaMobil dan namaSopir yang ada pada objek pelanggan

5. Perhatikan class MainPercobaan2. 
Untuk apakah proses p.hitungBiayaTotal() tersebut ? 

jawab :

proses p.hitungBiayaTotal() Digunakan untuk menghitung biaya total dari penjumlahan antara biaya sopir dan biaya mobil.

6. Perhatikan class MainPercobaan2, 
coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run! 
 
System.out.println(p.getMobil().getMerk()); 
 
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut? 

jawab :

perintah tersebut digunakan untuk menggembalikan atau me return nilai atribut dari method  getMerk() pada class Mobil melalui objek pelanggan, atau setelah me return object Mobil pada class pelanggan, object mobil akan me return String getMerk() pada class mobil

### Percobaan 3

pada percobaan ini membuat package baru dan membuat class Pegawai,Kereta Api, dan Main nya.

#### class Pegawai1841720155Fana

![Pega1](img/Pega1.PNG)

Contoh link kode program : [Pegawai1841720155Fana](../../src/4_Relasi_Class/Pegawai1841720155Fana.java)

#### class KeretaApi1841720155Fana

![Ker1](img/Ker1.PNG)
![Ker2](img/Ker2.PNG)

Contoh link kode program : [KeretaApi1841720155Fana](../../src/4_Relasi_Class/KeretaApi1841720155Fana.java)


#### class main Percobaan3

![MainP3](img/MainP3.PNG)

Contoh link kode program : [MainPercobaan31841720155Fana](../../src/4_Relasi_Class/MainPercobaan31841720155Fana.java)

### Pertanyaan 

1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ? 

jawab:

digunakan untuk memanggil method Info yang berada di class Pegawai melalui object masinis dan asisten

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() ! 
 
Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); 
 
System.out.println(keretaApi.info()); 

jawab :

![Per3,2](img/Per3,2.PNG)
 
3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ? 4. Perbaiki class KeretaApi sehingga program dapat berjalan ! 

jawab :

![Per3,3](img/Per3,3.PNG)

Dapat dilihat dalam gambar diatas karane ada variabel yang tidak bernilai atau disebut dengan null, dan variabel tersebut adalah object asisten pada class KeretaApi

4.	Perbaiki class KeretaApi sehingga program dapat berjalan

jawab :
![Per3,4](img/Per3,4.PNG)

outputnya 

![Per3,4.1](img/Per3,4.1.PNG)

### Percobaan 4

#### class Penumpang1841720155Fana

![P4](img/P4.PNG)

Contoh link kode program : [Penumpang1841720155Fana](../../src/4_Relasi_Class/Penumpang1841720155Fana.java)

#### class Kursi1841720155Fana

![K4](img/K4.PNG)

Contoh link kode program : [Kursi1841720155Fana](../../src/4_Relasi_Class/Kursi1841720155Fana.java)

#### class Gerbong1841720155Fana

![G4](img/G4.PNG)

Contoh link kode program : [Gerbong1841720155Fana](../../src/4_Relasi_Class/Gerbong1841720155Fana.java)

#### class MainPercobaan41841720155Fana

![MainP4](img/MainP4.PNG)

Contoh link kode program : [MainPercobaan41841720155Fana](../../src/4_Relasi_Class/MainPercobaan41841720155Fana.java)


## Pertanyaan

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ? 

jawab :

jumlah nya ada 10, dapat dilihat pada instansiasi new Gerbong.

2. Perhatikan potongan kode pada method info() dalam class Kursi. 


Apa maksud kode tersebut ? 
 
...if (this.penumpang != null) { info += "Penumpang: " + penumpang.info() + "\n"; } ... 

jawab :

pada potongan kode program digunakan untuk menampilkan kursi yang terisi oleh penumpang, tetapi bila penumpang tidak bernilai atau null, maka kode program yang terdapat pada if tidak dijalankan atau berarti kursi tersebut masih kosong
 
3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ?

jawab :

karena index array selalu dimulai dari 0, oleh karena itu nilai nomer harus dikurangi 1 agar array di index 0 atau di index pertama dapat terisi

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ? 

jawab :

![Per4,4](img/Per4,4.PNG)

outputnya

![Per4,4.1](img/Per4,4.1.PNG)

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain ! 

jawab :
 
![Per5,5](img/Per5,5.PNG)

outputnya

![Per5,5.1](img/Per5,5.1.PNG)
 
## Tugas

Buatlah sebuah studi kasus, rancang dengan class diagram, kemudian implementasikan ke dalam program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah dilakukan pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak dihitung).


#### class RamTugas1841720155Fana

![T1](img/T1.PNG)

Contoh link kode program : [RamTugas1841720155Fana](../../src/4_Relasi_Class/RamTugas1841720155Fana.java)

#### class LaptopTugas1841720155Fana

![T2](img/T2.PNG)

Contoh link kode program : [LaptopTugas1841720155Fana](../../src/4_Relasi_Class/LaptopTugas1841720155Fana.java)

#### class HarddiskTugas1841720155Fana

![T3](img/T3.PNG)

Contoh link kode program : [HarddiskTugas1841720155Fana](../../src/4_Relasi_Class/HarddiskTugas1841720155Fana.java)

#### class ProcessorTugas1841720155Fana

![T4](img/T4.PNG)

Contoh link kode program : [ProcessorTugas1841720155Fana](../../src/4_Relasi_Class/ProcessorTugas1841720155Fana.java)

#### class MainTugas1841720155Fana

![T5](img/T5.PNG)

Contoh link kode program : [MainTugas1841720155Fana](../../src/4_Relasi_Class/MainTugas1841720155Fana.java)



## Kesimpulan

Dari percobaan diatas, telah dipelajari kosep dari Relasi Class. Jadi dari percobaan tersebut mahasiswa dapat memahami konsep relasi kelas dan juga mahasiswa dapat mengimplementasikan relasi has‑a dalam program. 
 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,


***(Fana Asy-syifa)*** 
