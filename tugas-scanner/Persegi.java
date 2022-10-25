package b_Project;
import java.util.Scanner;
public class Persegi {
    public static void main(String[] args) {
    System.out.println("Menghitung luas persegi");
    Scanner masukan = new Scanner(System.in);
    System.out.println("masukan nilai sisi : ");
       int sisi = masukan.nextInt();
       int luas = sisi * sisi;
    System.out.println("Hasil luas persegi adalah : " +luas);
    
    System.out.println("\nMenghitung keliling  persegi");
    Scanner inputan = new Scanner(System.in);
    System.out.println("masukan nilai sisi : ");
       int keliling1 = inputan.nextInt();
       int keliling = 4*keliling1;
    System.out.println("Hasil keliling persegi adalah : " +keliling);
    
    }
}
