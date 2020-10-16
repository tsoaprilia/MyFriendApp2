# MyFriendApp
MyFriendApp adalah aplikasi yang menampilkan informasi teman dalam bentuk list. Untuk menampikan List tersebut dibutuhkan komponen view RecyclerView. RecyclerView adalah komponen View yang tidak disediakan secara default. Maka, harus dilakukan penambahan library RecyclerView pada project MyFriendApp. [ Baca Selengkapnya...](https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=id)

# Tampilan Aplikasi 

## 1. Tampilan Halaman Utama(Awal)
Pada halaman utama terdapat notifikasi belum mempunyai teman. Untuk menambahkan teman kita menggunkaan button (+).
Untuk menampilkan Button Floating (mengembang) berbentuk lingkaran kita bisa menggunkan komponen material View dari material design yaitu Floating Action Button (FAB).
Untuk dapat menggunakan FAB, harus menambahkan beberapa Script di file Gradle Module.  [ Baca Selengkapnya...](https://byjonathanblog.wordpress.com/2018/11/13/floating-action-button-definisi-dan-studi-kasus/)

- Database merupakan sebuah class yang di gunakan untuk mendaftarkan Data Access Object (DAO) dan Entitas. [ Baca Selengkapnya...](https://developer.android.com/training/data-storage/room?hl=id)

- Fragment adalah class yang pada umumnya digunakan untuk kebutuhan menampilkan lebih dari satu fitur pada satu halaman.Pada project aplikasi MyFriendApp, akan 
digunakan di dua Fragment (MyFriendsFragment.kt dan MyFriendsAddFragment.kt) pada satu Activity (MainActivity.kt).[ Baca Selengkapnya...](//www.codepolitan.com/membuat-dan-menggunakan-fragment-59f80eff061a4d)  
![WhatsApp Image 2020-10-16 at 20 19 50 (1)](https://user-images.githubusercontent.com/60412314/96265929-4179c880-0ff0-11eb-9029-821718ce48f2.jpeg)



## 2. Tampilan Pengisian Form

![WhatsApp Image 2020-10-16 at 19 56 29 (1)](https://user-images.githubusercontent.com/60412314/96265917-3de64180-0ff0-11eb-8442-ed019d362df9.jpeg)

Pada pengisian Form apabila terdapat kekosongan data akan muncul notifikasi " Tidak boleh kosong "

![WhatsApp Image 2020-10-16 at 21 14 04](https://user-images.githubusercontent.com/60412314/96269464-9cadba00-0ff4-11eb-9bfd-4d90fd8e970f.jpeg)

Form hanya bisa disubmit jika semua data lengkap atau tidak kosong.

![WhatsApp Image 2020-10-16 at 19 56 29 (2)](https://user-images.githubusercontent.com/60412314/96265901-3888f700-0ff0-11eb-878b-1f98d17fd549.jpeg)



## 3. Tampilan Halaman Utama Setelah Menambahkan Teman

Tampilan informasi teman berbentuk list.
Untuk menampilkan data list pada RecyclerView, setidaknya ada 3 hal yang perlu dilakukan membuat data class untuk menampung data list item, membuat class RecyclerView Adapter untuk menampilkan data per item, dan menampilkan data list pada RecyclerView.
- Data Class : sebuah class yang digunakan untuk menampung data. [ Baca Selengkapnya...](https://medium.com/@yogiwisesa/kotlin-data-class-b2eae1b60751)
- RcyclerView : ecyclerview merupakan komponent dasar di android untuk menampilkan data berupa list, dimana kita tidak mengetahui berapa banyak data yang akan ditampilkan, jadi recyclerview memungkinkan kita untuk menambah data secara dynamic kedalam view kita. [ Baca Selengkapnya...](https://pratamawijaya.com/programming/android-recyclerview-kotlin/)

![WhatsApp Image 2020-10-16 at 20 19 50](https://user-images.githubusercontent.com/60412314/96265943-4474b900-0ff0-11eb-92a1-ff9c8c4114da.jpeg)

# Terimakasih :)
