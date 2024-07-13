package model; // Menyatakan bahwa interface ini berada dalam package model

public interface Kendaraan {
    // Deklarasi metode abstrak untuk menggerakkan kendaraan
    void bergerak();
    // Deklarasi metode abstrak untuk menghentikan kendaraan
    void berhenti();
}

/* 
Komponen penting dalam kode di atas:

Deklarasi Package:

package model;: Menyatakan bahwa interface Kendaraan berada dalam package model.
Interface Kendaraan:

Interface Kendaraan mendeklarasikan dua metode abstrak:
void bergerak();: Metode ini harus diimplementasikan oleh setiap kelas yang mengimplementasikan interface Kendaraan untuk mendefinisikan bagaimana kendaraan bergerak.
void berhenti();: Metode ini harus diimplementasikan oleh setiap kelas yang mengimplementasikan interface Kendaraan untuk mendefinisikan bagaimana kendaraan berhenti.
Interface ini menyediakan kontrak yang harus dipenuhi oleh kelas yang mengimplementasikannya, memastikan bahwa semua kendaraan memiliki kemampuan dasar untuk bergerak dan berhenti.
*/