abstract class Bentuk{
    public abstract double hitungluas();
    public void tampilkanInfo (){
        System.out.println("Ini adalah sebuah bentuk");
    }
}

class Lingkaran extends Bentuk {
    public double jarijari;

    public Lingkaran(double jarijari)
    {
        this.jarijari = jarijari;
    }
    @Override
    public double hitungluas (){
        return Math.PI * jarijari * jarijari;
    }
}

class persegi extends Bentuk {
    private double sisi;

    public persegi (double sisi){
        this.sisi = sisi;
    }
    @Override
    public double hitungluas (){
        return sisi * sisi;
    }
}

public class lari {
    public static void main (String[] args){
        Lingkaran Lingkaran = new Lingkaran(5.0);
        persegi persegi = new persegi (12.2);

        Lingkaran.tampilkanInfo();
        System.out.println("Luas lingkaran : " + Lingkaran.hitungluas());

        persegi.tampilkanInfo();
        System.out.println("Luas sisi : " + persegi.hitungluas());
    }
}