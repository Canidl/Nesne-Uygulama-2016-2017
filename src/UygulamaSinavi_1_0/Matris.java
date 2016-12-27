
package UygulamaSinavi_1_0;


import java.util.Scanner;
import UygulamaSinavi_1_1.*;

/**
 *
 * @author Battal Faik Aktaş
 */
public class Matris 
{
    public static void main(String[] args) 
    {
        
        MatrisIslemleri mi=new MatrisIslemleri();
     
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Matrisin Boyut Bilgilerini Giriniz");
        System.out.print("1. Matrisin Satır Sayısı :");
        int satir1 = scan.nextInt();
        System.out.print("1. Matrisin Sütün Sayısı :");
        int sutun1 = scan.nextInt();
        int[][] matris1 = new int[satir1][sutun1];
        
        System.out.println("2. Matrisin Boyut Bilgilerini Giriniz");
        System.out.print("2. Matrisin Satır Sayısı :");
        int satir2 = scan.nextInt();
        System.out.print("2. Matrisin Sütün Sayısı :");
        int sutun2 = scan.nextInt();
        int[][] matris2 = new int[satir2][sutun2];
        
        System.out.println("1. Matrisin İçersini Doldurunuz");
        
        for(i = 0; i < satir1; i++)
        {
            for(j = 0; j < sutun1; j++)
            {
                System.out.print("[" + (i + 1) +"]" + "[" + (j + 1) + "] " + "=" );
                int sayi = scan.nextInt();
                matris1[i][j] = sayi;
            }
        }
        
        System.out.println("2. Matrisin İçersini Doldurunuz");
        
        for(i = 0; i < satir2; i++)
        {
            for(j = 0; j < sutun2; j++)
            {
                System.out.print("[" + (i + 1) +"]" + "[" + (j + 1) + "] " + "=" );
                int sayi = scan.nextInt();
                matris2[i][j] = sayi;
            }
        }
        char secim=' ';

        while(secim != 'e')
        {
            System.out.println("Yapmak istediğiniz işlemi seçiniz\n"
                    + "t~Toplama\n"
                    + "c~Çıkarma\n"
                    + "f~Carpma\n"
                    + "e~Çıkış\n");
            secim=scan.next().charAt(0);
     
            switch(secim)
            {
                case 't':
                {
                    if(mi.matrisKontrol(matris1, matris2))
                    {
                      mi.ekranaYazdir(mi.toplama(matris1, matris2));
                      break;
                    }
                    else
                    {
                        System.out.println("Matris boyutları toplama işlemi için geçersiz.");
                        break;
                    }
                   
                }
                case 'c':
                {
                    if(mi.matrisKontrol(matris1, matris2))
                    {
                      mi.ekranaYazdir(mi.cikarma(matris1, matris2));
                      break;
                    }
                    else
                    {
                        System.out.println("Matris boyutları toplama işlemi için geçersiz.");
                        break;
                    }
                }
                case 'f':
                {
                    if(mi.matrisCarpmaKontrol(matris1, matris2))
                    {
                        mi.ekranaYazdir(mi.carpma(matris1, matris2));
                        break;
                    }
                    else
                    {
                        System.out.println("Matris boyutları çarpma işlemi için geçerli değil");
                        break;
                    }
                }
                case 'e':
                {
                  System.exit(0);
                  break;
                }
                default:
                {
                    System.out.println("Hatalı seçim!");
                    break;
                }
            }
        }
    }
}
