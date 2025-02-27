import java.util.Scanner;
public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukka Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       :");
            kode = sc.nextLine();
            System.out.print("Nama       :");
            nama = sc.nextLine();
            System.out.print("SKS        :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------");
            arrayOfMatakuliah[i] = new Matakuliah10(kode, nama, sks, jumlahJam);
        }
    }
}
