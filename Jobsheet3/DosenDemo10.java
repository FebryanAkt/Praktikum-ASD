import java.util.Scanner;
public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen10[] arrayOfDosen =  new Dosen10[3];

        String kode, nama, kelamin;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-"+ (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            kelamin = sc.nextLine();
            jenisKelamin = kelamin.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------");

            arrayOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }
        int i = 0;
            for (Dosen10 dosen : arrayOfDosen) {
                System.out.println("Data Dosen ke-" + (i+1));
                System.out.println("Kode          :" + dosen.kode);
                System.out.println("Nama          :"+ dosen.nama);
                System.out.println("Jenis Kelamin :"+ (dosen.jenisKelamin ? "Pria" : "Wanita"));
                System.out.println("Usia          :"+ dosen.usia);
                System.out.println("------------------------");
        }
    }
}
