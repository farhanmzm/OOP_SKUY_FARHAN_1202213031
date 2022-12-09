public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan Dengan Kursi Berjumlah " + jumlahKursi + " Ditetapkan Dengan Biaya Sebesar Rp. " + biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan Sedang Berlayar Menggunakan " + layar + "Layar");
    } 
    public void berlabuh(){
        System.out.println("Transportasi Air Jenis Sampan Berlabuh Tanpa Jangkar ");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan Berlabuh di Pantai Menggunakan " + jangkar + " Jangkar");
    }
}
