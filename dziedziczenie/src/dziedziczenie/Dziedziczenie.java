package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie 
{
    public static void main(String[] args) 
    {
        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);
        
        Szkielet s = new Szkielet(5, 50, "Łuk"); 
        System.out.println(s.predkoscChodzenia);
        
        Zombie z = new Zombie();
        
    }
    
}
