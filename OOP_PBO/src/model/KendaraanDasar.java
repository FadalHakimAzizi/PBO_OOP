package model; // Menyatakan bahwa kelas ini berada dalam package model

public abstract class KendaraanDasar implements Kendaraan {
    // Deklarasi variabel instance untuk menyimpan informasi kendaraan
    private String merek;
    private String model;
    private int kapasitasMesin;

    // Konstruktor untuk menginisialisasi variabel instance
    public KendaraanDasar(String merek, String model, int kapasitasMesin) {
        this.merek = merek;
        this.model = model;
        this.kapasitasMesin = kapasitasMesin;
    }

    // Metode getter untuk mendapatkan merek kendaraan
    public String getMerek() {
        return merek;
    }

    // Metode setter untuk mengatur merek kendaraan
    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Metode getter untuk mendapatkan model kendaraan
    public String getModel() {
        return model;
    }

    // Metode setter untuk mengatur model kendaraan
    public void setModel(String model) {
        this.model = model;
    }

    // Metode getter untuk mendapatkan kapasitas mesin kendaraan
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Metode setter untuk mengatur kapasitas mesin kendaraan
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    // Implementasi metode bergerak dari interface Kendaraan
    public void bergerak() {
        System.out.println(merek + " " + model + " sedang bergerak.");
    }

    // Implementasi metode berhenti dari interface Kendaraan
    public void berhenti() {
        System.out.println(merek + " " + model + " telah berhenti.");
    }

    // Override metode toString() untuk memberikan representasi string dari objek kendaraan
    @Override
    public String toString() {
        return "Merek: " + merek + ", Model: " + model + ", Kapasitas Mesin: " + kapasitasMesin + " cc";
    }
}

/*
Komponen penting dalam kode di atas:

Deklarasi Package:

package model;: Menyatakan bahwa kelas KendaraanDasar berada dalam package model.
Variabel Instance:

private String merek;
private String model;
private int kapasitasMesin;
Variabel-variabel ini menyimpan informasi dasar tentang kendaraan.
Konstruktor:

Konstruktor KendaraanDasar(String merek, String model, int kapasitasMesin) menginisialisasi variabel instance dengan nilai yang diberikan.
Metode Getter dan Setter:

Metode-metode ini digunakan untuk mendapatkan dan mengatur nilai dari variabel instance merek, model, dan kapasitasMesin.
Implementasi Metode dari Interface:

void bergerak(): Menampilkan pesan bahwa kendaraan sedang bergerak.
void berhenti(): Menampilkan pesan bahwa kendaraan telah berhenti.
Metode toString():

Metode ini memberikan representasi string dari objek kendaraan, termasuk merek, model, dan kapasitas mesin.
Kelas abstrak ini menyediakan dasar bagi kelas-kelas konkret yang mewakili kendaraan tertentu (seperti mobil dan motor) untuk mewarisi dan mengimplementasikan metode tambahan atau menyesuaikan perilaku yang sudah ada.
*/

