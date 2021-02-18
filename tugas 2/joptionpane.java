import javax.swing.JOptionPane;

public class joptionpane {
    public static void main(String[] args) {
        String nama, kelas, nim;
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda: ");
        kelas = JOptionPane.showInputDialog("Masukkan kelas Anda: ");
        nim = JOptionPane.showInputDialog("Masukkan nim Anda: ");
        String pesan = "Nama: " + nama;
        String pesan1 = "Kelas: " + kelas;
        String pesan2 = "nim: " + nim;
        JOptionPane.showMessageDialog(null, pesan);
        JOptionPane.showMessageDialog(null, pesan1);
        JOptionPane.showMessageDialog(null, pesan2);
        System.out.println("==========BIODATA ===========");
System.out.println("nama: " + nama);
System.out.println("kelas: " + kelas);
System.out.println("nim: " + nim);

    }
}
