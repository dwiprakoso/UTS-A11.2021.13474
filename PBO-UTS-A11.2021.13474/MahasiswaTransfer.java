public class MahasiswaTransfer extends MahasiswaBaru{
    String asalUniv;

    @Override
    public boolean ikutOspek(){
        return super.ikutOspek();
    }

    @Override
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Asal Universitas : " + this.asalUniv);
    }
}
