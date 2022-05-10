
package overriding;


public class Avangers {
    String name;

    public void display(){   
        System.out.println("Avangers");
        System.out.println("Avangers name: " + this.name);
    }

     public static void main(String[] args) {
        Avangers avangers1 = new Avangers();
        avangers1.name = "Iron Man";
        avangers1.display();
        
        AvangersStrength avangers2 = new AvangersStrength();
        avangers2.name = "Captain America";
        avangers2.defencePower = "100";
        avangers2.display();
    }
}

class AvangersStrength extends Avangers {
    String name;
    String defencePower;
    
     public void display(){
        System.out.println("\nAvangers Strength");
        System.out.println("Avangers name: " + this.name);
        System.out.println("Defence Power: " + this.defencePower);
    }
}     
     
