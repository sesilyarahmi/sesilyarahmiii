public class Main {
    public static void main(String[]args){
        System.out.println();

        Mobil mobil1 = new Mobil();
        mobil1.merek = "Toyota";
        mobil1.warna = "putih";
        mobil1.jumlahroda = "4";
        mobil1.jumlahpintu = "4";
        mobil1.kecepatan(45);
        mobil1.berjalan(15);
        System.out.println();

        Motor motor1 = new Motor();
        motor1.merek = "Scoopy";
        motor1.warna = "merah";
        motor1.jumlahroda = "4";
        motor1.jumlahspion = "2";
        motor1.kecepatan(30);
        motor1.berjalan(10);

    }
}
