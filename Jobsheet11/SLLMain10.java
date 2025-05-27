import java.util.Scanner;
public class SLLMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SingleLinkedList10 sll = new SingleLinkedList10();

        System.out.print("Masukkan jumlah data: ");
        int input = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < input; i++) {
             System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            System.out.println("Setelah penambahan:");
            sll.print();
        }
        sc.close();
    }
}
