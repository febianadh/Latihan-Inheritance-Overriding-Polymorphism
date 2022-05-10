
package inheritance;
    class mobil{
        public mobil(){
            System.out.println("Class mobil");
        }
        
        public void typemobil(){
            System.out.println("Type Kendaraan : Mobil");
        }
    }
    
    class Honda{
        public Honda(){
            System.out.println("Class Honda");
        }  
    
        public void brand(){
            System.out.println("Brand : Honda");
        }

        public void kecepatan(){
            System.out.println("Max : 240 Km/jam"); 
        }
    }


public class Civic extends Honda{
    public Civic(){
        System.out.println("Type Honda : Civic");
    }
    
    public void typemobil(){
            System.out.println("Type Kendaraan : Mobil");
        }
    
    public void kecepatan(){
        System.out.println("Max : 200 Km/jam");
        
    }
    
    
    public static void main(String[] args) {
        Civic obj1 = new Civic();
        obj1.typemobil();
        obj1.brand();
        obj1.kecepatan();
    }
}

