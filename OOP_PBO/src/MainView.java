import javax.swing.*; // Impor semua kelas dari paket javax.swing untuk komponen GUI
import java.awt.*; // Impor semua kelas dari paket java.awt untuk tata letak dan manajemen GUI
import java.awt.event.ActionListener; // Impor ActionListener untuk menangani aksi tombol

public class MainView extends JFrame {
    // Deklarasi komponen GUI sebagai variabel instance
    private JTextArea displayArea; // Area teks untuk menampilkan status kendaraan
    private JButton moveCarButton; // Tombol untuk menggerakkan mobil
    private JButton stopCarButton; // Tombol untuk menghentikan mobil
    private JButton moveMotorButton; // Tombol untuk menggerakkan motor
    private JButton stopMotorButton; // Tombol untuk menghentikan motor

    // Konstruktor MainView untuk inisialisasi dan pengaturan GUI
    public MainView() {
        // Mengatur judul jendela
        setTitle("Kendaraan App");
        // Mengatur ukuran jendela
        setSize(500, 400);
        // Mengatur operasi yang dilakukan saat jendela ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Mengatur tata letak jendela utama menggunakan BorderLayout
        setLayout(new BorderLayout());

        // Membuat area teks dengan ukuran 10 baris dan 50 kolom, dan mengatur agar tidak bisa diedit
        displayArea = new JTextArea(10, 50);
        displayArea.setEditable(false);
        displayArea.setLineWrap(true); // Membungkus teks ke baris berikutnya
        displayArea.setWrapStyleWord(true); // Membungkus teks di antara kata-kata
        displayArea.setFont(new Font("Arial", Font.PLAIN, 14)); // Mengatur font teks area
        displayArea.setMargin(new Insets(10, 10, 10, 10)); // Menambahkan margin di dalam teks area

        // Membuat panel untuk tombol-tombol
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 10, 10)); // Menggunakan GridLayout untuk tata letak tombol
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Menambahkan border kosong di sekitar panel tombol

        // Membuat tombol-tombol dengan label sesuai fungsinya dan menambahkan gaya
        moveCarButton = createStyledButton("Gerakan Mobil");
        stopCarButton = createStyledButton("Hentikan Mobil");
        moveMotorButton = createStyledButton("Gerakan Motor");
        stopMotorButton = createStyledButton("Hentikan Motor");

        // Menambahkan tombol-tombol ke dalam panel tombol
        buttonPanel.add(moveCarButton);
        buttonPanel.add(stopCarButton);
        buttonPanel.add(moveMotorButton);
        buttonPanel.add(stopMotorButton);

        // Menambahkan area teks dan panel tombol ke jendela utama
        add(new JScrollPane(displayArea), BorderLayout.CENTER); // Menambahkan JScrollPane agar area teks bisa digulir
        add(buttonPanel, BorderLayout.SOUTH); // Menambahkan panel tombol ke bagian bawah jendela
    }

    // Metode untuk membuat tombol dengan gaya
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14)); // Mengatur font tombol
        button.setBackground(new Color(100, 150, 255)); // Mengatur warna latar belakang tombol
        button.setForeground(Color.WHITE); // Mengatur warna teks tombol
        button.setFocusPainted(false); // Menghilangkan efek fokus pada tombol
        button.setBorder(BorderFactory.createRaisedBevelBorder()); // Mengatur border tombol dengan efek bevel
        return button;
    }

    // Metode getter untuk mendapatkan referensi ke komponen GUI

    public JTextArea getDisplayArea() {
        return displayArea;
    }

    public JButton getMoveCarButton() {
        return moveCarButton;
    }

    public JButton getStopCarButton() {
        return stopCarButton;
    }

    public JButton getMoveMotorButton() {
        return moveMotorButton;
    }

    public JButton getStopMotorButton() {
        return stopMotorButton;
    }

    // Metode untuk menambahkan ActionListener pada tombol
    public void addActionListener(ActionListener listener) {
        moveCarButton.addActionListener(listener);
        stopCarButton.addActionListener(listener);
        moveMotorButton.addActionListener(listener);
        stopMotorButton.addActionListener(listener);
    }
}


/*
Komponen penting dalam kode di atas:

Deklarasi dan Inisialisasi Komponen GUI:

JTextArea displayArea: Area teks untuk menampilkan status kendaraan yang tidak dapat diedit oleh pengguna.
JButton moveCarButton, stopCarButton, moveMotorButton, stopMotorButton: Tombol-tombol untuk menggerakkan dan menghentikan mobil dan motor.
Konstruktor MainView:

Mengatur judul, ukuran, dan operasi tutup jendela.
Menginisialisasi area teks dan tombol-tombol.
Membuat panel dengan tata letak aliran untuk menampung dan mengatur komponen-komponen GUI.
Menambahkan area teks dalam JScrollPane untuk memungkinkan pengguliran teks.
Menambahkan semua komponen ke panel dan kemudian menambahkan panel ke jendela utama.
Metode Getter:

Metode-metode ini memungkinkan kelas lain untuk mendapatkan referensi ke komponen GUI, sehingga dapat menambahkan listener atau melakukan operasi lain pada komponen tersebut.
*/