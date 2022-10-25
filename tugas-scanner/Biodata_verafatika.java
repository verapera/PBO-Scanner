package a_Biodata;
import java.util.Scanner;
public class Biodata_verafatika {
    public static void main(String[] args) {
//        mendeklarasikan variable
        Scanner input = new Scanner(System.in);
        String nama, alamat, sekolah, hobi, nisn, notlp;
//        membuat inputan
        System.out.println("Masukan Nama:");
        nama = input.nextLine();
        System.out.println("Masukan Nisn:");
        nisn = input.nextLine();
        System.out.println("Masukan Alamat:");
        alamat = input.nextLine();
        System.out.println("Masukan Sekolah:");
        sekolah = input.nextLine();
        System.out.println("Masukan Hobi:");
        hobi = input.nextLine();
        System.out.println("Masukan Nomor Telepon:");
        notlp = input.nextLine();
//        menampilkan output
        System.out.println("Nama : " + nama);
        System.out.println("Nisn : " + nisn);
        System.out.println("Alamat : " + alamat);
        System.out.println("Sekolah : " + sekolah);
        System.out.println("Hobi : " + hobi);
        System.out.println("Nomor Telepon : " + notlp);
        
    }
}
