
package program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Nomer1 {
    public static void main(String[] args) throws IOException {

        String nama;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi varibel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();

        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
}
}