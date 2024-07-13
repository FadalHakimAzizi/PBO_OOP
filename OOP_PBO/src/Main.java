import javax.swing.SwingUtilities; // Impor kelas SwingUtilities untuk manajemen thread GUI
import model.Mobil; // Impor kelas Mobil dari package model
import model.Motor; // Impor kelas Motor dari package model

/*
1. Inheritance (Pewarisan)
Inheritance adalah konsep di mana sebuah kelas mewarisi properti dan metode dari kelas lain. Dalam kode Anda:

Kelas Mobil dan Motor mewarisi dari KendaraanDasar:
public class Mobil extends KendaraanDasar
public class Motor extends KendaraanDasar
Ini menunjukkan bahwa kelas Mobil dan Motor mewarisi semua atribut dan metode yang didefinisikan di dalam KendaraanDasar.
2. Class (Kelas)
Class adalah blueprint atau template untuk membuat objek. Ini mendefinisikan atribut dan metode yang dimiliki oleh objek. Dalam kode Anda:

KendaraanDasar adalah kelas abstrak yang mendefinisikan atribut dan metode dasar yang dimiliki oleh kendaraan.
Mobil dan Motor adalah kelas konkret yang mewarisi dari KendaraanDasar dan dapat diinstansiasi untuk membuat objek mobil dan motor.
3. Object (Objek)
Object adalah instansi dari kelas. Objek adalah entitas yang dibuat berdasarkan blueprint yang didefinisikan oleh kelas. Dalam kode yang diberikan, objek-objek ini akan dibuat di luar kode yang telah disediakan (misalnya, dalam kelas Main), menggunakan konstruktor Mobil dan Motor:

Contoh objek:
Mobil mobil = new Mobil("Toyota", "Avanza", 1500);
Motor motor = new Motor("Honda", "CBR", 250);
4. Interface
Interface adalah sebuah kontrak yang mendefinisikan metode yang harus diimplementasikan oleh kelas yang mengimplementasikan interface tersebut. Dalam kode Anda:

Kendaraan adalah interface yang mendeklarasikan metode bergerak dan berhenti, yang harus diimplementasikan oleh kelas yang mengimplementasikan interface ini, seperti KendaraanDasar, Mobil, dan Motor.
5. Encapsulation (Enkapsulasi)
Encapsulation adalah konsep di mana data (variabel) dan metode yang beroperasi pada data tersebut dibungkus dalam satu unit (kelas), dan akses ke data tersebut dibatasi menggunakan metode getter dan setter. Dalam kode Anda:

Kelas KendaraanDasar menggunakan enkapsulasi dengan mendeklarasikan variabel instance merek, model, dan kapasitasMesin sebagai private, dan menyediakan metode getter dan setter untuk mengakses dan memodifikasi nilai-nilai tersebut.
private String merek;
public String getMerek()
public void setMerek(String merek)
Begitu juga untuk model dan kapasitasMesin.
Ringkasan untuk setiap konsep:

Inheritance: Mobil dan Motor mewarisi dari KendaraanDasar.
Class: KendaraanDasar, Mobil, Motor, dan MainView adalah kelas.
Object: Instansi dari kelas seperti Mobil dan Motor.
Interface: Kendaraan adalah interface.
Encapsulation: Variabel merek, model, dan kapasitasMesin di KendaraanDasar dengan akses melalui getter dan setter.
*/
public class Main {
    public static void main(String[] args) {
        // Gunakan SwingUtilities untuk menjalankan kode pada Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Buat instance dari MainView
                MainView view = new MainView();
                // Buat instance dari Mobil dengan merek "Toyota", model "Avanza", dan kapasitas mesin 1500 cc
                Mobil mobil = new Mobil("Toyota", "Avanza", 1500);
                // Buat instance dari Motor dengan merek "Honda", model "CBR", dan kapasitas mesin 250 cc
                Motor motor = new Motor("Honda", "CBR", 250);
                // Buat instance dari MainController dengan parameter view, mobil, dan motor
                MainController controller = new MainController(view, mobil, motor);
                
                // Set tampilan view agar terlihat
                view.setVisible(true);
            }
        });
    }
}

/* 
Komponen penting dalam kode di atas:

SwingUtilities.invokeLater: Metode ini digunakan untuk memastikan bahwa pembuatan dan manipulasi komponen Swing terjadi di Event Dispatch Thread (EDT), yang diperlukan untuk menjaga thread-safety dari GUI.
MainView: Sebuah kelas yang mewakili tampilan utama dari aplikasi.
Mobil dan Motor: Kelas model yang mungkin menyimpan data terkait dengan mobil dan motor.
MainController: Kelas controller yang menghubungkan tampilan dengan model (mobil dan motor) dan mungkin mengandung logika bisnis aplikasi.
*/