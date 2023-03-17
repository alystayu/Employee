package employee;

public class Manager extends Pegawai{
    String jabat = "Manager";
    int gaji = 15000000;
    
    int hitung(int gaji, int jamKerja) {
        int potongan = (super.jamKerja - jamKerja) * super.pot;
        int hasil = gaji - potongan;
        return hasil;
        
    }
} 
