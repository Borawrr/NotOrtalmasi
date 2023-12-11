import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = scanner.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = scanner.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = scanner.nextInt();

        int ortalama = mat + fizik + kimya + turkce + tarih + muzik;

        System.out.println("Genel Not Ortalamanız : " + ortalama / 6);

        int ort = ortalama / 6;

        if (ort >= 60)
        {
            System.out.print("Sınıfı Geçtiniz !");
        }else
        {
            System.out.print("Sınıfta Kaldınız !");
        }
        
        

    }
}
