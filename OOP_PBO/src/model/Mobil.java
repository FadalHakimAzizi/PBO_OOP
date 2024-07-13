package model; // Menyatakan bahwa kelas ini berada dalam package model

// Deklarasi kelas Mobil yang merupakan turunan dari KendaraanDasar
public class Mobil extends KendaraanDasar {
    // Konstruktor untuk menginisialisasi variabel instance dengan memanggil konstruktor superclass
    public Mobil(String merek, String model, int kapasitasMesin) {
        super(merek, model, kapasitasMesin);
    }
}

/*
Komponen penting dalam kode di atas:

Deklarasi Package:

package model;: Menyatakan bahwa kelas Mobil berada dalam package model.
Kelas Mobil:

public class Mobil extends KendaraanDasar: Kelas Mobil adalah turunan dari kelas KendaraanDasar, yang berarti Mobil mewarisi semua properti dan metode dari KendaraanDasar.
Konstruktor:

public Mobil(String merek, String model, int kapasitasMesin): Konstruktor ini menerima tiga parameter (merek, model, kapasitasMesin) dan meneruskannya ke konstruktor superclass (KendaraanDasar) menggunakan kata kunci super.
Dengan memanggil super(merek, model, kapasitasMesin), konstruktor Mobil menginisialisasi variabel instance yang diwarisi dari KendaraanDasar.
Kelas Mobil tidak menambahkan metode atau properti baru selain yang sudah ada di KendaraanDasar. Ini menunjukkan bahwa Mobil hanya memerlukan implementasi dasar yang disediakan oleh KendaraanDasar.
*/