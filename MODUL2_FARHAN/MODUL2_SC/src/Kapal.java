public class Kapal extends TransportasiAir {
    protected String mesin;
    
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal Dengan Kursi Berjumlah " + jumlahKursi + " Ditetapkan Dengan Biaya Sebesar Rp. " + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal Sedang Berlayar Menggunakan Mesin " + mesin + " Dengan Kecepatan Yang Tidak Stabil");
    }

    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal Sedang Berlayar Menggunakan Mesin " + mesin + " Dengan Kecepatan Stabil Di Kisaran " + kecepatan + " knot");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal Berlabuh Di Pantai");
    }
}