import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Restaurant pesanan = new Restaurant();
        int IDkostumer, jumlahpesanan;
        try {

            System.out.print("Enter Customer ID: ");
            IDkostumer = masukan.nextInt();

            System.out.print("Enter how much Food to made: ");
            jumlahpesanan = masukan.nextInt();

            Thread t1 = new Thread(pesanan);
            Waiter pelayan = new Waiter(IDkostumer, jumlahpesanan);
            Thread t2 = new Thread(pelayan);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}