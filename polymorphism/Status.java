
package polymorphism;


public class Status extends Pemain {
    public String status_pemain;

    public Status(String status_pemain, String nama_pemain) {
        super(nama_pemain);
        this.status_pemain = status_pemain;
    }

    @Override
    public void panggilPemain() {
         System.out.println("Nama Pemain : " + super.nama_pemain);
         System.out.println("Status Pemain : " + status_pemain);
    }
 
    
    
    
}
