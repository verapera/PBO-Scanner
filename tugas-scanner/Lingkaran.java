package b_Project;
import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
    System.out.println("Menghitung luas lingkaran");
    Scanner masukan = new Scanner(System.in);
    double luas, phi= 3.14;
    int r;
    System.out.println("masukan jari-jari:");
    r=masukan.nextInt(); 
    luas = phi*r*r;
    System.out.println("Hasil luas lingkaran adalah : " +luas);
    
    System.out.println("\nMenghitung keliling lingkaran");
    Scanner inputan = new Scanner(System.in);
    double keliling, nilaiphi= 3.14;
    int jarijari;
    System.out.println("masukan jarijari:");
    r=inputan.nextInt(); 
    keliling = 2*nilaiphi*r;
    System.out.println("Hasil keliling lingkaran adalah : " +keliling);
    }
    
}
