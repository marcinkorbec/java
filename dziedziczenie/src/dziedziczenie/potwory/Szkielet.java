package dziedziczenie.potwory;


public class Szkielet extends Potwor
{
    String typBroni;
    public Szkielet()
    {
        System.out.println("Domyślny konstruktor z klasy Szkielet");
    }
    
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
    {        
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyślny konstruktor z klasy Szkielet");
    }

//    public Szkielet(int i, int i0) 
//    {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
