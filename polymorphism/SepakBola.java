
package polymorphism;


public class SepakBola {

    
    public static void main(String[] args) {
        Pemain pemain;
            Status status = new Status("Available", "Cristiano Ronaldo");
            Posisi posisi = new Posisi("Forward", "Cristiano Ronaldo");
            pemain = status;
            System.out.println("");
            pemain.panggilPemain();
    
    
            System.out.println("");
            pemain = posisi;
            pemain.panggilPemain();
    }
    
    
}
