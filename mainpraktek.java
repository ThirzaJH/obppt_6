import org.w3c.dom.ls.LSOutput;

public class mainpraktek {
    public static void main(String[] args) {
        praktek obp = new praktek();
        obp.setNama ("thirza");
        obp.setNIM("825220139");
        obp.setMataKuliah("object based programming");

        System.out.println("Coolyeah");;
        System.out.println("Nama: " + obp.getNama());
        System.out.println("NIM: " + obp.getNIM());
        System.out.println("MataKuliah: " + obp.getMataKuliah());
    }

}
