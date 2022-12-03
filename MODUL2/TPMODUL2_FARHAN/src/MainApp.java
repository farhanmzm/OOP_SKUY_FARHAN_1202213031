public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 8, 3.2f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(false, "Sandisk", 8, 2.2f);
        hp.informasi();
        hp.telfon(8215275);
        hp.kirimSMS(230903);
        hp.kirimSMSBanyak(12345, 56789);

        System.out.println();

        Laptop laptop = new Laptop("Seagate", 16, 3.2f, false);
        laptop.informasi();
        laptop.bukaGame("valorant");
        laptop.kirimEmail("iniemail@gmail.com");
        laptop.KirimEmailBanyak("iniemail@mail.com", "ituemail@mail.com");
    }
}