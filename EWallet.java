public class EWallet extends Pembayaran {
    private String namaAkun;

    public EWallet(String idTransaksi, double jumlah, String namaAkun) {
        super(idTransaksi, jumlah);
        this.namaAkun = namaAkun;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via E-Wallet atas nama: " + namaAkun);
    }
}