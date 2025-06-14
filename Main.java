public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST OVERLOADING ===");
        Bank bank = new Bank();
        bank.transferUang(1000000, "1234567890");
        bank.transferUang(1500000, "1234567890", "BCA");
        bank.transferUang(2000000, "9876543210", "Mandiri", "Bayar SPP");
        bank.sukuBunga();

        System.out.println("\n=== TEST OVERRIDING ===");
        BankBNI bni = new BankBNI();
        bni.sukuBunga();
        bni.transferUang(500000, "1234567890", "");

        BankBCA bca = new BankBCA();
        bca.sukuBunga();
        bca.transferUang(750000, "9876543210", "");
    }
}
