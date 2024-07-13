package model; // Menyatakan bahwa kelas ini berada dalam package model

// Deklarasi kelas Motor yang merupakan turunan dari KendaraanDasar
public class Motor extends KendaraanDasar {
    // Konstruktor untuk menginisialisasi variabel instance dengan memanggil konstruktor superclass
    public Motor(String merek, String model, int kapasitasMesin) {
        super(merek, model, kapasitasMesin);
    }
}

/*
Komponen penting dalam kode di atas:

Deklarasi Package:

package model;: Menyatakan bahwa kelas Motor berada dalam package model.
Kelas Motor:

public class Motor extends KendaraanDasar: Kelas Motor adalah turunan dari kelas KendaraanDasar, yang berarti Motor mewarisi semua properti dan metode dari KendaraanDasar.
Konstruktor:

public Motor(String merek, String model, int kapasitasMesin): Konstruktor ini menerima tiga parameter (merek, model, kapasitasMesin) dan meneruskannya ke konstruktor superclass (KendaraanDasar) menggunakan kata kunci super.
Dengan memanggil super(merek, model, kapasitasMesin), konstruktor Motor menginisialisasi variabel instance yang diwarisi dari KendaraanDasar.
Kelas Motor tidak menambahkan metode atau properti baru selain yang sudah ada di KendaraanDasar. Ini menunjukkan bahwa Motor hanya memerlukan implementasi dasar yang disediakan oleh KendaraanDasar.
*/