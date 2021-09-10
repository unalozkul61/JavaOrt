import java.util.Scanner ;

public class test {
    public static void main(String[] args) {
        // Değişkenlerimi oluşturalım.
        int mat, fizik , kimya , turkce, tarih , muzik ;


        Scanner inp =  new Scanner(System.in);

        // Kullanıcıdan girdileri alalım :
        System.out.print("Matematik notu : ");
        mat = inp.nextInt();

        System.out.print("Fizik notu :");
        fizik = inp.nextInt();

        System.out.print("Kimya notu : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notu : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notu : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notu :");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam /6;
        System.out.println("Ortalamanız : "+sonuc);

        Boolean kosul = sonuc>=60;
        System.out.println("Durum : "+(kosul==true?"geçti":"Kaldı"));






    }
}
