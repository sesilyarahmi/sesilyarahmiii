public class Mobil extends Kendaraan {
    public String jumlahpintu;

    public void kecepatan(int kecepatan){
        System.out.println("Kecepatan Mobil dengan Merek "  + merek +  " adalah "  + kecepatan +  " km/jam ");
    }
    public void berjalan(int jarak){
        System.out.println("Mobil dengan Merek "  + merek +  " telah Menempuh Perjalan Sejauh " + jarak +  " km ");
    }
    
}
