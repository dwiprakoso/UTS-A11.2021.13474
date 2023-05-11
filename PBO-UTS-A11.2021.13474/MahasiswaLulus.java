public class MahasiswaLulus extends Mahasiswa{
    int tahunWisuda;
    float ipk;

    public boolean ikutWisuda(){
        if(tahunMasuk > 2018 && tahunWisuda <= 2020){
            System.out.println("Mahasiswa Harus Sudah Lulus");
            return true;
        }else{
            System.out.print("Mahasiswa belum lulus");
            return false;
        }
    }
    
    @Override
    public void infoMahasiswa(){
        if(ikutWisuda()== true){
            super.infoMahasiswa();
            int temp = loop * 4;
            this.ipk = (super.totalIPK / temp) + 2;
            System.out.println("Lulus dengan IPK " + ipk);
        }
    }

}
