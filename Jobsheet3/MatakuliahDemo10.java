import java.util.Scanner;
public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[3];
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah10("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData();
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
