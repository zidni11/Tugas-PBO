public class EWallet extends Pembayaran {
    private String namaAkun;

    public EWallet(String idTransaksi, double jumlah, String namaAkun) {
        super(idTransaksi, jumlah);
        if (namaAkun == null || namaAkun.isBlank()) {
            throw new IllegalArgumentException("Nama akun tidak boleh kosong");
        }
        this.namaAkun = namaAkun;
    }

    public String getNamaAkun() {
        return namaAkun;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via E-Wallet atas nama: " + namaAkun);
    }
}