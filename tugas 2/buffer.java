import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukkan Nama Anda: ");
            String  nama = input.readLine();
            System.out.println("Masukkan kelas Anda: ");
            String kelas = input.readLine();
            System.out.println("Masukkan nim Anda: ");
            String nim = input.readLine();
            System.out.println("Masukkan jenis kelamin Anda: ");
            String JenisKelamin = input.readLine();
            
            System.out.println("==============BIODATA===============");
            System.out.println("Nama: " + nama);
            System.out.println("Kelas: " + kelas);
            System.out.println("Nim: " + nim);
            System.out.println("Jenis Kelamin: " + JenisKelamin);
            System.out.println("====================================");
        }
            catch (IOException e) {
                System.out.println("Error!");
            }
    }
}
