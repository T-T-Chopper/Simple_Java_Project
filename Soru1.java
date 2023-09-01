import java.util.Scanner;
public class Soru1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lutfen not bilgilerini giriniz:");
    char deger1 = scanner.next().charAt(0); // Girilen girdinin direkt ilk karakterini istenen char'a atanir.
    int kredi1 = scanner.nextInt(); //Gelen ilk int sayi atamasi yapilir.
    char deger2 = scanner.next().charAt(0);
    int kredi2 = scanner.nextInt();
    char deger3 = scanner.next().charAt(0);
    int kredi3 = scanner.nextInt();

    int asciideger1 = 69 - deger1;
    int asciideger2 = 69 - deger2;
    int asciideger3 = 69 - deger3;

    //Sayilardan 69 sayisini cikardigimiz zaman Ascii degeri 
    //A = 65, B = 66, C = 67, D = 68 degerleri sirasi ile 4,3,2,1 olarak sabitlenir.

    System.out.println("Agirlikli not ortalamasi: " + (kredi1 * asciideger1 + kredi2 * asciideger2 + kredi3 * asciideger3) / (double)(kredi1 + kredi2 + kredi3));

  }
}
