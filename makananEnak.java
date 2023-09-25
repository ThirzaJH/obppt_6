class makananEnak {
    String nama;

    public makananEnak(String nama) {
        this.nama = nama;
    }

    public void jenis (){
        System.out.println("Makanan ini jenisnya: ");
    }
}

class Lemper extends makananEnak {
    public Lemper (String nama) {
        super(nama);
    }

    public void jenis (){
        System.out.println(nama + "Makanan ini jenisnya: tradisional");
    }
}

class Putu extends makananEnak{
    public Putu(String nama){
        super (nama);
    }

    @Override
    public void jenis() {
        System.out.println(nama + "Makanan ini jenisnya: tradisional");
    }
}