
package tugaspraktikum3;

import java.util.Scanner;

public class TugasPraktikum3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama,alamat;
        int nilai;
        
        System.out.println("Pengecekan Nilai");
        System.out.print("Masukkan Nama Anda   : ");
        nama = input.next();
        System.out.print("Masukkan Alamat Anda : ");
        alamat = input.next();
        System.out.print("Masukkan Nilai  anda : ");
        nilai = input.nextInt();
        
        System.out.println();
        System.out.println("Hasilnya ");
        System.out.println("Nama   = " +nama);
        System.out.println("Alamat = " +alamat);
        System.out.println("Nilai  = " +nilai);
        System.out.print("Pesan  = ");
        
        if(nilai>=80){
            System.out.println("Sangat Baik");
        }
        else if(nilai>=70) {
            System.out.println("Cukup Baik");
        }
        else if(nilai>=60) {
            System.out.println("Baik");
        }
        else if(nilai<=50) {
            System.out.println("Buruk");
        }
       
    }
    
}
