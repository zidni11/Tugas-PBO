public class Transfer extends Pembayaran {
    private String bank;

    public Transfer(String idTransaksi, double jumlah, String bank) {
        super(idTransaksi, jumlah);
        if (bank == null || bank.isBlank()) {
            throw new IllegalArgumentException("Nama bank tidak boleh kosong");
        }
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via Transfer Bank (" + bank + ").");
    }
}