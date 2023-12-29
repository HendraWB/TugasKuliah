// Definisi class Kotak
public class Kotak {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Metode mutator untuk mengatur nilai panjang
    public void setPanjang(double p) {
        panjang = p;
    }

    // Metode aksesor untuk mendapatkan nilai panjang
    public double getPanjang() {
        return panjang;
    }

    // Metode mutator untuk mengatur nilai lebar
    public void setLebar(double l) {
        lebar = l;
    }

    // Metode aksesor untuk mendapatkan nilai lebar
    public double getLebar() {
        return lebar;
    }

    // Metode mutator untuk mengatur nilai tinggi
    public void setTinggi(double t) {
        tinggi = t;
    }

    // Metode aksesor untuk mendapatkan nilai tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Metode untuk menghitung volume kotak
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Main class
public class Main extends Kotak {
    public static void main(String[] args) {
        // bikin tampilan
        JFrame frame = new JFrame("Box Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelPanjang = new JLabel("Masukkan panjang:");
        JTextField textFieldPanjang = new JTextField(10);

        JLabel labelLebar = new JLabel("Masukkan lebar:");
        JTextField textFieldLebar = new JTextField(10);

        JLabel labelTinggi = new JLabel("Masukkan tinggi:");
        JTextField textFieldTinggi = new JTextField(10);

        JButton calculateButton = new JButton("Hitung");

        // masukkan isi di sini
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(labelPanjang);
        frame.add(textFieldPanjang);
        frame.add(labelLebar);
        frame.add(textFieldLebar);
        frame.add(labelTinggi);
        frame.add(textFieldTinggi);
        frame.add(calculateButton);

        // Create object Kotak
        Kotak kotak = new Kotak();

        // tombol
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double panjang = Double.parseDouble(textFieldPanjang.getText());
                double lebar = Double.parseDouble(textFieldLebar.getText());
                double tinggi = Double.parseDouble(textFieldTinggi.getText());

                kotak.setPanjang(panjang);
                kotak.setLebar(lebar);
                kotak.setTinggi(tinggi);

                JOptionPane.showMessageDialog(frame,
                        "Panjang: " + kotak.getPanjang() +
                        "\nLebar: " + kotak.getLebar() +
                        "\nTinggi: " + kotak.getTinggi() +
                        "\nVolume kotak: " + kotak.hitungVolume());
            }
        });

        // Tampilkan frame
        frame.setVisible(true);
    }
}
