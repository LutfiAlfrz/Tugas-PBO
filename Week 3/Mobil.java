public class Mobil {
    String merk;
    String warna;
    int tahunProduksi;
    int harga;

    void detail(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: Rp." + harga + " Juta");
    }
}
