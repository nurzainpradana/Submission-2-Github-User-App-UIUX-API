# Submission 2 Android Fundamental (Update Submission)
## Membuat Aplikasi Android Github User (UI/UX dan API)
Aplikasi untuk menampilkan daftar hasil pencarian user github, kemudian ketika list di klik akan menampilkan detail dari user tersebut beserta daftar followers dan following

### Library yang digunakan
* Retrofit
  * com.squareup.retrofit2:retrofit:2.7.1
  * com.squareup.retrofit2:converter-gson:2.7.1
  * implementation 'com.google.code.gson:gson:2.8.5

* Tab Layout
  * com.google.android.material:material:1.1.0

* LifeCycle
  * androidx.lifecycle:lifecycle-extensions:2.2.0
  * androidx.lifecycle:lifecycle-compiler:2.2.0

* Circle Image View
  * de.hdodenhof:circleimageview:3.1.0

* Glide
  * com.github.bumptech.glide:glide:4.9.0
  
* RecycleView
  * androidx.recyclerview:recyclerview:1.1.0
  

### Submission Checklist
* Menggunakan **ListView** menampilkan daftar film dengan jumlah minimal 10 item.
* Menampilkan poster dan informasi film pada halaman **detail film**.
* Menggunakan **Parcelable** sebagai interface dari obyek data yang akan dikirimkan antar Activity.

## Kriteria
Fitur yang harus ada pada aplikasi:

### Search User
**Syarat:**
* Pencarian user menggunakan data dari API berjalan dengan baik.
* Pengguna dapat melihat halaman detail dari hasil daftar pencarian.
* Data list user yang ditampilkan menggunakan RecyclerView.

### Detail User
**Syarat:**
* Mempertahankan informasi user yang sudah ditampilkan pada Submission 1.
* Halaman detail disusun menggunakan ConstraintLayout.
* Menampilkan fragment List Follower & List Following yang diambil dari API.
* Menggunakan TabLayout, BottomNavigationView atau yang lainnya sebagai navigasi antara halaman List Follower dan List Following.
* Mempertahankan data saat terjadi configuration change (opsional).

* Terdapat indikator loading saat aplikasi memuat data.
* Mendukung Localization (opsional).

*Catatan:*
* Kriteria yang memiliki keterangan opsional tidak menjadi syarat utama submission Anda diterima, namun akan menjadi nilai lebih jika Anda menerapkannya.


Berikut kerangka tampilan yang bisa Anda gunakan sebagai referensi:

![Gambar Kerangka](https://dicodingacademy.blob.core.windows.net/academies/202004091733556c82a2b113c64ce04efc34f48ffc8949.png)





