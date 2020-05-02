package dziedziczenie.potwory;


public class Potwor {
   public double predkoscChodzenia = 10;
   public double zywotnosc;
    
   public void atakuj()
    {
        /*
        
        */
        
        System.out.println("To jest metoda atakuj z klasy potwor");
    }
    
   public Potwor()
   {
       
   }
   
   public Potwor(double predkoscChodzenia, double zywotnosc)
   {
       this.predkoscChodzenia = predkoscChodzenia;
       this.zywotnosc = zywotnosc;
   }
}
