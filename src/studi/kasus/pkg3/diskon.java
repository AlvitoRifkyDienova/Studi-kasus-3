/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.pkg3;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class diskon {
    public static void main (String[] args){
        String[] laptop={"ASUS", "Lenovo", "Acer"};
          int [] harga={20000, 12000, 9000};
          int [] diskon={20000-(20000*10/100),12000-(12000*10/100),9000-(9000*10/100)};
           System.out.println("!!Diskon 10%!!");
          for (int i=0; i<laptop.length;i++){
            
               System.out.print(i+" Laptop "+laptop[i]+" dengan harga Rp."+harga[i]);
               System.out.println(" Diskon 10% menjadi Rp."+diskon[i]);
          }
               System.out.println("--Pilih nomor laptop yang anda inginkan--");
         Scanner input = new Scanner(System.in);
          int pilihan= input.nextInt();
          System.out.println("pilihan: "+laptop[pilihan]);
         System.out.println("Masukan uang: "); 
         int bayar= input.nextInt();
         
         if (bayar>harga[pilihan]){
              System.out.println("Kembalian: "+(bayar-diskon[pilihan]));
          }else if(bayar==harga[pilihan]){
              System.out.println("Uangnya pas");
          }
    }}

