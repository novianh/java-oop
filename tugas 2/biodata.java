
//kode dibawah harus ditulis sebelum class java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class biodata {
    public static void main(String[] args) {
        // Deklarasi variabel bufferedreader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Ambil nilai dari keyboard
        try {
            System.out.print("Masukkan Nama = ");
            String nama = input.readLine();
            System.out.print("Masukkan Tempat, Tanggal lahir = ");
            String ttl = input.readLine();
            System.out.print("Masukkan Alamat = ");
            String alamat = input.readLine();
            System.out.print("Masukkan Asal Sekolah = ");
            String sekolah = input.readLine();
            System.out.print("Masukkan NPM = ");
            String Nim = input.readLine();
            // Tampilkan data dari variabel bufferedreader
            System.out.println("-------------BIODATA ANDA--------------");
            System.out.println("nama = " + nama);
            System.out.println("ttl = " + ttl);
            System.out.println("alamat = " + alamat);
            System.out.println("sekolah = " + sekolah);
            System.out.println("Nim = " + Nim);
        } catch (IOException e) {
            System.out.println("Error pada saat input data");
        }
    }
}