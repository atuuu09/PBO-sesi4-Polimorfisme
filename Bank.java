public class Bank {
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Biaya transfer: Rp" + biaya);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan berita: " + berita);
    }

    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    public int hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BCA")) return 6500;
        else if (bankTujuan.equalsIgnoreCase("BNI")) return 4000;
        else return 5000;
    }
}
