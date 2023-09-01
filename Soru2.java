import java.util.Scanner;
public class Soru2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Lutfen iki tane tam sayi giriniz: "); // Ilk istenen sekilde % kullanarak yapilan cozum.
    int sayi1 = scanner.nextInt();
    int sayi2 = scanner.nextInt();
    System.out.println("Bolum: " + sayi1 / sayi2);
    System.out.println("Kalan: " + sayi1 % sayi2);

    System.out.print("Lutfen iki tane tam sayi giriniz: "); // 2. cozum icin bolunen sayidan bolum ile bolen sayinin birnirine bolumunu bolen sayi ile carparak sonuca ulasiriz.
    sayi1 = scanner.nextInt();
    sayi2 = scanner.nextInt();
    System.out.println("Bolum: " + sayi1 / sayi2);
    System.out.println("Kalan: " + (sayi1 - (sayi2 * (sayi1 / sayi2))));

  }
}
