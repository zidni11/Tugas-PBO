public class Transfer extends Pembayaran {
    private String bank;

    public Transfer(String nomor, double jumlah, String bank) {
        super(nomor, jumlah);
        if (bank == null || bank.isBlank()) {
            throw new IllegalArgumentException("Nama bank tidak boleh kosong");
        }
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public long hitungBiaya() {
        return 4000;
    }

    @Override
    protected String detailPembayaran() {
        return "Transfer Bank (" + bank + ")";
    }
}
