import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik Notunuz : ");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = scanner.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = scanner.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = scanner.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = scanner.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = scanner.nextInt();

        int ortalama = mat + fizik + kimya + turkce + tarih + muzik;

        System.out.println("Genel Not Ortalamanız : " + ortalama / 6);

        int ort = ortalama / 6;

        if (ort >= 60)
        {
            System.out.println("Sınıfı Geçtiniz");
        }else
        {
            System.out.println("Sınıfta Kaldınız");
        }
        
        

    }
}
