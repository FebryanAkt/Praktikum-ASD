public class MahasiswaBerprestasi10 {
    Mahasiswa10 [] listMhs = new Mahasiswa10[5];
    int idx;

    void tambah(Mahasiswa10 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.err.println("data sudah penuh");
        }
    }
    void tampil(){
        for (Mahasiswa10 m:listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa10 tmp = listMhs[j];
                    listMhs[j]= listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
