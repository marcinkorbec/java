package butelka;
 
public class Butelka {
    private double ileLitrow;
 
    Butelka(double ileLitrow)
        {
            this.ileLitrow = ileLitrow;
        }
 
    double getIleLitrow()
        {
            return ileLitrow;
        }
    
    boolean wlej(double ilosc)
    {
        if (ilosc > ileLitrow)
        this.ileLitrow += ilosc;
        else 
        System.out.println("za duzo"); 
        return true;
    }
    
    boolean wylej (double ilosc)
    {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else return false;
        
        return true;
        
    }
    
    boolean przelej(double ilosc, Butelka gdziePrzelac)
    {                
        
            this.wylej(ilosc);            
        if (ilosc > ileLitrow) 
            gdziePrzelac.wlej(ilosc);
        
        return false; 
       
    }
 
public static void main(String[] args) {
    Butelka[] butelka = new Butelka[3];
 
    butelka[0] = new Butelka(5);
    butelka[1] = new Butelka(8);
    butelka[2] = new Butelka(10);
    
   
    butelka[0].wlej(4);
    butelka[0].przelej(4, butelka[1]);
    //butelka[1].przelej(2, butelka[0]);
    //butelka[2].przelej(9, butelka[1]);
            
    System.out.println(butelka[0].getIleLitrow());
    System.out.println(butelka[1].getIleLitrow());
    System.out.println(butelka[2].getIleLitrow());
 
    
    
    //System.out.println(butelka[0].getIleLitrow());
    
    
    }
 
}