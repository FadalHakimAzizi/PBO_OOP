import java.awt.event.ActionEvent; // Impor kelas ActionEvent untuk menangani aksi pada komponen GUI
import java.awt.event.ActionListener; // Impor interface ActionListener untuk mendefinisikan listener aksi
import model.Mobil; // Impor kelas Mobil dari package model
import model.Motor; // Impor kelas Motor dari package model

public class MainController {
    // Deklarasi variabel instance untuk menyimpan referensi ke view, mobil, dan motor
    private MainView view;
    private Mobil mobil;
    private Motor motor;

    // Konstruktor MainController menerima parameter view, mobil, dan motor
    public MainController(MainView view, Mobil mobil, Motor motor) {
        // Inisialisasi variabel instance dengan nilai parameter yang diterima
        this.view = view;
        this.mobil = mobil;
        this.motor = motor;

        // Menambahkan ActionListener ke tombol untuk menggerakkan mobil
        this.view.getMoveCarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Panggil metode bergerak() pada objek mobil
                mobil.bergerak();
                // Tambahkan teks ke area tampilan pada view untuk menunjukkan bahwa mobil bergerak
                view.getDisplayArea().append(mobil.toString() + " bergerak.\n");
            }
        });

        // Menambahkan ActionListener ke tombol untuk menghentikan mobil
        this.view.getStopCarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Panggil metode berhenti() pada objek mobil
                mobil.berhenti();
                // Tambahkan teks ke area tampilan pada view untuk menunjukkan bahwa mobil berhenti
                view.getDisplayArea().append(mobil.toString() + " berhenti.\n");
            }
        });

        // Menambahkan ActionListener ke tombol untuk menggerakkan motor
        this.view.getMoveMotorButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Panggil metode bergerak() pada objek motor
                motor.bergerak();
                // Tambahkan teks ke area tampilan pada view untuk menunjukkan bahwa motor bergerak
                view.getDisplayArea().append(motor.toString() + " bergerak.\n");
            }
        });

        // Menambahkan ActionListener ke tombol untuk menghentikan motor
        this.view.getStopMotorButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Panggil metode berhenti() pada objek motor
                motor.berhenti();
                // Tambahkan teks ke area tampilan pada view untuk menunjukkan bahwa motor berhenti
                view.getDisplayArea().append(motor.toString() + " berhenti.\n");
            }
        });
    }
}

/*
Komponen penting dalam kode di atas:

Deklarasi dan Inisialisasi: MainController menyimpan referensi ke objek MainView, Mobil, dan Motor.
ActionListeners: Listener ditambahkan ke tombol-tombol di MainView untuk menangani aksi yang terkait dengan menggerakkan dan menghentikan mobil serta motor.
getMoveCarButton: Listener untuk tombol menggerakkan mobil, memanggil metode bergerak pada objek mobil dan menambahkan pesan ke area tampilan.
getStopCarButton: Listener untuk tombol menghentikan mobil, memanggil metode berhenti pada objek mobil dan menambahkan pesan ke area tampilan.
getMoveMotorButton: Listener untuk tombol menggerakkan motor, memanggil metode bergerak pada objek motor dan menambahkan pesan ke area tampilan.
getStopMotorButton: Listener untuk tombol menghentikan motor, memanggil metode berhenti pada objek motor dan menambahkan pesan ke area tampilan.
*/