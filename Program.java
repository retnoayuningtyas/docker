/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        int menu, bil1,bil2,bil3;       
        char pilih;
           
        
        System.out.println("Pilihan Bilangan");
        System.out.println(" 1. Bilangan Terkecil");
        System.out.println(" 2. Bilangan Terbesar");
        
        System.out.print("Masukkan Bilangan ke 1 : ");
        bil1=sc.nextInt();
        System.out.print("Masukkan Bilangan ke 2 : ");
        bil2=sc.nextInt();
        System.out.print("Masukkan Bilangan ke 3 : ");
        bil3=sc.nextInt();
        
        System.out.print("Menu : ");
        menu= sc.nextInt();
        if(bil1 >= 1 && bil1<=100 && bil2 >= 1 && bil2<=100 && bil3 >= 1 && bil3<=100){
            switch(menu){
                case 1 :
                    if(bil1 < bil2 && bil1 < bil3){
                        System.out.println("Bilangan Terkecil : " + bil1);
                    }else if( bil2 < bil1 && bil2 < bil3) {
                        System.out.println("Bilangan Terkecil : " + bil2);
                    }else {
                        System.out.println("Bilangan Terkecil : " + bil3);
                    }
                    break;
                case 2 :
                    if(bil1 > bil2 && bil1 > bil3){
                        System.out.println("Bilangan Terbesar : " + bil1);
                    }else if( bil2 > bil1 && bil2 > bil3) {
                        System.out.println("Bilangan Terbesar : " + bil2);
                    }else {
                        System.out.println("Bilangan Terbesar : " + bil3);
                    }
                    break; 
                default:
                    System.out.println("Salah");
            }       
        }else{
            System.out.println("Maaf Bilangan yang diinputkan harus diantara 1-100");
        }
    }
}
