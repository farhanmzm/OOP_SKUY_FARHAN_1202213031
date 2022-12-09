public class MainApp {
    public static void main(String[] args) {
        TransportasiAir transport = new TransportasiAir(4, 20000);
        transport.informasi();
        transport.berlayar();
        transport.berlabuh();

        System.out.println();

        Sampan spn = new Sampan(20, 50000, 2);
        spn.informasi();
        spn.berlayar();
        spn.berlabuh();
        spn.berlabuh(2);

        System.out.println();

        Kapal kpl = new Kapal(50, 100000, "Diesel");
        kpl.informasi();
        kpl.berlayar();
        kpl.berlayar(20);
        kpl.berlabuh();
    }
}
