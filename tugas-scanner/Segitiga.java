package b_Project;
import java.util.Scanner;
public class Segitiga {
    public static void main(String[] args) {
    System.out.println("Menghitung luas segitiga");
    Scanner masukan = new Scanner(System.in);
    System.out.println("masukan nilai alas : ");
       double alas = masukan.nextInt();
    System.out.println("masukan nilai tinggi : ");
       double tinggi = masukan.nextInt();
       double luas = 0.5 * alas * tinggi;
    System.out.println("Hasil luas segitiga adalah : " +luas);
    
    System.out.println("\nMenghitung keliling segitiga sama sisi");
    Scanner inputan = new Scanner(System.in);
    System.out.println("masukan nilai sisi : ");
       int sisi = inputan.nextInt();
       int keliling = sisi * 3;
    System.out.println("Hasil keliling segitiga adalah : " +keliling);
    }
}
