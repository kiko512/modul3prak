
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Kacung tesla, alfa;
        tesla = new Kacung();
        alfa = new Kacung();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Kacung");
        System.out.print("Nama: ");
        tesla.setNama(input.nextLine());
        System.out.print("NIP: ");
        tesla.setNip(input.nextLine());
        System.out.print("Alamat: ");
        tesla.setAlamat(input.nextLine());
        tesla.setTotalGaji(7, 2500000);
        tesla.cetakKeLayar();
        System.out.println();
        System.out.print("Nama: ");
        alfa.setNama(input.nextLine());
        System.out.print("NIP: ");
        alfa.setNip(input.nextLine());
        System.out.print("Alamat: ");
        alfa.setAlamat(input.nextLine());
        alfa.setTotalGaji(3000000);
        alfa.cetakKeLayar();
    }
}