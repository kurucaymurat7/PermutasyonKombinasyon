package package01;

public class main {
    public static void main(String[] args) {

    ///*  Problem Tanımı
    //            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
    //            Hatırlatma C(n,r) = n! / (r!(n-r)!)
    //            Verilen iki sayının permütasyonunu bulan kodu yazınız.
    //            Hatırlatma P(n,r) = n! / (n-r)!
    //            Ekran Çıktısı
    //            Birinci sayıyı giriniz: 15
    //            Ikinci sayıyı giriniz: 4
    //            Kombinasyon: 1365
    //            permütasyon: 32760
    //            Birinci sayıyı giriniz: 5
    //            Ikinci sayıyı giriniz: 3
    //            Kombinasyon: 10
    //            permütasyon: 60
    //          */

        int sayi1 = 15;
        int sayi2 = 4;
        double kombinasyonSonuc = 1;
        double permutasyonSonuc = 1;

        kombinasyonSonuc = kombinasyon(sayi1, sayi2);
        permutasyonSonuc = permutasyon(sayi1,sayi2);

        System.out.println("Kombinasyon : " + kombinasyonSonuc);
        System.out.println("Permutasyon : " + permutasyonSonuc);
    }

    private static double faktoriyel(int sayi) {
        double faktoriyelSonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyelSonuc *= i;
        }
        return faktoriyelSonuc;
    }

    private static double kombinasyon(int sayi1, int sayi2) {
        double sayi1Faktoriyel = faktoriyel (sayi1);
        double sayi2Faktoriyel = faktoriyel (sayi2);
        double sayi1FarkSayi2Faktoriyel= faktoriyel (sayi1-sayi2);
        return sayi1Faktoriyel / ((sayi2Faktoriyel)*(sayi1FarkSayi2Faktoriyel));
    }

    private static double permutasyon(int sayi1, int sayi2) {
        double sayi1Faktoriyel = faktoriyel (sayi1);
        double sayi1FarkSayi2Faktoriyel= faktoriyel (sayi1-sayi2);
        return (sayi1Faktoriyel / sayi1FarkSayi2Faktoriyel);
    }
}
