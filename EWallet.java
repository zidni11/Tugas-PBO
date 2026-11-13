public class EWallet extends Pembayaran {
    private String namaAkun;

    public EWallet(String nomor, double jumlah, String namaAkun) {
        super(nomor, jumlah);
        if (namaAkun == null || namaAkun.isBlank()) {
            throw new IllegalArgumentException("Nama akun tidak boleh kosong");
        }
        this.namaAkun = namaAkun;
    }

    public String getNamaAkun() {
        return namaAkun;
    }

    @Override
    public long hitungBiaya() {
        return Math.round(jumlah * 0.015);
    }

    @Override
    protected String detailPembayaran() {
        return "E-Wallet (" + namaAkun + ")";
    }
}
