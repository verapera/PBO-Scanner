package b_Project;
import java.util.Scanner;
public class persegiPanjang {
    public static void main(String[] args) {
        System.out.println("Menghitung luas persegi panjang");
        Scanner masukan = new Scanner(System.in);
        System.out.println("masukan nilai panjang : ");
          int panjang = masukan.nextInt();
        System.out.println("masukan nilai lebar : ");
          int lebar = masukan.nextInt();
          int luas = panjang * lebar;
        System.out.println("Hasil luas persegi panjang adalah :" +luas);
        
        System.out.println("\nMenghitung keliling persegi panjang");
        Scanner inputan = new Scanner(System.in);
        System.out.println("masukan nilai panjang :");
          int panjang1 = inputan.nextInt();
        System.out.println("masukan nilai lebar :");
          int lebar1 = inputan.nextInt();
          int keliling = 2*(panjang1+lebar1);
        System.out.println("Hasilnya keliling persegi panjang adalah :" +keliling);
        
        
        
    }
}
