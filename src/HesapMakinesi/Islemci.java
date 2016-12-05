package HesapMakinesi;

/**
 *
 * @author Battal Faik Aktaş
 */
public class Islemci 
{
    public double Topla(double sayi1, double sayi2)
    {
        return sayi1 + sayi2;
    }
    public double Cikar(double sayi1, double sayi2)
    {
        return sayi1 - sayi2;
    }
    public double Bolme(double sayi1, double sayi2)
    {
        if(sayi2 == 0)
            return 0;
        return sayi1 / sayi2;
    }
    public double Carpma(double sayi1, double sayi2)
    {
        return sayi1 * sayi2;
    }
}
