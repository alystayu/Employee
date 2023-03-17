package employee;

public class CleaningService extends Pegawai{
    String jabat = "Cleaning Service";
    int gaji = 2000000;
    
    int hitung(int gaji, int jamKerja) {
        int potongan =(super.jamKerja - jamKerja) * super.pot;
        int hasil = gaji - potongan;
        return hasil;
    }
}
