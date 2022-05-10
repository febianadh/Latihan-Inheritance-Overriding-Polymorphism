
package polymorphism;


public class Posisi extends Pemain {
    public String Posisi_pemain;

    public Posisi(String Posisi_pemain, String nama_pemain) {
        super(nama_pemain);
        this.Posisi_pemain = Posisi_pemain;
    }

    @Override
    public void panggilPemain() {
         System.out.println("Nama Pemain : " + super.nama_pemain);
         System.out.println("Posisi Pemain : " + Posisi_pemain);
    }
    
    
    
}
