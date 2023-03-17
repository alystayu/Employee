package employee;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan NIP: ");
        int nip = scan.nextInt();
        scan.nextLine();
        System.out.print("Masukkan Jabatan: ");
        String jabat = scan.nextLine();
        Boss boss = new Boss();
        Manager manager = new Manager();
        CleaningService cleaningService = new CleaningService();
        Internship intern = new Internship();
        int gajiAkhir = 0;
        
        if (jabat.equalsIgnoreCase(boss.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja: ");
            int lamaKerja = scan.nextInt();
            gajiAkhir = boss.hitung(boss.gaji, lamaKerja);
            System.out.print("Gaji Maksimum: " + boss.gaji);
        }
        else if (jabat.equalsIgnoreCase(manager.jabat)) {
        System.out.print("Berapa Lama Waktu Anda Bekerja: ");
        int lamaKerja = scan.nextInt();
        gajiAkhir = manager.hitung(manager.gaji, lamaKerja);
        scan.nextLine();
        System.out.print("Gaji Maksimum: " + manager.gaji);
        }
        else if (jabat.equalsIgnoreCase(intern.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja: ");
            int lamaKerja = scan.nextInt();
            gajiAkhir = intern.hitung(intern.gaji, lamaKerja);
            scan.nextLine();
            System.out.print("Gaji Maksimum: " + intern.gaji);
        }
        else if (jabat.equalsIgnoreCase(cleaningService.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja: ");
            int lamaKerja = scan.nextInt();
            gajiAkhir = cleaningService.hitung(cleaningService.gaji, lamaKerja);
            scan.nextLine();
            System.out.print("Gaji Maksimum: " + cleaningService.gaji);
        }
        scan.nextLine();
        System.out.print("Status (Menikah / Belum Menikah) : ");
        String st = scan.nextLine();
        boolean status = true;
        if (st.equalsIgnoreCase("Menikah")) {
            gajiAkhir += 5500000;
        }
        System.out.println("Gaji Akhir: " + gajiAkhir);
    }
}
