package employee;

public class Internship extends Pegawai{
    String jabat = "Intern";
    int gaji = 8000000;
    
    int hitung(int gaji, int jamKerja) {
        int potongan = (super.jamKerja - jamKerja) * super.pot;
        int hasil = gaji - potongan;
        return hasil;
    }
}
