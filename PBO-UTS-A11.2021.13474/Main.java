import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
            int pilih;
            String ulang;
            System.out.print("Masukan jumlah mahasiswa : "); //kurang spasi buat inputan
            int jumlahMahasiswa = input.nextInt();

            do{  //dicoba pake do while
                System.out.println("1. Mahasiswa Aktif");
                System.out.println("2. Mahasiswa Baru");
                System.out.println("3. Mahasiswa Transfer");
                System.out.println("4. Mahasiswa Lulus");
                System.out.print("Pilih nomer : "); 
                pilih = input.nextInt();
                switch(pilih) {
                    case 1: //mahasiswa aktif
                        for(int i = 0; i < jumlahMahasiswa; i++){
                            Mahasiswa mahasiswa = new Mahasiswa();
                            System.out.println("Data Mahasiswa ke - " + (i+1));
                            System.out.print("Nama : ");
                            mahasiswa.nama = input.next();
                            System.out.print("NIM : ");
                            mahasiswa.nim = input.next();
                            System.out.print("Semester : ");
                            mahasiswa.semester = input.nextInt();
                            System.out.print("Usia : ");
                            mahasiswa.usia = input.nextInt();
                            mahasiswa.inputKrs();
                            mahasiswa.hitungRataNilai();
                            daftarMahasiswa.add(mahasiswa);
                        }
                        break;
                    case 2: //mahasiswa baru
                        for(int i = 0; i < jumlahMahasiswa; i++){
                            MahasiswaBaru mhsBaru = new MahasiswaBaru();
                            System.out.println("Data Mahasiswa ke - " + (i+1));
                            System.out.print("Nama : ");
                            mhsBaru.nama = input.next();
                            System.out.print("NIM : ");
                            mhsBaru.nim = input.next();
                            System.out.print("Asal Sekolah :");
                            mhsBaru.asalSekolah = input.next();
                            System.out.print("Semester :");
                            mhsBaru.semester = input.nextInt();
                            System.out.print("Usia :");
                            mhsBaru.usia = input.nextInt();
                            mhsBaru.inputKrs();
                            mhsBaru.hitungRataNilai();
                            daftarMahasiswa.add(mhsBaru);
                        }
                        break;
                    case 3: //mahasiswa transfer
                        for(int i = 0; i < jumlahMahasiswa; i++){
                            MahasiswaTransfer mhsTransfer = new MahasiswaTransfer();
                            System.out.println("Data Mahasiswa ke - " + (i+1));
                            System.out.print("Nama : ");
                            mhsTransfer.nama = input.next();
                            System.out.print("NIM : ");
                            mhsTransfer.nim = input.next();
                            System.out.print("Asal Universitas : ");
                            mhsTransfer.asalUniv = input.next();
                            System.out.print("Semester : ");
                            mhsTransfer.semester = input.nextInt();
                            System.out.print("Usia :");
                            mhsTransfer.usia = input.nextInt();
                            mhsTransfer.inputKrs();
                            mhsTransfer.hitungRataNilai();
                            daftarMahasiswa.add(mhsTransfer);
                        }
                        break;
                    case 4: //mahasiswa lulus
                        for(int i = 0; i < jumlahMahasiswa; i++){
                            MahasiswaLulus mhsLulus = new MahasiswaLulus();
                            System.out.println("Data Mahasiswa ke - " + (i+1));
                            System.out.print("Nama : ");
                            mhsLulus.nama = input.next();
                            System.out.print("NIM : ");
                            mhsLulus.nim = input.next();
                            System.out.print("Semester : ");
                            mhsLulus.semester = input.nextInt();
                            System.out.print("Usia : ");
                            mhsLulus.usia = input.nextInt();
                            System.out.print("Tahun Masuk : ");
                            mhsLulus.tahunMasuk = input.nextInt();
                            mhsLulus.inputKrs();
                            mhsLulus.hitungRataNilai();
                            daftarMahasiswa.add(mhsLulus);
                        }
                        break;
                    
                }
                for (int i = 0; i< daftarMahasiswa.size(); i++){
                    System.out.println("\nData Mahasiswa ke - " + (i+1));
                    daftarMahasiswa.get(i).infoMahasiswa();
                    daftarMahasiswa.get(i).infoKrsMahasiswa();
                }
                System.out.print("Apakah ingin memasukan data kembali?(Y/N): ");
                Scanner in = new Scanner(System.in);
                ulang = in.nextLine();
                in.close();
            } while (ulang.equalsIgnoreCase("Y"));
        }


    }
}
