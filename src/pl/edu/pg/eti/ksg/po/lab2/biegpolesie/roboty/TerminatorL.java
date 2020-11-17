/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty;

import java.util.Random;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;

/**
 *
 * @author lukaszgolojuch
 */
public class TerminatorL extends Terminator{
    
    public TerminatorL(String model, int numerSeryjny) {
        super(model, numerSeryjny);
    }
    
    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        if(RodzajTerenu.NISKI_LAS.equals(rodzajTerenu))
        {
            komunikuj("Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            return czynnikiLosowe.nextDouble()*0.2 + 1.0; //Od 0.2 do 0.4
        }
        else
            return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);

    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinazadania) {
        int c;
        Random t = new Random();
        // random integers in [0, 100]
        c=t.nextInt(100);
        
        if(DziedzinaZadania.NAUKI_LESNE.equals(dziedzinazadania) && c<=60.0)
            {
                return true;
            }
        else
            {
                return super.rozwiazZadanie(dziedzinazadania); 
            }
    }
}
