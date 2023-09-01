import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Lutfen cm degerini giriniz: ");
    int deger = scanner.nextInt();
    double feet = 30.48;
    double inch = 2.54;
    int bolum = deger / (int) feet; // donusum yaptim bu sayede sonuc int deger verecek. Kaybedilen veriler kalan oldugu icin bolum kismini ilgilendirmiyor.
    System.out.print("Sonuc: " + bolum + "' ");
    System.out.print((int)((deger + -(bolum * feet)) / inch + 0.5) + "\"");
  }
}
