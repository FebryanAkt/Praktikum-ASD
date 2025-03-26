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
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa10 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs [i];
            listMhs[i] = tmp;
        }
    }
    // void insertionSort(){
    //     for (int i = 1; i < listMhs.length; i++) {
    //         Mahasiswa10 temp = listMhs[i];
    //         int j = i;
    //         while (j>0 && listMhs[j-1].ipk>temp.ipk) {
    //             listMhs[j]=listMhs[j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa10 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
