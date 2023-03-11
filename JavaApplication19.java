
package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        int sayi,basamaksayisi=0;
        int basamakdegeri,pow,top=0;
        
        System.out.println("sayiyi girin:");
        sayi=input.nextInt();
        
        while(sayi!=0){
            sayi/=10;
            basamaksayisi++;
        }
        int nextnumber=sayi;
        while(nextnumber!=0){
            basamakdegeri=nextnumber%10;
            pow=1;
            for(int i=1;i<=basamaksayisi;i++){
                pow*=basamakdegeri;
            }
            top+=pow;
            nextnumber/=10;
        }
        if(nextnumber!=sayi){
            System.out.println("sayi amstrong degil");
        }
        else{
            System.out.println(" sayi amstrong");
        }
        
    }
}
