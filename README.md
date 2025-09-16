# Post-Test-2-PBO

## Deskripsi Program

Program ini merupakan sistem untuk memanajemen dari warung internet. Adapun yang bisa dilakukan oleh user adalah hal-hal umum seperti CRUD(Create, Read, Update, Delete). Adapun yang disimpan disini adalah data pelanggan yaitu berupa:

1. Nama Pelanggan
2. Durasi (jam)
3. Total Harga
4. Nomor PC

## Pilihan Menu

1. Tambah Pelanggan
2. Lihat Data Pelanggan
3. Ubah Data Pelanggan
4. Hapus Data Pelanggan
5. Cari Pelanggan
6. Keluar


## Packages dan Penerapan MVC

- Packages Main

  <img width="239" height="42" alt="image" src="https://github.com/user-attachments/assets/4e84f0d1-19de-4b7d-9fdb-24bd5e5e63d8" />

  Di packages Main terdapat class Main yang diperlukan untuk menjalankan menampilkan menu yang akan dilihat oleh user. Class Main disini sebagai penghubung dari user dan sistem yang dimana user bisa menginput dan sistem menampilkan hasilnya. Untuk penerapan MVC disini menerapkan yang View, yang dimana bagian View menampilkan informasi ke user dan menerima input dari user.

- Packages Service

  <img width="203" height="44" alt="image" src="https://github.com/user-attachments/assets/abd7a2de-6fc6-4be1-95ed-c67b15d744c4" />

  Di packages Service terdapat class Warnet yang berisikan logika untuk class Main dan berisi array list data awalan pelanggan. Class Warnet disini sebagai yang sistem yang menghitung atau menjalakan inputan yang kemudian akan ditampilkan melalui Main. Untuk penerapan MVC disini menerapkan yang Controller, yang dimana bagian Controller ini berisikan hal-hal yang mengatur alur data dan logika aplikasi.

- Packages Model

  <img width="227" height="48" alt="image" src="https://github.com/user-attachments/assets/20e89ddc-1667-4fe3-aca7-ac3a55ff1a9d" />

  Di packages Model terdapat class Pelanggan yang berisikan constructor untuk menyimpan data-data pelanggan. Class Pelanggan disini akan digunakan untuk menyimpan data-data dari pelanggan yang kemudian akan dipanggil untuk ditampilkan. Untuk penerapan MVC disini menerapkan yang Model, yang dimana bagian Model ini bagian yang menangani data dari suatu sistem.


## Penerapan Access Modifier

- private

  Ini diterapkan pada properties yang dimana agar data pelanggan tidak bisa sembarangan diubah dari luar.

- public

  Ini diterapkan pada constructor agar class lain bisa memanggil constructornya untuk menampilkan data pelanggan.

- private final

  Ini diterapkan pada array list untuk melindungi daftar pelanggan supaya tidak bisa diganti sembarangan, hanya bisa dikelola melalui method CRUD yang sudah disediakan.

## Nilai Tambah Validasi Input dan Fitur Search

<img width="593" height="172" alt="image" src="https://github.com/user-attachments/assets/7a77aa39-a558-49a2-952d-9f3bd2e03f2f" />
<img width="601" height="200" alt="image" src="https://github.com/user-attachments/assets/1f6e0945-db6a-4da8-8423-aad69ee4b745" />
<img width="570" height="165" alt="image" src="https://github.com/user-attachments/assets/e8ee1286-2bba-4bef-9526-2d1e595d3ada" />
<img width="673" height="157" alt="image" src="https://github.com/user-attachments/assets/c02dbeab-a631-47f9-ab63-653adf30de21" />
<img width="701" height="158" alt="image" src="https://github.com/user-attachments/assets/263f2571-7a63-49eb-841b-5296e74eb687" />


Untuk validasi input diterapkan pada saat pemilihan Menu agar pengguna tidak bisa memasukkan hal-hal lain selain angka. Kemudian, sama juga seperti yang menu terdapat validasi input pada pilihan di menu Tambah Pelanggan, Ubah Data Pelanggan, Hapus Data Pelanggan.

<img width="824" height="306" alt="image" src="https://github.com/user-attachments/assets/2ef1152b-5979-40b7-9aec-5e4ef72095ec" />

Untuk Search dipakai untuk mencari data pelanggan berdasarkan namanya.

## Alur Sistem

### Menu Utama

<img width="394" height="167" alt="image" src="https://github.com/user-attachments/assets/499269e3-0ff0-4e3c-8319-c7f56ffebaf1" />

Ketika kita memulai file kodingannya, akan muncul menu utama seperti pada gambar yang bias dipilih dengan menginput angka dari pilihannya.

<img width="591" height="417" alt="image" src="https://github.com/user-attachments/assets/2f65e8a1-9e4c-42c7-9ad3-d46e6699dc44" />

Apabila kita menginput angka selain dipilihan atau huruf akan menampilkan pesan bahwa hal tersebut tidak boleh dilakukan.

### 1. Tambah Data Pelanggan

<img width="432" height="267" alt="image" src="https://github.com/user-attachments/assets/142b1f7c-f6b7-4c7b-a1eb-f2393e5cdab6" />

Di sini terdapat contoh untuk penambahan data pelanggan.

<img width="474" height="522" alt="image" src="https://github.com/user-attachments/assets/7ed1d72c-1fb6-4af5-ab2a-f2eb86a5b524" />

Apabila kita menginput huruf pada hal bagian durasi dan nomor PC, akan menampilkan pesan dan mengembalikan ke menu utama.

### 2. Lihat Pelanggan

<img width="815" height="352" alt="image" src="https://github.com/user-attachments/assets/62f6aa3f-7407-48f2-8f66-6c42ee24f0d2" />

Apabila kita memilih pilihan nomor 2, sistem akan menampilkan data pelanggan yang terdaftar dan langsung mengembalikan ke menu utama.

### 3. Ubah Data Pelanggan

<img width="642" height="460" alt="image" src="https://github.com/user-attachments/assets/469f4c40-7bf7-430d-8cc0-385c223aa214" />

Disini terdapat contoh dari pemilihan nomor 3, sistem akan menampilkan data pelanggan yang terdaftar dan pengguna diharuskan menginput nomor pelanggan yang ingin diubah dan data-data barunya.

<img width="600" height="237" alt="image" src="https://github.com/user-attachments/assets/3b708770-3440-44cf-a3a4-ae7e2c147c42" />

Apabila kita menginput huruf pada pilihan yang diharuskan angka, akan mengembalikan ke menu utama dan proses mengubah data gagal.

### 4. Hapus Data Pelanggan

<img width="666" height="396" alt="image" src="https://github.com/user-attachments/assets/97b1e675-a056-4bce-a13b-f0b3edecd771" />

Disini terdapat contoh dari pemilihan nomor 4, disini user akan ditampilkan data dari pelanggan yang terdaftar dan diharuskan menginput untuk melakukan penghapusan data.

<img width="760" height="743" alt="image" src="https://github.com/user-attachments/assets/416f9b2a-a9be-4134-be57-18f583e95265" />

Apabila user menginput angka yang tidak ada pilihannya atau huruf akan menampilkan pesan dan mengembalikan ke menu utama.

### 5. Cari Pelanggan













