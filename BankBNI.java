public class BankBNI extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer sebesar " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Biaya transfer: Rp" + biaya);
    }
}
