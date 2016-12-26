
package UygulamaSinavi_1_1;

import UygulamaSinavi_1_0.Matris;

/**
 *
 * @author Battal Faik Aktaş
 */
public class MatrisIslemleri 
     
{
    
    public boolean  matrisKontrol(int matris1[][],int matris2[][])
    {
        boolean donecek=false;
        if(matris1.length == matris2.length && matris1[1].length == matris2[1].length)
            donecek=true;
        return donecek;
    }

    public int[][] toplama(int matris1[][],int matris2[][])
    {
        int sonuc[][] = new int[matris1.length][matris1[1].length];
        for(int i = 0; i < matris1.length; i++)
        {
            for(int j = 0; j < matris1[1].length; j++)
            {
                sonuc[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
        return sonuc;
       
    }
     public int[][] cikarma(int matris1[][],int matris2[][])
    {
        
        int sonuc[][] = new int[matris1.length][matris1[1].length];
        for(int i = 0; i < matris1.length; i++)
        {
            for(int j = 0; j < matris1[1].length; j++)
            {
                sonuc[i][j] = matris1[i][j] - matris2[i][j];
            }
        }
        return sonuc;
       
    }
     
     public boolean  matrisCarpmaKontrol(int matris1[][],int matris2[][])
    {
        boolean donecek = false;
        if( matris1[1].length == matris2.length)
            donecek = true;
        return donecek;
    }
     
     public int[][] carpma(int matris1[][],int matris2[][])
     {
        int sonuc[][] = new int[matris1.length][matris2[1].length];
        int toplam = 0;
        for(int i = 0; i < matris1.length; i++)
        {
            for(int j = 0; j < matris2[1].length; j++)
            {
                toplam = 0;
                for(int k = 0; k < matris1[1].length; k++)
                {
                    toplam += matris1[i][k] * matris2[k][j];
                }
                sonuc[i][j] = toplam;
            }
        }
        return sonuc;
     }
     
     public void ekranaYazdir(int matris1[][])
     {
         for(int i = 0; i < matris1.length; i++)
         {
             for(int j = 0;j < matris1[1].length; j++)
             {
                 System.out.print(matris1[i][j] + "\t");
             }
             System.out.print("\n");
         }
     }
}
    