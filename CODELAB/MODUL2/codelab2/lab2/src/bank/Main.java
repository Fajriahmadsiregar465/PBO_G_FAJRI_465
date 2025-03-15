package bank;

public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202010370311465", "Fajri", 999999999);
        RekeningBank rekening2 = new RekeningBank("202310730311307", "Amelia", 1000000);


        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();


        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);


        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
