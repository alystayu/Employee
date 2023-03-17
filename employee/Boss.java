package employee;

public class Boss extends Pegawai {
   String jabat = "boss";
   int gaji = 250000000;
   
   @Override
   int hitung(int gaji, int jamKerja) {
       int potongan = (super.jamKerja - jamKerja) * super.pot;
       int hasil = gaji - potongan;
       return hasil;
       
   }
}
