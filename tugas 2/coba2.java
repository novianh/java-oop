import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, kelas, jurusan, alamat, JenisKelamin, hobi;
        int nim, umur;
        System.out.println("Masukkan Nama Anda: ");
        nama = input.next();
        System.out.println("Masukkan nim Anda: ");
        nim = input.nextInt();
        System.out.println("Masukkan kelas Anda: ");
        kelas = input.next();
        System.out.println("Masukkan jurusan Anda: ");
        jurusan = input.next();
        System.out.println("Masukkan alamat Anda: ");
        alamat = input.next();
        System.out.println("Masukkan jenis kelamin Anda: ");
        JenisKelamin = input.next();
        System.out.println("Masukkan hobi Anda: ");
        hobi = input.next();
        System.out.println("Masukkan umur Anda: ");
        umur = input.nextInt();

        System.out.println("====================================");
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("jurusan: " + jurusan);
        System.out.println("alamat: " + alamat);
        System.out.println("jenis kelamin: " + JenisKelamin);
        System.out.println("hobi: " + hobi);
        System.out.println("umur: " + umur);
        System.out.println("====================================");
    }
}
